import java.util.*;
public class Video28_MultiDimensionlaArray {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Multi-Dimensional Array is a array of arrays
        int arr[][] = new int[2][4];
        arr[0][0] = 10;
        arr[0][1] = 20;
        arr[0][2] = 30;
        arr[0][3] = 40;
        arr[1][0] = 50;
        arr[1][1] =60;
        arr[1][2] = 70;
        arr[1][3] = 80;
//        System.out.println(arr[1].length);   // Return the length of Rowth Array
        int arr1[][] = {{2,4,5,6},{7,8,9,9}};
        System.out.println(arr1.length);
        for(int i = 0;i<arr1.length;i++){
            for(int j=0;j<arr1[i].length;j++)
                System.out.print(arr1[i][j]);
            System.out.println();

        }
    }

}
