import java.util.*;
public class CountText {
    public static void main(String[] args){
    InputText in = new InputText();
    in.inputtext(); //클래스 부른 뒤에.메소드 
  
    }
}
class InputText{
    public void inputtext(){
    Scanner s = new Scanner(System.in); 
    System.out.println("글자를 입력하시오");
    String jaso = s.nextLine();
    System.out.println("지금까지 쓴 글자수는 "+jaso.length()+"자 입니다");
    System.out.println("공백을 제외한 글자수는 "+jaso.replace(" ", "").length()+"입니다");
    return;
    
}   
}
