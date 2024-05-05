import java.util.*;
class Questions{
    static Scanner scan = new Scanner(System.in);
    static void question1(){
        // Create an array of 5 float and calculate their sum
        float arr[] = new float[10];
        System.out.println("Enter Five floating numbers");
        for(int i=0; i<5;i++){
            arr[i] = scan.nextFloat();
        }
        float sum = 0;
        for(int i = 0;i<5;i++){
            sum += arr[i];
        }
        System.out.println("Sum is " + sum);
    }
    static void question2(){
        // WAP to find out weather a given integer is present in array or not
        int arr[] = new int [10];
        System.out.println("ENter the size of arary");
        int size = scan.nextInt();
        System.out.println("Enter the elements pf array");
        for (int i=0;i<size;i++)
            arr[i] = scan.nextInt();
        System.out.println("Enter the element to Search in array");
        int element = scan.nextInt();
        int i;
        for( i = 0;i<size;i++){
            if(arr[i]==element){
                System.out.println("Element found successfully at index = " + (i+1));
                return;
            }
        }
        if(i==size){
            System.out.println("Element not found");
        }
    }
    static void question3(){
        // Calculate the average marks from an array containing marks of all students in pysics using for loop
        int marks[] = new int[100];
        int i;
        System.out.println("Enter the number of students");
        int stud = scan.nextInt();
        System.out.println("Enter the marks of students");
        for(i=0;i<stud;i++){
            marks[i] = scan.nextInt();
        }
        int sum = 0;
        for(i=0;i<stud;i++){
            sum += marks[i];
        }
        float avg = sum/stud;
        System.out.println("Average marks  = " + avg);

    }
    static void question4(){
        // Create a java program to add two matrices of size 2*3
        System.out.println("Enter the row size of Matrices");
        int row = scan.nextInt();
        System.out.println("Enter the Column size of Matrices");
        int column = scan.nextInt();
        int Matrix1[][]  = new int [10][10];
        int Matrix2[][] = new int [10][10];
        int Matrix3[][] = new int[10][10];
        System.out.println("ENter the Elements of Matrix 1.");
        int i,j;
        for(i=0;i<row;i++)
            for (j=0;j<column;j++)
                Matrix1[i][j] = scan.nextInt();
        System.out.println("ENter the Elements of MAtrix 2.");
        for(i=0;i<row;i++)
            for (j=0;j<column;j++)
                Matrix2[i][j] = scan.nextInt();
        // Addition Operation
        for(i=0;i<row;i++){
            for(j=0;j<column;j++){
                Matrix3[i][j] = Matrix1[i][j] + Matrix2[i][j];
            }
        }
        System.out.println("Final MAtrix After Addition");
        for (i=0;i<row;i++){
            for(j=0;j<column;j++){
                System.out.print(" " +Matrix3[i][j] + " ");
            }
            System.out.println();
        }
    }
    static void question5(){
        // WAP to reverse An array
        int array[] = new int[100];
        System.out.println("Enter the size of array");
        int n = scan.nextInt();
        System.out.println("Enter the elements of array");
        for(int i = 0;i<n;i++)
            array[i] = scan.nextInt();
        System.out.print("Original Array = ");
        for (int i=0;i<n;i++)
            System.out.print( " " + array[i]);
        System.out.print("\nReverse array = ");
        for(int i=n-1;i>=0;i--)
            System.out.print(" " + array[i]);
    }
    static void question6(){
        // WAP to find the maximum elements in an array
        int array[] = new int [10];
        System.out.println("Enter the Size of array");
        int n = scan.nextInt();
        System.out.println("ENter the elemnents of array");
        for(int i=0;i<n;i++)
            array[i] = scan.nextInt();
        int max = array[0];
        for(int i=0;i<n;i++){
            if(max<array[i]){
                int temp = array[i];
                array[i] = max;
                max = temp;
            }
        }
        System.out.println("Maximum value  = " + max);
    }
    static void question7(){
        // WAP to find the minimum elements in an array
        int array[] = new int [10];
        System.out.println("Enter the Size of array");
        int n = scan.nextInt();
        System.out.println("ENter the elemnents of array");
        for(int i=0;i<n;i++)
            array[i] = scan.nextInt();
        int min = array[0];
        for(int i=0;i<n;i++){
            if(min>array[i]){
                int temp = array[i];
                array[i] = min;
                min = temp;
            }
        }
        System.out.println("Minimum value  = " + min);
    }
static void question8(){
        // WAP to check wheater an array sorted or Not
    int array[] = new int[10];
    System.out.println("Enter the siz eof arary");
    int size = scan.nextInt();
    System.out.println("Enter the elements of array");
    for(int i=0;i<size ;i++)
        array[i] = scan.nextInt();


    int i;
    boolean issorted = true;
    for(i=0;i<size-1;i++){
        if(array[i]>array[i+1]){
            issorted = false;
            break;
        }
    }
    if(issorted)
        System.out.println("Array is sorted");
    else
        System.out.println("Not sorted");
}
}
public class Video29_PracticeSEt {
    public static void main(String[] args) {
//        Questions.question1();
//        Questions.question2();
//        Questions.question3();
//        Questions.question4();
//        Questions.question5();
//        Questions.question6();
//        Questions.question7();
//        Questions.question8();

    }
}
