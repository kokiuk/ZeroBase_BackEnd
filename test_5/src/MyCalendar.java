import java.util.Calendar;
import java.util.Scanner;

public class MyCalendar {
    public static void main(String[] args) {
        int year = 0;
        int month = 0;
        int startWeekDay = 0;
        int endDay = 0;

        Scanner sc = new Scanner(System.in);
        System.out.print("년을 입력해주세요(YYYY) : ");
        year = sc.nextInt();
        System.out.print("달을 입력해주세요(MM) : ");
        month = sc.nextInt();

        Calendar start = Calendar.getInstance();
        Calendar end = Calendar.getInstance();

        start.set(year, month -1, 1);
        end.set(year, month, 1);
        end.add(Calendar.DATE, -1);

        startWeekDay = start.get(Calendar.DAY_OF_WEEK);
        endDay = end.get(Calendar.DATE);

        System.out.println("["+year+"년 "+month+"월 달력]");
        System.out.println("일\t월\t화\t수\t목\t금\t토");

        for(int i = 1 ; i < startWeekDay ; i++) {
            System.out.print("\t");
        }

        int cnt = startWeekDay - 1;

        for(int j = 1 ; j <= endDay ; j++) {
//            System.out.print(j+"\t");
            System.out.printf("%02d" + "\t",j);
            cnt ++;
            if(cnt == 7) {
                cnt = 0;
                System.out.println("");
            }
        }
    }
}
