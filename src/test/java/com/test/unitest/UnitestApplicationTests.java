package com.test.unitest;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;

import static org.junit.jupiter.api.Assertions.*;

@SpringBootTest
class UnitestApplicationTests {

    DemoUtils demoUtils;

    @BeforeEach
    void setupBeforeEach(){
        demoUtils = new DemoUtils();
        System.out.println("@BeforeEach execuation before the excution of each test method");
    }
    @AfterEach
    void tearDownAfterEach(){
        System.out.println("Running @AfterEach");
        System.out.println();
    }

    @Test
    void testEqualsAndNotEquals(){
        assertEquals(6,demoUtils.add(2,4),"2+4 must be 6");
        assertNotEquals(6,demoUtils.add(1,9),"1+9 not be 6");
    }
    @Test
    void testNullAndNotNull(){
        String str1 = null;
        String str2 = "luv2code";

        assertNull(demoUtils.checkNull(str1),"object should be null");
        assertNotNull(demoUtils.checkNull(str2),"Object should not be null");
    }

}
