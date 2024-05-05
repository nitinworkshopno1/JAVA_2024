public class Video33_VariableArguments {
    //        static void print(){
//            System.out.println("We are in Print Method wit no Parameter");
//        }
//        static void print(int x){
//            System.out.println("We are in Print method with x as the arguments = " + x);
//        }
//        static void print(int x, int y){
//            System.out.println("We are in Print method With X & Y as the arguments = " + x +" And " + y);
//        }
    // Above whole code can be written as
    static int print(int ...arr){
        int sum = 0;
        for(int i: arr){
            sum += i;
        }
        return sum;

    }
    public static void main(String[] args) {
        System.out.println("Sum of 5 & 43 = " +  print(5,43));
        System.out.println("Sum of 5,7 & 43 = " +  print(5,7,43));
        System.out.println("Sum of 5,8,9 & 43 = " +  print(5,8,9,43));
    }
}
