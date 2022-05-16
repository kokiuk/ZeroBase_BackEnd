package solution2;

import java.util.Scanner;

/*
    ZeroBase 백엔드 고기욱
*/

public class Project2 {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        Point[] list = new Point[11];

        int x = 0;
        int y = 0;

        System.out.print("나의 x 좌표 값을 입력해 주세요. : ");
        x = sc.nextInt();
        System.out.print("나의 y 좌표 값을 입력해 주세요. : ");
        y = sc.nextInt();

        list[0] = new Point(x, y);

        int cnt = 1;
        boolean isOnly = true;

        while (cnt <= 10){
            System.out.println(cnt + "번째 입력 입니다.");

            System.out.print("임의의 x 좌표 값을 입력해 주세요. : ");
            x = sc.nextInt();
            System.out.print("임의의 y 좌표 값을 입력해 주세요. : ");
            y = sc.nextInt();

            for (int i = 0; i < cnt; i++) {
                if (list[i].getX() == x && list[i].getY() == y){
                    isOnly = false;
                    break;
                }else {
                    isOnly = true;
                }
            }
            if (isOnly == true){
                list[cnt] = new Point(x, y);
                cnt ++;
            }else {
                System.out.println("중복된 좌표를 입력 했습니다. 다시 입력하세요.");
            }
        }

        System.out.println("===========거리 계산===========");

        System.out.println("나의 좌표 : (" + list[0].getX() + ", " + list[0].getY() + ")");

        double closeDistance = 0;
        int closeIdx = 0;

        for (int i = 1; i < list.length; i++) {
            double tmpDistance = 0;
            tmpDistance = list[0].getDistance(list[i].getX(), list[i].getY());

            if (i == 1){
                closeDistance = tmpDistance;
                closeIdx = i;
            }else {
                if (closeDistance > tmpDistance){
                    closeDistance = tmpDistance;
                    closeIdx = i;
                }
            }
            System.out.println( i + "번째 입력 좌표 : (" + list[i].getX() + ", " + list[i].getY() + ") => 거리 : " + tmpDistance );

        }

        System.out.println("입력된 10개의 좌표중 나의 좌표와 가장 가까운 좌표 : (" + list[closeIdx].getX() + ", " + list[closeIdx].getY() + ")" );


    }
}
