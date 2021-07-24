import task1.ClassWithException;
import task2.NullClass;

public class Main {
    public static void main(String[] args) {


        /*
        Exercise 1: (2) Create a class with a main() that throws an object of class Exception
        inside a try block. Give the constructor for Exception a String argument. Catch the
        exception inside a catch clause and print the String argument. Add a finally clause and
        print a message to prove you were there.
         */

        try {
            ClassWithException.ex();
        } catch (Exception e) {
            System.out.println("Caught it!");
            e.printStackTrace();
        } finally {
            System.out.println("Finally clause");
        }



        /*
        Exercise 2: (1) Define an object reference and initialize it to null. Try to call a method
        through this reference. Now wrap the code in a try-catch clause to catch the exception.
         */
        NullClass nullClass = null;

        try {
            System.out.println(nullClass.toString());
        } catch (NullPointerException e) {
            System.out.println("Have exception");
            e.printStackTrace();
        }

        /*

         */


    }
}
