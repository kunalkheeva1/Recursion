import java.util.ArrayList;

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


    //creating another method to track the number of sets with the help of recursion

    public static void findSubset(int n, ArrayList<Integer> subset){

       if(n==0){
           for(int i=0; i< subset.size(); i++){
               System.out.print(subset.get(i)+" ");
           }
           System.out.println();
           return;
       }
       //add the elements in the set
        subset.add(n);
        findSubset(n-1,subset); // here n-1 as the count has already started
        //now for removing elements form the end to examine other possibilities
        subset.remove(subset.size()-1);
        findSubset(n-1, subset);

    }
    public static void main(String[] args) {
       ArrayList<Integer> subset = new ArrayList<>();
        findSubset(4,subset);
    }
}