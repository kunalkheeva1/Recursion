public class Recursion {
    static int first =-1;
    static int last = -1;
    public static void occurance(String str, int idx, char element){
        if(idx==str.length()){
            System.out.println(first);
            System.out.println(last);
            return;
        }

        char current= str.charAt(idx);
        if(current== element){
            if(first==-1){
                first =idx;
            }else{
                last=idx;
            }
        }
        occurance(str,idx+1,element);
    }
    public static void main(String[] args) {
        occurance("Kunal",0,'a');


    }
}