public class Recursion {
    public static void checkNo(String str, int idx, int count, String newstr){
        if(idx==str.length()){
           for(int i=0; i<count; i++){
               newstr+='x';
           }
           System.out.println(newstr);
           return;
       }

        char currentchar = str.charAt(idx);
        if(currentchar=='x'){
            count++;
            checkNo(str,idx+1,count,newstr);
        }else{
            newstr+=currentchar;
            checkNo(str, idx+1, count, newstr);
        }
    }
    public static void main(String[] args) {
        checkNo("Kxuxnxasxlllx",0,0,"");

    }
}