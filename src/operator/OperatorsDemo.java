package operator;

/**
 * arithmetic - +, -, /, *, %
 * assignment -  = ==
 * logical - && || !
 * bitwise - & |
 * unary operator - ++,--
 * relational - < > ,<= ,>=
 * shift - << >>
 * ternary - ? :
 */
public class OperatorsDemo {
    public static void main(String[] args) {

        int i =10;
        int j =30;

        System.out.println(i+j);
        System.out.println(i-j);
        System.out.println(i/j);
        System.out.println(i*j);
        System.out.println(i%j);

        if(i>0 || j>0){
            System.out.println("both are zero");
        }else {
            System.out.println("in else");
        }

        System.out.println(i!=j);
        System.out.println(i&j);
        System.out.println(i|j);
    }
}
