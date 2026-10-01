package Sorting;

import java.util.Arrays;

public class SortMethod {
    public static void main(String[] args) {
        int [] arr = {2,5,8,3,10,1};
        Arrays.sort(arr);
        for(int num: arr){
            System.out.print(num+" ");
        }
    }
}
