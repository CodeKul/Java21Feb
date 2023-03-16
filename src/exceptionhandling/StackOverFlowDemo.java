package exceptionhandling;

public class StackOverFlowDemo {
    public static void main(String[] args) {
        StackOverFlowDemo obj = new StackOverFlowDemo();
        obj.rec(9);
    }

    public void rec(int i){
        if(i==0){
            return ;
        }else {
            rec(i);
        }
    }
}

