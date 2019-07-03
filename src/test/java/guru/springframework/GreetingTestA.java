package guru.springframework;

import org.junit.jupiter.api.*;

import static org.junit.jupiter.api.Assertions.*;

class GreetingTestA {

    private Greeting greeting;

    @BeforeAll // static because junit requirements
    public static void beforeAClass() {
        System.out.println("I'm only call once");
    }

    @BeforeEach
    void setUp() {
        System.out.println("Before each");
        greeting = new Greeting();
    }

    @Test
    void helloWorld() {
        System.out.println(greeting.helloWorld());
    }

    @Test
    void helloWorld1() {
        System.out.println(greeting.helloWorld("Adi"));
    }

    @AfterEach
    void tearDown() {
        System.out.println("In after each");
    }

    @AfterAll // static because junit requirements
    public static void afterClass() {
        System.out.println("After I'm only call once");
    }

}