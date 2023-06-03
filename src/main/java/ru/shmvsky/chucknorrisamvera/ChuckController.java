package ru.shmvsky.chucknorrisamvera;

import com.github.javafaker.Faker;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/chuck-norris")
public class ChuckController {

    private final Faker faker = new Faker();

    @GetMapping
    public Response getFact() {
        String fact = faker.chuckNorris().fact();
        return new Response(fact);
    }

}
