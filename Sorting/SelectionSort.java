package Sorting;

public class SelectionSort {

    public static void selectionSort(int [] arr){
        for(int i = 0; i < arr.length - 1; i++){
            int minVal = arr[i];
            int minIdx = i;

            for(int j = i +1; j < arr.length; j++){
                if(arr[j] < minVal){
                    minVal = arr[j];
                    minIdx = j;
                }
            }

            int temp = arr[i];
            arr[i] = arr[minIdx];
            arr[minIdx] = temp;
        }
        for (int num : arr) {
            System.out.print(num+" ");
        }
    }

    public static void main(String[] args) {
        int [] arr = {12,5,27,56,2,87,10};
        selectionSort(arr);
    }
}
