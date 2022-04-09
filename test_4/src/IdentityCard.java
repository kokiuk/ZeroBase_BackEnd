import java.util.Random;
import java.util.Scanner;

public class IdentityCard {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        int day = 0;
        int r_number = 0;
        String gender = null;

        System.out.println("[주민등록번호 계산]");

        Scanner sc = new Scanner(System.in);

        System.out.print("출생년도를 입력해 주세요.(yyyy) : ");
        year = sc.nextInt();
        System.out.print("출생월을 입력해 주세요.(mm) : ");
        month = sc.nextInt();
        System.out.print("출생일을 입력해 주세요.(dd) : ");
        day = sc.nextInt();
        System.out.print("성별을 입력해 주세요.(m/f) : ");
        gender = sc.next();

//        System.out.println("year = " + year);
//        System.out.println("month = " + month);
//        System.out.println("day = " + day);
//        System.out.println("gender = " + gender);

        Random random = new Random();

        r_number = (random.nextInt(1000000));

//        System.out.println("r_number = " + r_number);

        if(gender.equals("m") && year < 2000){
            System.out.printf("%04d%02d%02d - 1%06d",year, month, day, r_number);
        }
        else if(gender.equals("f") && year < 2000){
            System.out.printf("%04d%02d%02d - 2%06d",year, month, day, r_number);
        }
        else if(gender.equals("m") && year >= 2000)
        {
            System.out.printf("%04d%02d%02d - 3%06d",year, month, day, r_number);
        }
        else if(gender.equals("f") && year >= 2000){
            System.out.printf("%04d%02d%02d - 4%06d",year, month, day, r_number);
        }








    }
}
