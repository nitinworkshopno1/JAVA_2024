import java.util.*;
public class Video17LogicalOperators {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Enter your marks.");
        int marks = scan.nextInt();
//        if(marks>=90)
//            System.out.println("Grade A");
//        else if(marks<90 && marks >=80)
//            System.out.println("Grade B");
//        else if(marks>= 70 && marks<80)
//            System.out.println("Grade C");
//        else
//            System.out.println("Fail");

        // Abobe code can also be written as

        if(marks>=90)
            System.out.println("Grade A");
        else if(marks >=80)
            System.out.println("Grade B");
        else if(marks>= 70)
            System.out.println("Grade C");
        else
            System.out.println("Fail");
    }
}
