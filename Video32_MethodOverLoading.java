import java.util.*;
// METHOD OVERLOADING:- Two or more methods can have same name but different parameters are called  MEthod Overloading
public class Video32_MethodOverLoading {
    static void print(){
        System.out.println("We are in Print Method wit no Parameter");
    }
    static void print(int x){
        System.out.println("We are in Print method with x as the arguments = " + x);
    }
    static void print(int x, int y){
        System.out.println("We are in Print method With X & Y as the arguments = " + x +" And " + y);
    }
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        print();
        print(10);
        print(10,20);


    }
}
