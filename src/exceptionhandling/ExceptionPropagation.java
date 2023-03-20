package exceptionhandling;

public class ExceptionPropagation {

    public void a(){
        int i= 10/0;
    }

    public void b(){
        a();
    }

    public void c(){
        try {
            b();
        }catch (Exception e){
           e.printStackTrace();
        }
    }

    public static void main(String[] args) {
        ExceptionPropagation obj = new ExceptionPropagation();
        obj.c();
        System.out.println("Hii");
    }
}
