public class Recursion {
    public static void reverse(String str, int idx){
        if(idx==0){
            System.out.println(str.charAt(idx));
            return;
        }
        System.out.print (str.charAt(idx));
        reverse(str,idx-1);
    }
    public static void main(String[] args) {
        String kk= "Kunal";
        reverse(kk,4);

    }
}