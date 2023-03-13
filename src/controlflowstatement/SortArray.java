package controlflowstatement;

public class SortArray {
    public static void main(String[] args) {

        int temp;
        int[] arr = {1,23,4,5,5,634};
        int i=0;
        while(i<arr.length){
            for(int j =i+1;j<arr.length;j++){
                if(arr[i]>arr[j]){
                   temp = arr[i];
                   arr[i] = arr[j];
                   arr[j] = temp;
                }
            }
            System.out.println(arr[i]);
            i++;
        }
    }
}
