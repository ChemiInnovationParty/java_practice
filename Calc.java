import java.util.Scanner;

public class Calc {
public static void main(String[] args){ 
    double num, num2=0;
        char cal;
        Scanner s = new Scanner(System.in);
        System.out.println("수를 입력하시오");
        num = s.nextDouble();
        s.nextLine();
        System.out.println("원하시는 사칙연산기호를 입력하시오"); 
        cal = s.nextLine().charAt(0); 
        if(cal != '+' && cal !='-'&& cal !='*'&& cal !='/'){
            System.out.println("연산기호가 아닙니다");
            return;
        }
       while (true) {
          System.out.println("수를 입력하시오");
        num2 = s.nextDouble();
            switch(cal){ 
            case '+' : num+=num2;
            break; 
            case '-' : num-=num2; 
            break; 
            case '*' : num*=num2; 
            break; 
            case '/' : num/=num2; 
            break; 
        }
        s.nextLine();
        System.out.println("계산을 종료하시려면 =을 입력해 주시고 계산을 더 하실거면 사칙연산자 키를 눌러 주세요");
        cal = s.nextLine().charAt(0);
       
        if(cal=='='){
            System.out.println("계산 종료");
            System.out.printf("%.2f입니다", num);
            break;   
        }
        else if(cal == '+' || cal =='-'|| cal =='*'|| cal =='/'){
            continue;
        }
        else{
            System.out.println("연산자가 아닙니다");
            break;
        }
      }       
      s.close();
    }
}
