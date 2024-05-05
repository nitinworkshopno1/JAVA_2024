import java.util.*;
public class Video23ForLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("ENter the number to print table");
        int n = scan.nextInt();
        for(int i=1;i<=10;i++){
            System.out.println(n + "*" + i + " = " + i*n);
        }
        System.out.println("Enter the last value to print he odd number");
        int n1 = scan.nextInt();
        for(int i = 0;i<=n1;i++){
            if(i%2!=0){
                System.out.println(i);
            }
        }
        System.out.println("How many Odd number you want to print");
        int n3 = scan.nextInt();
        for(int i=0;i<n3;i++){
            System.out.println(2*i+1);
        }
    }
}
