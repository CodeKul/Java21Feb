package polymorphism;

/**
 *
 * if one class have same method name with different number of argument
 */
public class MethodOverLoading {

    public void display(){
        System.out.println("In display");
    }


    public void display(int i){
        System.out.println("in display "+i);
    }

    public void display(int i,int j){
        System.out.println("in display "+i+j);
    }

    public static void main(String[] args) {
        MethodOverLoading obj = new MethodOverLoading();
       obj.display(1,3);
        obj.display(4);
        obj.display();
    }
}


