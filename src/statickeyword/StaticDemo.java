package statickeyword;

public class StaticDemo {


    int empId;
    String empName;
    static String companyName;

    static {
        System.out.println("In static");
        companyName ="ABC";
    }

    public static void show(){
        System.out.println("in show");
    }
    public static void main(String[] args) {
        System.out.println("In main function");

        show();
        StaticDemo obj = new StaticDemo();
        obj.empId = 1;
        obj.empName = "Rakesh";

        StaticDemo obj1 = new StaticDemo();
        obj1.empId = 2;
        obj1.empName = "Amit";

        System.out.println(obj.empId+" "+obj.empName+" "+companyName);
        System.out.println(obj1.empId+" "+obj1.empName+" "+companyName);
    }

}
