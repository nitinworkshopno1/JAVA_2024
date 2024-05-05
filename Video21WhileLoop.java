import java.util.*;
public class Video21WhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the last number");
        int n = scan.nextInt();
        int i = 0;
        while(i<=n){
            System.out.println(i);
            i++;
        }
        System.out.println("Enter the number to Print table of That.");
        int tab  = scan.nextInt();
        int j =1;
        while(j<=10){
            System.out.println(tab + "*" + j + " = " + tab*j);
            j++;
        }

    }
}
