import task1.ClassWithException;
import task10.FGMethodsClass;
import task2.NullClass;
import task20.*;
import task25.*;
import task9.AllExceptions;


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
        } catch (Exception e) {
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
        } catch (Exception e) {
            e.printStackTrace();
        }


        try {
            fgMethodsClass.f();
        } catch (Exception e) {
            e.printStackTrace();
        }

        System.out.println();


        /*
        Exercise 13: (2) Modify Exercise 9 by adding a finally clause. Verify that your finally
        clause is executed, even if a NullPointerException is thrown.

        ************************************** task9 *********************************************
         */


        try {
            System.out.println(nullClass.toString());
        } catch (NullPointerException e) {
            System.out.println("Have exception");
            e.printStackTrace();
        } finally {
            if (nullClass == null) {
                System.out.println("nullClass == null");
            }
        }


        /*
        Exercise 20: (3) Modify StormyInning.java by adding an UmpireArgument
        exception type and methods that throw this exception. Test the modified hierarchy.
         */


        try {
            StormyInning si = new StormyInning();
            si.atBat();
        } catch (PopFoul e) {
            System.out.println("Pop foul");
        } catch (Loose e) {
            System.out.println("loose");
        } catch (UmpireArgument e) {
            System.out.println("UmpireArgument");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }


        // Strike not thrown in derived version.

        try {
            // What happens if you upcast?
            Inning i = new StormyInning();
            i.atBat();
            // You must catch the exceptions from the
            // base-class version of the method:
        } catch (Strike e) {
            System.out.println("Strike");
        } catch (Foul e) {
            System.out.println("Foul");
        } catch (Loose e) {
            System.out.println("loose");
        } catch (RainedOut e) {
            System.out.println("Rained out");
        } catch (BaseballException e) {
            System.out.println("Generic baseball exception");
        }

        System.out.println();

    /*
    Exercise 25: (2) Create a three-level hierarchy of exceptions. Now create a base-class A
    with a method that throws an exception at the base of your hierarchy. Inherit B from A and
    override the method so it throws an exception at level two of your hierarchy. Repeat by
    inheriting class C from B. In main( ), create a C and upcast it to A, then call the method
     */

        A a = new C();


        try {
            a.a();
        } catch (ThirdException e){
            System.out.println("First");
        } catch (SecondException e) {
            System.out.println("Second");
        } catch (FirstException e){
            System.out.println("Third");
        }

        /*
        Exercise 29: (1) Modify all the exception types in Stormylnning.java so that they
        extend RuntimeException, and show that no exception specifications or try blocks are
        necessary. Remove the ‘//!’ comments and show how the methods can be compiled without
        specifications.
         */


        task29.StormyInning stormyInning = new task29.StormyInning();

        stormyInning.atBat();

        task29.Inning inning = new task29.StormyInning();
        inning.atBat();











    }



}
