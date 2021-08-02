package task10;

public class FGMethodsClass {
    public void f() throws Task10ExceptionF{
        try {
            g();
        } catch (Task10ExceptionG e){
            System.out.println("f() catch g()");
            throw new Task10ExceptionF("FGMethodClass.f() exception");
        }
    }

    public void g() throws Task10ExceptionG{
        throw new Task10ExceptionG("FGMethodClass.g() exception");
    }
}
