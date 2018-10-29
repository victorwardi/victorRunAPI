package run.victor.api;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import run.victor.api.model.Author;

@SpringBootApplication
public class VictorRunApiApplication {

    Author a = new Author();


    public static void main(String[] args) {
        SpringApplication.run(VictorRunApiApplication.class, args);
    }
}
