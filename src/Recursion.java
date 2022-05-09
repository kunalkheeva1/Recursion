import java.util.Scanner;
public class Recursion {
    public static void print(int n, int m){
        if(n==m+1){
            return;
        }
        System.out.print(n+ " ");
            print(n+1,m);  //added the maximum limit in the recursion with anther parameter m as input.
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Please enter your input to get the ascending list: ");
        int input =sc.nextInt();
        System.out.println("Please enter your maximum limit: ");
        int input2= sc.nextInt();
        print(input,input2);

    }
}
