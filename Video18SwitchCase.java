import java.util.*;
public class Video18SwitchCase {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter 1 to print Hello.\nEnter 2 Print World\nEnter 3 to Print Bonjour\nEnter 4 to exit");
        int n = scan.nextInt();
        switch(n){
            case 1:
                System.out.println("Hello");
                break;
            case 2:
                System.out.println("World");
                break;
            case 3:
                System.out.println("Bonjour");
                break;
            case 4:
                return;
            default:
                System.out.println("Wrong Choice!");
        }


    }
}
