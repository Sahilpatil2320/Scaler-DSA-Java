package Array;

public class TwoDArray {
    public static void main(String[] args) {
        int [] [] arr = new int[4][5];

        arr[2][3] = 56;

        System.out.println(arr[2][3]);

        System.out.println("Row length of array is: "+arr.length);
        System.out.println("Column length of array is: "+arr[0].length);
    }
}
