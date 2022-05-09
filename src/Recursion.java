import java.util.Scanner;
public class Recursion {
    public static void print(int n){
        if(n==0){
            return;
        }
        System.out.print(n-1+ " ");
            print(n-2);
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input to be reversed: ");
        int input =sc.nextInt();
        print(input);

    }
}
