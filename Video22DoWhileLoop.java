import java.util.*;
public class Video22DoWhileLoop {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter the Last Number");
        int n = scan.nextInt();
        int i =1;
        do {
            System.out.println(i);
            i++;
        }while(i<=n);
        System.out.println("Enter the number to print table");
        int tab = scan.nextInt();
        int j=1;
        do {
            System.out.println(tab + "*" + j + " = " + j*tab);
            j++;
        }while(j<=10);

    }
}
