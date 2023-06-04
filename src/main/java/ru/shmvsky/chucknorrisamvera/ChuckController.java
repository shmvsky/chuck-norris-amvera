package ru.shmvsky.chucknorrisamvera;

import com.github.javafaker.Faker;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuck-norris")
public class ChuckController {

    private final Faker faker = new Faker();
    private final Logger logger = LoggerFactory.getLogger(ChuckController.class);

    @GetMapping
    public Response getFact() {
        logger.trace("http://localhost:8080/chuck-norris visited!");
        String fact = faker.chuckNorris().fact();
        return new Response(fact);
    }

}
