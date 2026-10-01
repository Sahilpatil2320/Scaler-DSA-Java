package Array;

public class TransposeOfMatrix {

    public static void  transopse(int [][] arr){
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < i; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[j][i];
                arr[j][i] = temp;
            }
        }

        

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }
    }

    public static void rotation(int [][] arr){
        transopse(arr);
        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                int temp = arr[i][j];
                arr[i][j] = arr[arr.length - j - 1] [i];
                arr[arr.length - j - 1] [i] = temp;
            }
        }

        for(int i = 0; i < arr.length; i++){
            for(int j = 0; j < arr[0].length; j++){
                System.out.print(arr[i][j]+" ");
            }
            System.out.println();
        }

    }

    public static void main(String[] args) {
        int [][] arr =  {{1,2,3,4},
                         {5,6,7,8},
                         {9,10,11,12},
                         {13,14,15,16}};
        
        transopse(arr);

        System.out.println("Matrix after 90 degree clockwise rotation is : ");
        rotation(arr);
    }
}
