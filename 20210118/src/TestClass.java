import java.util.*;
import java.io.*;
public class TestClass {

    private static void testMethod(){

        System.out.println("testMethod");

    }

    public static void main(String[] args) {

        ((TestClass)null).testMethod();
        ((TestClass)null).getCustomerInfo();

    }
    public static void getCustomerInfo() {

        try {

            // do something that may cause an Exception

        } catch (java.lang.Exception ex) {

            System.out.print("Exception!");

        }

    }
}
