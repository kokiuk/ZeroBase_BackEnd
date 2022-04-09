import java.util.Scanner;

public class EntraceFee {
    public static void main(String[] args) {

        System.out.println("[입장권 계산]");

        Scanner sc = new Scanner(System.in);
         String card = null;
         String merit = null;
         int age = 0;
         int time = 0;

        System.out.print("나이를 입력해 주세요.(숫자) :");
        age = sc.nextInt();
        System.out.print("입장시간을 입력해 주세요.(숫자업력) :");
        time = sc.nextInt();
        System.out.print("국가 유공자 여부를 입력해 주세요.(y/n) :");
        merit = sc.next();
        System.out.print("복지카드 여부를 입력해 주세요.(y/n) :");
        card = sc.next();

//        System.out.println("age = " + age);
//        System.out.println("time = " + time);
//        System.out.println("merit = " + merit);
//        System.out.println("card = " + card);

        if(age < 3){
            System.out.println("입장료는 0원 입니다");
        }
        else if(age < 13){
            System.out.println("입장료는 4000원 입니다");
        }
        else if(time > 17){
            System.out.println("입장료는 4000원 입니다");
        }
        else if(merit.equals("y") || card.equals("y")){
            System.out.println("입장료는 8000원 입니다");
        }
        else {
            System.out.println("입장료는 10000원 입니다");
        }




        }






    }

