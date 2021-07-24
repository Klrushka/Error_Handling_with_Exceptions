package task10;

public class FGMethodsClass {
    public void f() throws Exception{
        try {
            g();
        } catch (Exception e){
            System.out.println("f() catch g()");
            throw new Exception("FGMethodClass.f() exception");
        }
    }

    public void g() throws Exception{
        throw new Exception("FGMethodClass.g() exception");
    }
}
