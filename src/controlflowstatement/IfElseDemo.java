package controlflowstatement;

public class IfElseDemo {
    public static void main(String[] args) {

        int age = 20;

        String nationality ="India";

        if(nationality=="India"){
            if(age>=18){
                System.out.println("you can vote");
            }else {
                System.out.println("you cannot vote");
            }
        }else {
            System.out.println("Not Indian");
        }

        int a=12430,b=2870,c=37670,d=44878750;
        if(a>b && a>c && a>d){
            System.out.println("a is greater");
        }else if(b>c && b>d){
            System.out.println("b is greater");
        }else if(c>d){
            System.out.println("c is greater");
        }else {
            System.out.println("d is greater");

        }

    }
}
