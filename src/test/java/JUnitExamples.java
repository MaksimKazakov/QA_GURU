/*
https://habr.com/ru/articles/590607/
Туториал по JUnit 5
*/

import org.junit.jupiter.api.*;

public class JUnitExamples {
    @BeforeAll // будет запущен перед всеми тестовыми методами в тестовом классе. Этот метод должен быть статическим.
    static void beforeAll() {
        System.out.println("Here is beforeAll()");
    }

    @BeforeEach
        //будет запускаться перед каждым тестовым методом в тестовом классе.
    void beforeEach() {
        System.out.println("\tHere is beforeEach()");
    }

    @AfterEach
        //будет запускаться после каждого тестового метода в тестовом классе.
    void afterEach() {
        System.out.println("\tHere is afterEach()");
    }

    @Tag("DEV")
    @DisplayName("Annotation JUnit5") // Используется для предоставления любого настраиваемого отображаемого имени
    // для тестового класса или тестового метода
    @Test //используется, чтобы пометить метод как тест junit.
    void firstTest() {
        System.out.println("\t\tHere is firstTest()");
    }

    @Tag("PROD")
    @Test
    void secondTest() {
        System.out.println("\t\tHere is secondTest()");
    }

    @AfterAll //будет запущен после всех тестовых методов в тестовом классе. Этот метод должен быть статическим.
    static void afterAll() {
        System.out.println("Here is afterAll()");
    }
}
