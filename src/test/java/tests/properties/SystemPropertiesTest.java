package tests.properties;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Tag;
import org.junit.jupiter.api.Test;

public class SystemPropertiesTest {

    @Test
    void someTestNull() {
        String someValue = System.getProperty("someKey");
        System.out.println(someValue);  //null
    }

    @Test
    void someTestRedValue() {
        System.setProperty("someKey", "red value");
        String someValue = System.getProperty("someKey");
        System.out.println(someValue);  //red value
    }

    @Test
    void someTestDefault() {
        String someValue = System.getProperty("someKey", "blue value");
        System.out.println(someValue);  //blue value


    }

    @Test
    void someTestBoolean() {
        Boolean someValue = Boolean.parseBoolean(
        System.getProperty("someKey", "true"));
        System.out.println(someValue);  //true

    }

    @Test
    @Tag("properties")
    void someTestBrowser() {
        String browser = System.getProperty("browser");
        System.out.println(browser);
        // gradle clean properties_tests
        // null

        // gradle clean properties_tests -Dbrowser=chrome
        // chrome

    }

    @Test
    @Tag("properties")
    void someTestProperties() {
        String browser = System.getProperty("browser", "chrome");
        String version = System.getProperty("version", "91");
        String browserSize = System.getProperty("browserSize", "300x300");

        System.out.println(browser);
        System.out.println(version);
        System.out.println(browserSize);
    }

//    @BeforeAll
//    static void setUp() {
//
//    }

    @Test
    @Tag("properties")
    void someTestPropertyMessage() {
        System.out.println("I want to say" + System.getProperty(" some text"));
    }

}
