package week4.databaseex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;

@SpringBootApplication
@EntityScan(basePackages = {"week4.databaseex"})
public class DatabaseExApplication {

    public static void main(String[] args) {
        SpringApplication.run(DatabaseExApplication.class, args);
    }

}
