import java.util.*;
public class Video24BreakAndContinue {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        // Break and Continue Using loop
        for(int i=0;i<5;i++){
            if(i==1){
                System.out.println("Continue");
                continue;              // COONTINUE
            }
            System.out.println(i);
            System.out.println("java is great");
            if (i==3){
                System.out.println("Ending the loop");
                break;                  // BREAK
            }
            System.out.println("End");
        }
    }
}
