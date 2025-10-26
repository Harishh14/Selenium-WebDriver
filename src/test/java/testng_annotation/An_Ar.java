package testng_annotation;

import org.testng.Assert;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

public class An_Ar {

//    // ------------------ SUITE & TEST LEVEL ------------------
//    @BeforeSuite
//    public void beforeSuite() {
//        System.out.println("🔹 BeforeSuite - Executes once before all tests in the suite");
//    }
//
//    @AfterSuite
//    public void afterSuite() {
//        System.out.println("🔹 AfterSuite - Executes once after all tests in the suite");
//    }
//
//    @BeforeTest
//    public void beforeTest() {
//        System.out.println("🔹 BeforeTest - Executes before <test> tag in XML file");
//    }
//
//    @AfterTest
//    public void afterTest() {
//        System.out.println("🔹 AfterTest - Executes after <test> tag in XML file");
//    }
//
//    // ------------------ CLASS LEVEL ------------------
//    @BeforeClass
//    public void beforeClass() {
//        System.out.println("🔹 BeforeClass - Executes once before any test method in the class");
//    }
//
//    @AfterClass
//    public void afterClass() {
//        System.out.println("🔹 AfterClass - Executes once after all test methods in the class");
//    }
//
//    // ------------------ METHOD LEVEL ------------------
//    @BeforeMethod
//    public void beforeMethod() {
//        System.out.println("   ➡️ BeforeMethod - Executes before each @Test method");
//    }
//
//    @AfterMethod
//    public void afterMethod() {
//        System.out.println("   ➡️ AfterMethod - Executes after each @Test method\n");
//    }

    // ------------------ TEST CASES WITH ASSERTIONS ------------------
    @Test
    public void testEquals() {
        System.out.println("Running testEquals()");
        String expected = "Hello";
        String actual = "Hello";
        Assert.assertEquals(actual, expected, "❌ Values are not equal!");
    }

    @Test
    public void testTrueCondition() {
        System.out.println("Running testTrueCondition()");
        int a = 10;
        int b = 20;
        Assert.assertTrue(b > a, "❌ Condition failed: b is not greater than a");
    }

    @Test
    public void testFalseCondition() {
        System.out.println("Running testFalseCondition()");
        boolean status = false;
        Assert.assertFalse(status, "❌ Condition failed: status should be false");
    }

    @Test
    public void testNotNull() {
        System.out.println("Running testNotNull()");
        String name = "TestNG";
        Assert.assertNotNull(name, "❌ Object is null!");
    }

    @Test
    public void testNull() {
        System.out.println("Running testNull()");
        String value = null;
        Assert.assertNull(value, "❌ Object is not null!");
    }
}
