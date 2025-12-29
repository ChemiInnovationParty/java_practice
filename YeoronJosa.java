import java.util.Scanner;

class Jinbo{
    public void chooseJinbo(){
    Scanner s = new Scanner(System.in);
    int choose=0;
    String ji = "진보";
    System.out.println("이번 경기도지사 선거는 어느 후보가 되어야 한다고 생각하십니까?");
    System.out.println("김동연 1번, 추미애 2번, 한준호 3번, 김병주 4번을 눌러주세요");
    System.out.println("지지하는 후보가 없다면 아무 숫자나 눌러주세요");
    choose=s.nextInt();
           switch(choose){
            case 1 : System.out.printf("당신은 %s성향이고, 김동연을 지지합니다", ji);
            break;
            case 2 : System.out.printf("당신은 %s성향이고, 추미애를 지지합니다", ji);
            break;
            case 3 : System.out.printf("당신은 %s성향이고, 한준호를 지지합니다", ji);
            break;
            case 4 : System.out.printf("당신은 %s성향이고, 김병주를 지지합니다", ji);
            break;
            default : System.out.printf("당신은 %s성향이고, 아무도 지지하지 않습니다", ji);
            break;
        }
}
}
class Bosu{
    public void chooseBosu(){
        Scanner s = new Scanner(System.in);
        int choose=0;
        String bo = "보수";
        System.out.println("이번 경기도지사 선거는 어느 후보가 되어야 한다고 생각하십니까?");
        System.out.println("유승민 1번, 이준석 2번, 한동훈 3번, 김은혜 4번을 눌러주세요");
        System.out.println("지지하는 후보가 없다면 아무 숫자나 눌러주세요");
        choose=s.nextInt();
        switch(choose){
            case 1 : System.out.printf("당신은 %s성향이고, 유승민을 지지합니다", bo);
            break;
            case 2 : System.out.printf("당신은 %s성향이고, 이준석을 지지합니다", bo);
            break;
            case 3 : System.out.printf("당신은 %s성향이고, 한동훈을 지지합니다", bo);
            break;
            case 4 : System.out.printf("당신은 %s성향이고, 김은혜를 지지합니다", bo);
            break;
            default : System.out.printf("당신은 %s성향이고, 아무도 지지하지 않습니다", bo);
            break;
        }
}
}

public class YeoronJosa {
    public static void main(String[] args) {
    Scanner s = new Scanner(System.in);
    int choose=0;
    System.out.print("안녕하십니까 여론조사업체입니다. \n");
    System.out.print("민주당을 지지하시면 1번을 국민의힘을 지지하시면 2번을 조국혁신당을 지지하시면 3번을 눌러 주세요 \n");
    System.out.print("개혁신당을 지지하시면 4번을 진보당을 지지하시면 5번을 기본소득당을 지지하시면 6번을 눌러 주세요 \n");
    System.out.print("지지하는 정당이 없다면 아무 숫자나 눌러주세요 \n");

    choose = s.nextInt();
    if(choose==1||choose==3||choose==5||choose==6){
        Jinbo j=new Jinbo();
        j.chooseJinbo();
    }
    else if(choose==2||choose==4){
        Bosu b=new Bosu();
        b.chooseBosu();
    }
    else{
    System.out.print("지지하는 정당이 없으므로 여론조사를 종료합니다 \n");
    }
    }
}
