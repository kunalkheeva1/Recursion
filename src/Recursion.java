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




   // new method to calculate the paths of the tiles
   public static int pathTiles(int n, int m){

       if(m==n){
           return 2; //as it will have only two ways to put then
       }
       if(n<m){
           return 1; // as otherwise it will be exceeding the area boundries
       }

       //horizontal
       int horizontal = pathTiles(n-1,m);
       //vertical
       int vertical = pathTiles(n-m,m);
       return horizontal+vertical;
   }

   //creating function to call the guests either single or in pairs.
    public static int guestsCall(int n){
       if(n<=1){
           return 1;
       }

       //when they are single
        int way1= guestsCall(n-1);
        //and the rest of them are in pairs
        int way2= (n-1)*guestsCall(n-2);
        return way1+way2;

    }
    public static void main(String[] args) {
        System.out.println(guestsCall(5));
    }
}