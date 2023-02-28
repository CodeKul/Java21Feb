package abstraction;

public class Football implements Sports{

    public void show() {
        System.out.println("in show");
    }

    public static void main(String[] args) {

        Football obj = new Football();
        obj.show();
    }

}
