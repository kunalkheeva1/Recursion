public class Recursion {
    public static boolean checkArr(int[] num,int idx){
        if(idx==num.length-1){
            return true;
        }
        if(num[idx]<num[idx+1]){
            return checkArr(num, idx+1);
        }else{
            return false;
        }
    }
    public static void main(String[] args) {
        int[] arr ={2,3,5};
        System.out.println( checkArr(arr,0));

    }
}