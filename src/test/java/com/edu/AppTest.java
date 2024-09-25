package com.edu;

import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
import static org.junit.jupiter.api.Assertions.assertTrue;

@SpringBootTest
public class AppTest {

    @Test
    public void testApp() {
        System.out.println("class AppTest; method testApp()");
        assertTrue(true);
    }
}
