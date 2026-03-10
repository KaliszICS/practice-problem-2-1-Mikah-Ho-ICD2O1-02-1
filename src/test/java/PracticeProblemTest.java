import static org.junit.jupiter.api.Assertions.*;
import org.junit.jupiter.api.*;
import java.io.*;
import java.lang.reflect.Method;

public class PracticeProblemTest {

    @Test
    @DisplayName("sum: 2 + 3 = 5")
    void sumTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("sum", cArg);
            assertEquals(5, (int) method.invoke(null, 2, 3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("sum: -1 + 1 = 0")
    void sumTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("sum", cArg);
            assertEquals(0, (int) method.invoke(null, -1, 1));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("sum: -5 + -3 = -8")
    void sumTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("sum", cArg);
            assertEquals(-8, (int) method.invoke(null, -5, -3));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("sum: 0 + 0 = 0")
    void sumTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("sum", cArg);
            assertEquals(0, (int) method.invoke(null, 0, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    // ==================== difference Tests ====================

    @Test
    @DisplayName("difference: 10 - 4 = 6")
    void differenceTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("difference", cArg);
            assertEquals(6, (int) method.invoke(null, 10, 4));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("difference: 3 - 9 = -6")
    void differenceTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("difference", cArg);
            assertEquals(-6, (int) method.invoke(null, 3, 9));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("difference: -4 - -6 = 2")
    void differenceTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("difference", cArg);
            assertEquals(2, (int) method.invoke(null, -4, -6));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("difference: 0 - 0 = 0")
    void differenceTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { int.class, int.class };
            Method method = testClass.getDeclaredMethod("difference", cArg);
            assertEquals(0, (int) method.invoke(null, 0, 0));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    // ==================== product Tests ====================

    @Test
    @DisplayName("product: 2.5 * 4.0 = 10.0")
    void productTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double.class };
            Method method = testClass.getDeclaredMethod("product", cArg);
            assertEquals(10.0, (double) method.invoke(null, 2.5, 4.0), 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("product: -3.0 * 2.0 = -6.0")
    void productTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double.class };
            Method method = testClass.getDeclaredMethod("product", cArg);
            assertEquals(-6.0, (double) method.invoke(null, -3.0, 2.0), 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("product: 0.0 * 99.9 = 0.0")
    void productTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double.class };
            Method method = testClass.getDeclaredMethod("product", cArg);
            assertEquals(0.0, (double) method.invoke(null, 0.0, 99.9), 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("product: -2.5 * -4.0 = 10.0")
    void productTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { double.class, double.class };
            Method method = testClass.getDeclaredMethod("product", cArg);
            assertEquals(10.0, (double) method.invoke(null, -2.5, -4.0), 0.0001);
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    // ==================== removeFirst Tests ====================

    @Test
    @DisplayName("removeFirst: \"hello\" -> \"ello\"")
    void removeFirstTest1() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("removeFirst", cArg);
            assertEquals("ello", (String) method.invoke(null, "hello"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("removeFirst: \"Java\" -> \"ava\"")
    void removeFirstTest2() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("removeFirst", cArg);
            assertEquals("ava", (String) method.invoke(null, "Java"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("removeFirst: \"a\" -> \"\"")
    void removeFirstTest3() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("removeFirst", cArg);
            assertEquals("", (String) method.invoke(null, "a"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }

    @Test
    @DisplayName("removeFirst: \"12345\" -> \"2345\"")
    void removeFirstTest4() {
        Class<?> testClass = PracticeProblem.class;
        try {
            Class[] cArg = { String.class };
            Method method = testClass.getDeclaredMethod("removeFirst", cArg);
            assertEquals("2345", (String) method.invoke(null, "12345"));
        } catch (NoSuchMethodException e) {
            fail("Method does not exist");
        } catch (Exception e) {
            fail("Something weird happened");
        }
    }
}

