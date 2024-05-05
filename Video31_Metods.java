import java.util.*;
public class Video31_Metods {
    static void sum(int x, int y){
        int z = x+y;
        System.out.println("Sum = "+ z);
    }
    static int greater(int x,int y){
        if(x>y)
            return x;
        else
            return y;
    }
    void multiply(int x , int y){
        int z = x*y;
        System.out.println("Multiply = " + z);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        sum(6,8);
        int a = greater(6,8);
        System.out.println(a + " is greater");
        Video31_Metods obj = new Video31_Metods();
        obj.multiply(6,8);

    }

}
