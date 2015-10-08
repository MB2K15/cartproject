package pl.mb2k15;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.List;


@SpringBootApplication
public class PharmaStoreApplication {

    private static final Logger log = LoggerFactory.getLogger(PharmaStoreApplication.class);



    public static void main(String[] args) {
        SpringApplication.run(PharmaStoreApplication.class, args);


    }




    @Bean
    public CommandLineRunner demo(UserRepository repository , ProductRepository productRepository) {
        return (args) -> {

           repository.save(new UserModel("user", "root"));
            repository.save(new UserModel("root", "user1"));
            productRepository.save(new ProductModel("sdf" , "shsdjf" , 12 , 1 , "55.png"));
            productRepository.save(new ProductModel("dsfjksd" , "shsdsdfsdfjf" , 102 , 1 , "55.png"));
            productRepository.save(new ProductModel("dsffsdfjksd" , "shsdfsdsdfsdfjf" , 102 , 1 , "55.png"));
            productRepository.save(new ProductModel("cisnieniomierz" , "medyczne" , 125 , 1 , "medica.jpg"));

            List<UserModel> byUsrNameAndUsrPasswd = repository.findByUsrNameAndUsrPasswd("user", "root");
            log.info(byUsrNameAndUsrPasswd.toString());

            for (UserModel user : repository.findAll())
                log.info(user.toString());

        };
    }
}
