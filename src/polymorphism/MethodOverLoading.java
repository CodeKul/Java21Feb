package polymorphism;

import java.io.IOException;

/**
 * polymorphism - one thing have many actions
 * <p>
 * if one class have same method name with different number of argument
 * <p>
 * rules ->
 * 1. changing number of parameter
 * 2. changing datatype
 * <p>
 * advantage - it increase readability of program
 */
public class MethodOverLoading {
//compile time polymorphism,static binding ,early binding
    public void display(){
        System.out.println("In display");
    }


    public static void main(String[] args) throws IOException {
        MethodOverLoading obj = new MethodOverLoading();
        obj.display(1, 3);
        obj.display(4);
        obj.display();


        obj.add(1.0f,3);
//        FileWriter  fileWriter = new FileWriter("test.txt");
//        fileWriter.write();
    }

    public void display(int i) {
        System.out.println("in display " + i);
    }

    public void display(int i, int j) {
        System.out.println("in display " + i + j);
    }

    public int add(int i, int j) {
        return i + j;
    }

    public double add(double i, int j) {
        return i + j;
    }

    public float add(float i, int j) {
        return i + j;
    }
}


