package abstraction.abstractdemo;

public class Cricket extends AbsSport{
    @Override
    public void show() {
        System.out.println("in show");
    }

    public static void main(String[] args) {

        Cricket obj = new Cricket();
        obj.show();
        obj.gym();
    }
}
