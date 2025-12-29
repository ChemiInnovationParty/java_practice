import java.util.*;
public class CountText {
    public static void main(String[] args){
    InputText in = new InputText();
    in.inputtext(); 
  
    }
}
class InputText{
    public void inputtext(){
    Scanner s = new Scanner(System.in); 
    System.out.println("文字を入力してください。");
    String jaso = s.nextLine();
    System.out.println("これまで入力した文字数は"+jaso.length()+"字です。");
    System.out.println("空白を除いた文字数は"+jaso.replace(" ", "").length()+"字です。");
    return;
    
}   
}
