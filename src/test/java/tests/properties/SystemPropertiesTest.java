package tests.properties;

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

    }
}
