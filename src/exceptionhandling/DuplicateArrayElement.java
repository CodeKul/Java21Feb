package exceptionhandling;

import java.util.ArrayList;
import java.util.List;

public class DuplicateArrayElement {

    public static void main(String[] args) {

        String str = "I am Indian Indian";
        int arr[] ={1,2,3,4,4,2,2,7};
/**
 * 1->1
 * 2->3
 * 3->1
 * 4->2
 */
        List<Integer> list = new ArrayList<>();

//        Set<Integer>set = new HashSet<>();
        for(int i=0;i< arr.length;i++){
            for(int j=i+1;j<arr.length;j++){
                if(arr[i]==arr[j]){
                    if(!list.contains(arr[i])){
                        list.add(arr[i]);
                    }
//                     set.add(arr[i]);
                }
            }
        }
        System.out.println(list);
    }
}
