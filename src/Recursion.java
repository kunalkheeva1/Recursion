public class Recursion {
    public static void towerOfHanoi(int n, String src, String helper, String dest){
    if(n==1){
        System.out.println("Transfer of disk " +n +" from "+ src +" to "+dest);
        return;
    }

        towerOfHanoi(n-1,src,dest,helper);
        System.out.println("Transfer of n disk "+n+" from " +src+" to "+ dest);
        towerOfHanoi(n-1,helper,src,dest);

    }
    public static void main(String[] args) {
        towerOfHanoi(5,"S","H","D");

    }
}