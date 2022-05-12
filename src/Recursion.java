public class Recursion {
    public static void print(String str, String end){
    if(str.length()==0){
        System.out.println(end);
        return;
    }
        for(int i=0; i<str.length(); i++){
           char current= str.charAt(i);
           String substr= str.substring(0,i)+str.substring(i+1);
           print(substr, end+current);
        }
    }
    public static void main(String[] args) {
        print("abc","");

    }
}