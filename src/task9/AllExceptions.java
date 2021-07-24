package task9;

public class AllExceptions {


    public static void trowAllExceptions (int i) throws Exception1,Exception2,Exception3{
        switch (i){
            case 1:
                throw new Exception1();
            case 2:
                throw new Exception2();
            case 3:
                throw new Exception3();
        }
    }
}
