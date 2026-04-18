package com.example.demo.bootstrap;

import com.example.demo.domain.InhousePart;
import com.example.demo.domain.OutsourcedPart;
import com.example.demo.domain.Part;
import com.example.demo.domain.Product;
import com.example.demo.repositories.InhousePartRepository;
import com.example.demo.repositories.OutsourcedPartRepository;
import com.example.demo.repositories.PartRepository;
import com.example.demo.repositories.ProductRepository;
import com.example.demo.service.*;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;

/**
 *
 *
 *
 *
 */
@Component
public class BootStrapData implements CommandLineRunner {

    private final PartRepository partRepository;
    private final ProductRepository productRepository;

    private final OutsourcedPartRepository outsourcedPartRepository;
    private final PartService partService;

    String[] partsArray = {"Wooden Boards", "Stackable Corner Sections",
            "Hose Nozzle", "Rubber Gasket",
            "Seed", "Soil", "Nutrients",
            "Stick Frames", "Mesh", "Door",
            "Trowel", "Hand Rake", "Weeder", "Pruner"};

    String[] productsArray = {"Raised Garden Bed", "Garden Hose", "Plants", "Greenhouse", "Gardening Toolkit"};

    public BootStrapData(PartRepository partRepository, ProductRepository productRepository, OutsourcedPartRepository outsourcedPartRepository, PartService partService) {
        this.partRepository = partRepository;
        this.productRepository = productRepository;
        this.outsourcedPartRepository=outsourcedPartRepository;
        this.partService = partService;
    }

    @Override
    public void run(String... args) throws Exception {

        productRepository.deleteAll();
        partRepository.deleteAll();
        outsourcedPartRepository.deleteAll();

        for (int i = 0; i < partsArray.length; i++){
            if (i == 1 || i == 2 || i == 8 || i == 9) {
                OutsourcedPart part = new OutsourcedPart();
                part.setName(partsArray[i]);
                part.setId(i + 10);
                part.setCompanyName("Company");
                part.setInv(50);
                part.setMinInv(5);
                part.setMaxInv(60);
                part.setPrice(15.0);
                partRepository.save(part);
            }
            else {
                InhousePart part = new InhousePart();
                part.setName(partsArray[i]);
                part.setId(i + 5);
                part.setInv(50);
                part.setMinInv(5);
                part.setMaxInv(60);
                part.setPrice(10.0);
                partRepository.save(part);
            }
        }

        for (int i = 0; i < productsArray.length; i++) {
            Product product = new Product();
            product.setName(productsArray[i]);
            product.setInv(20);
            product.setPrice(40.0);

            productRepository.save(product);
        }

        /*
        OutsourcedPart o= new OutsourcedPart();
        o.setCompanyName("Western Governors University");
        o.setName("out test");
        o.setInv(5);
        o.setMinInv(2);
        o.setMaxInv(20);
        o.setPrice(20.0);
        o.setId(100L);
        outsourcedPartRepository.save(o);
        OutsourcedPart thePart=null;
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            if(part.getName().equals("out test"))thePart=part;
        }

        System.out.println(thePart.getCompanyName());
        */
        List<OutsourcedPart> outsourcedParts=(List<OutsourcedPart>) outsourcedPartRepository.findAll();
        for(OutsourcedPart part:outsourcedParts){
            System.out.println(part.getName()+" "+part.getCompanyName());
        }

        /*
        Product bicycle= new Product("bicycle",100.0,15);
        Product unicycle= new Product("unicycle",100.0,15);
        productRepository.save(bicycle);
        productRepository.save(unicycle);
        */

        System.out.println("Started in Bootstrap");
        System.out.println("Number of Products"+productRepository.count());
        System.out.println(productRepository.findAll());
        System.out.println("Number of Parts"+partRepository.count());
        System.out.println(partRepository.findAll());

    }
}
