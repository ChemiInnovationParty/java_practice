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
        System.out.println("文章を入力してください");
        String str=s.nextLine();
        String revStr=strRev(str);
        System.out.println("文章を逆順にすると : "+revStr+"になります。");
    }
}
