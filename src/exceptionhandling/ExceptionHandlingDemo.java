package exceptionhandling;

//try,catch,finally
//try,catch
//try,finally
public class ExceptionHandlingDemo {

    public static void main(String[] args) {

//        FileOutputStream fileOutputStream = new FileOutputStream("Test.txt");
//
//        int i=10;
//        int j = i/0;

        try {
            String str = null;
            str = "Pune";
            System.out.println(str.toUpperCase());

            Integer i = Integer.parseInt("1dfr");
            System.out.println(i);
//            try{
//
//
//                int i1=10;
//                int j = i1/0;
//            }catch (Exception e){
//                System.out.println("Inner=>"+e.getMessage());
//            }
//            int[] arr = new int[2];
//            arr[0] = 10;
//            arr[1] = 20;
//            arr[2] = 30;

        } catch (NullPointerException e) {
            try {
                int i=0;
            }catch (Exception e1){
                e1.getMessage();
            }
            System.out.println("Outer=>"+e.getMessage());
        } catch (NumberFormatException e){
            System.out.println(e.getMessage());
        } catch (Exception e){
            System.out.println(e.getMessage());
        }finally {
            System.out.println("In finally");
        }

        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");
        System.out.println("Hii");

    }
}
