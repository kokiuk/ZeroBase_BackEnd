import java.util.Scanner;

public class CashBack {
    public static void main(String[] args) {

        System.out.println("[케시백 계산]");

        int money = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("결제 금액을 입력해 주세요.(금액):");

        money = sc.nextInt();

        if(money/10 > 300){
            int cashBack1 = 300;
//            System.out.println("결재 금액은 " + money + "원 이고, 캐시백은 " + cashBack1 + "원 입니다"  );
            System.out.printf("결제 금액은 %d원 이고, 캐시백은 %d원 입니다", money, cashBack1);
        }
        else{
            int cashBack2 = money/1000 * 100;
//            System.out.println("결재 금액은 " + money + "원 이고, 캐시백은 " + cashBack2 + "원 입니다"  );
            System.out.printf("결제 금액은 %d원 이고, 캐시백은 %d원 입니다", money, cashBack2);
        }

    }
}
