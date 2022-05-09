public class Recursion {

    public static void fib(int a, int b, int n){
        if(n==0){
            return;
        }else{
            int c = a+b;
            System.out.println(c);
            fib(b,c,n-1);
        }
    }
    public static void main(String[] args) {
        int a=0, b=1,n=7;
        System.out.println(a+ "\n"+b);
        fib(a,b,n-2);


    }
}