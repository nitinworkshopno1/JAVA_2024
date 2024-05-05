import java.util.*;
public class Video19PracticeSet {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        //Q1.WAP to find out wheater a student is pass or fail : if it requires 40% and at least 33% in each subject to pass .
        // Assume 3 subjects and take marks as an input from the user
//        System.out.println("Enter the marks of Maths");
//        int maths = scan.nextInt();
//        System.out.println("Enter the marks of english");
//        int english = scan.nextInt();
//        System.out.println("Enter the marks of hindi");
//        int hindi = scan.nextInt();
//        float average = (hindi+english+maths)/3.0f;
//        if(average>=40 && maths>33 && english>33 && hindi>33)
//            System.out.println("Pass");
//        else
//            System.out.println("fail");
//        if(average<40)
//            System.out.println("Your Overall Percentage is Below than 40%");

        // Q2. Find a leap Year
//        System.out.println("ENter the year");
//        int year = scan.nextInt();
//        if(year%4==0)
//            System.out.println("Leap yaer");
//        else
//            System.out.println("Not a leap yaer");

        // Q3. WAP to ind the type of websites
        System.out.println("Enter the URL of Website");
        String str = scan.nextLine();
        if(str.endsWith(".com"))
            System.out.println("Commercial Websites");
        else if(str.endsWith(".org"))
            System.out.println("Orgaizational Websited");
        else if(str.endsWith(".in"))
            System.out.println("Indian website");
        else
            System.out.println("Other websites");

    }
}
