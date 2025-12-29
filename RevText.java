import java.util.*;

public class RevText {
    public static String strRev(String str){
     String result = ""; 
     for(int i = str.length()-1;i>=0;i--){
         result+=str.charAt(i);
     }
     return result;
 }
    public static void main(String[] args){
        Scanner s = new Scanner(System.in);
        System.out.println("문장을 입력하시오");
        String str=s.nextLine();
        String revStr=strRev(str);
        System.out.println("문장을 거꾸로 하면 : "+revStr+"입니다.");
    }
}
