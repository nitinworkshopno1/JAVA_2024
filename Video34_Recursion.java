public class Video34_Recursion {
    static int factorial(int x){
        if(x==1 || x==0)
            return 1;
        else
            return x * factorial(x-1);
    }
    public static void main(String[] args) {

        System.out.println("factorial of 5 = "+ factorial(5));
    }
}
