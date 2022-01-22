package tests;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertTrue;

public class SkippedTests {

    @Test
    @Disabled
    void tests0() {
        assertTrue(true);
    }

    @Test
    @Disabled("With my pleasure")
    void tests1() {
        assertTrue(true);
    }

    @Test
    @Disabled("With my will")
    void tests2() {
        assertTrue(true);
    }

    @Test
    @Disabled
    void tests3() {
        assertTrue(true);
    }

}
