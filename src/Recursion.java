public class Recursion {
   public static int pathCalc(int i, int j, int n, int m){
      if(i==n||j==m){
          return 0;
      }

       if(i==n-1&&j==m-1){
           return 1;
       }
       //for the right paths
       int right= pathCalc(i,j+1,n,m);
       //for down paths
       int down= pathCalc(i+1,j,n,m);
       return right+down;

   }
    public static void main(String[] args) {
        System.out.println(  pathCalc(0,0,3,3));


    }
}