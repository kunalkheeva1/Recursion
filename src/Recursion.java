public class Recursion {
    public static double power(double x, int y){
        if(x==0){
            return 0;
        }else if(y==0){
            return 1;
        }else{
            double powm1= power(x,y-1);
            double getting = x*powm1;
            return getting;
        }
    }
    public static void main(String[] args) {
        System.out.println(power(2,5));

    }
}