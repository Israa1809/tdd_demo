import facade.Hello;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class HelloTest {

    @BeforeEach
    void setUp() {
    }

    @AfterEach
    void tearDown() {
    }


//Requirement 1
    @Test
    public void testHello1() {
        System.out.println("Method to say Hello1");
        Hello hello = new Hello();
        String actual = hello.sayHello(new String[]{"Israa"});
        String expected = "Hello, Israa";
        assertEquals(expected, actual);
    }

    //Requirement 2
//    @Test
//    public void testHello2() {
//        System.out.println("Method to say Hello2");
//        Hello hello = new Hello();
//        String actual = hello.sayHello(null);
//        String expected = "Hello, my friend";
//        assertEquals(expected, actual);
//    }

    //Requirement 3
    @Test
    public void testHello3() {
        System.out.println("Method to say Hello3");
        Hello hello = new Hello();
        String actual = hello.sayHello(new String[]{"JERRY"});
        String expected = "HELLO, JERRY";
        assertEquals(expected, actual);
    }

    @Test
    public void testHello4() {
        System.out.println("Method to say Hello4");
        Hello hello = new Hello();
        String actual = hello.sayHello(new String[]{"Jill","Jane"});
        String expected = "Hello, Jill and Jane";
        assertEquals(expected, actual);
    }

    @Test
    public void testHello5(){
        System.out.println("Method to say Hello5");
        Hello hello = new Hello();
        String actual = hello.sayHello(new String[]{"Jill","Jane","Jerry"});
        String expected = "Hello, Jill, Jane, and Jerry";
        assertEquals(expected, actual);
    }








}