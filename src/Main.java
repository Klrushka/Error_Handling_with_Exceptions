import task1.ClassWithException;
import task10.FGMethodsClass;
import task2.NullClass;
import task9.AllExceptions;
import task9.Exception3;

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

        System.out.println();


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
        Exercise 9: (2) Create three new types of exceptions. Write a class with a method that
        throws all three. In main( ), call the method but only use a single catch clause that will
        catch all three types of exceptions.
         */


        try {
            AllExceptions.trowAllExceptions(1);
            AllExceptions.trowAllExceptions(2);
            AllExceptions.trowAllExceptions(3);
        } catch (Exception e){
            e.printStackTrace();
        }

        System.out.println();
        /*
        Exercise 10: (2) Create a class with two methods, f( ) and g( ). In g( ), throw an
        exception of a new type that you define. In f( ), call g( ), catch its exception and, in the catch
        clause, throw a different exception (of a second type that you define). Test your code in
        main( ).
         */


        FGMethodsClass fgMethodsClass = new FGMethodsClass();

        try {
            fgMethodsClass.g();
        } catch (Exception e){
            e.printStackTrace();
        }


        try{
            fgMethodsClass.f();
        } catch (Exception e){
            e.printStackTrace();
        }


        /*

         */









    }
}
