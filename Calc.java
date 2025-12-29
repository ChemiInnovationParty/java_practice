import java.util.Scanner;

public class Calc {
public static void main(String[] args){ 
    double num, num2=0;
        char cal;
        Scanner s = new Scanner(System.in);
        System.out.println("数を入力してください。");
        num = s.nextDouble();
        s.nextLine();
        System.out.println("四則演算の記号を入力してください。"); 
        cal = s.nextLine().charAt(0); 
        if(cal != '+' && cal !='-'&& cal !='*'&& cal !='/'){
            System.out.println("演算子ではありません。");
            return;
        }
       while (true) {
          System.out.println("数を入力してください。");
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
        System.out.println("計算を終了する場合は「＝」を入力してください。続ける場合は演算子を入力してください。");
        cal = s.nextLine().charAt(0);
       
        if(cal=='='){
            System.out.println("計算を終了します。");
            System.out.printf("%.2fです。", num);
            break;   
        }
        else if(cal == '+' || cal =='-'|| cal =='*'|| cal =='/'){
            continue;
        }
        else{
            System.out.println("演算子ではありません。");
            break;
        }
      }       
      s.close();
    }
}
