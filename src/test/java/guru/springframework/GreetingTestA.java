package guru.springframework;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTestA {

    @Test
    void helloWorld() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        Greeting greeting = new Greeting();

        System.out.println(greeting.helloWorld("Adi"));
    }
}