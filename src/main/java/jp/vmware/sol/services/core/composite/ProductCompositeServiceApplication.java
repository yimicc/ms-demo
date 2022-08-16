package jp.vmware.sol.services.core.composite;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

@SpringBootApplication
@ComponentScan("jp.vmware.sol")
public class ProductCompositeServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(ProductCompositeServiceApplication.class, args);
    }

}
