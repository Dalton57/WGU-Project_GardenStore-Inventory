Part C:
    Prompt - Customize the HTML user interface for your customer's application.
             The user interface should include the shop name, the product names, and the names of the parts.

    File - mainscreen.html

    Line - 14, 19, 21, and 53

    Change - Swapped out template names to a Garden themed store names.


Part D:
    Prompt - Add an "About" page to the application to describe your chosen customer's company to web viewers
             And include navigation to and from the "About" page and the main screen.

    File - mainscreen.html

    Line - 20-21

    Change - Added a break to space out the text. Added an link to the "About" page.
             Aso added in "About.html" file for the web page and a "AboutController.java"
             file so the navigation would work.


Part E:
    prompt - Add a sample inventory appropriate for your chosen store to the application.
             You should have five parts and five products in your sample inventory and should
             not overwrite existing data in the database.

    File - N/A

    Line - N/A

    Change - Added 14 Parts and 5 Products to sample inventory database.


Part F:
    prompt - Add a "Buy Now" button to your product list. Your "Buy Now" button must meet each of the following parameters:
                - The "Buy Now" button must be next to the buttons that update and delete products.
                - The button should decrement the inventory of that product by one. It should not affect the inventory of any of the associated parts.
                - Display a message that indicates the success or failure of a purchase.

    File - mainscreen.html, AddProductController.java

    Line - mainscreen.html
                - 87
           AddProductController.java
                - 130-145

    Change - Added a link for the "Buy Now" button to the "AddProductController.java" file "buyProduct" section.
             Added a mapping in "AddProductController.java -> buyProduct" section for the "Buy Now" button to adjust inventory and return a SuccessfulPurchase or FailurePurchase html file.
             Added "SuccessfulPurchase.html" and "FailurePurchase.html" files.



Part G:
    prompt - Modify the parts to track maximum and minimum inventory by doing the following:
                - Add additional fields to the part entity for maximum and minimum inventory.
                - Modify the sample inventory to include the maximum and minimum fields.
                - Add to the inhousePartForm and OutsourcedPartForm forms additional text inputs for the inventory so the user can set the maximum and minimum values.
                - Rename the file the persistent storage is saved to.
                - Modify the code to enforce that the inventory is between or at the minimum and maximum value.

    File - Part.java, application.properties, InhousePartForm.html, OutsourcedPartForm.html, AddinhousePartController.java, AddOutsourcedPartController.java, BootStrapData.java

    line - Part.java
                - 32-35, 89-104
           application.properties
                - 6
           InhousePartForm.html
                - 24-29
           OutsourcedPartForm.html
                - 25-30
           AddinhousePartController.java
                - 45-48
           AddOutsourcedPartController.java
                - 46-49
           BootStrapData.java
                - 29, 35, 41-46, 52-53

    Change - Added Integers minInv and maxInv and made setters and getters methods for both Integers in Part.java
             Renamed Spring.datasource.url file to "homely-garden-inventory-db" in application.properties
             Added fields for Min Inventory and Max Inventory for Inhouse and Outsourced PartForms.html
             Added if statement when part inventory is below Min values and Max values in AddInhousePartController and AddOutsourcedPartController. Also added error messages if above maximum and below minimum.
             Add code for setting null values to 0 in Min and Max fields on forms to prevent errors.


Part H:
    prompt - Add validation for between or at the maximum and minimum fields. The validation must include the following:
            - Display error messages for low inventory when adding and updating parts if the inventory is less than the minimum number of parts.
            - Display error messages for low inventory when adding and updating products lowers the part inventory below the minimum.
            - Display error messages when adding and updating parts if the inventory is greater than the maximum.

    File - AddProductController.java

    Line - 81-102

    Change - Added and modify code to display error message when adding/updating products that is lower than part inventory minimum value.


Part I:
    prompt - Add at least two unit test for the maximum and minimum fields to the PartTest class in the test package.

    File - PartTest.java

    Line - 159-172

    Change - Added two test units for the maximum and minimum fields.


Part J:
    prompt - Remove the class files for any unused validators in order to clean your code.

    File - DeletePartValidator.java

    Line - N/A

    Change - Deleted validator file since it was unused in the project.


Revisions:
    prompt - N/A

    File - BootStrapData.java, DeletePartValidator.java

    Line - BootStrapData.java
                - 33-40
                - 52-87

    Change - In BootStrapData.java file. Code to clear then add Parts and Products to Repository with set values.
           - Undo the deletion of DeletePartValidator.java file.


Revisions v2:
    prompt - N/A

    File - DeletePartValidator.java, ValidDeletePart.java, and Part.java

    Line - N/A

    Change - Deleted DeletePartValidator.java, ValidDeletePart.java files, and @ValidDeletePart annotation from Part.java file to clean up the project.