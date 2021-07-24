package task1;

public class ClassWithException extends Exception {
    ClassWithException(String str) {
        System.out.println(str);
    }

    public static void ex() throws ClassWithException {
        System.out.println("Throwing exception");
        throw new ClassWithException("Exception string");
    }


}
