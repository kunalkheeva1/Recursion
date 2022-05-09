public class Recursion {
    public static int calcfactorial(int n){
        if(n==0||n==1){
            return 1;
        }
        int fact = calcfactorial(n-1);
        int factans= n*fact;
        return factans;
    }
    public static void main(String[] args) {
        System.out.println(calcfactorial(5));
    }
}