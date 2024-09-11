package org.travel.karate;

import com.intuit.karate.junit5.Karate;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class KarateApplicationTests {

    @Test
    void contextLoads() {
    }

    @Karate.Test
    Karate testAll() {
        // Ensure that the path points to the feature file in resources
        return Karate.run("classpath:org/travel/karate/test.feature");
    }

    @Karate.Test
    Karate testHiController() {
        return Karate.run("classpath:org/travel/karate/test.feature")
                .configDir("classpath:karate-config.js");
    }

}
