
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class MyLotto {
    static Random random = new Random();
    static ArrayList<int[]> lottos = new ArrayList<>();
    static int[] result;
    public static void main(String[] args) {
        System.out.println("[로또 당첨 프로그램]");
        System.out.println();
        System.out.print("로또 개수를 입력해 주세요. (숫자 1 ~ 10) : ");
        Scanner sc = new Scanner(System.in);
        int buyNum = sc.nextInt();

        for (int i = 0; i < buyNum; i++) {
            lottos.add(buy(i));
        }
        result();
        System.out.println();

        resultCount();







    }

    public static int[] buy(int a) {
        int[] ran = new int[6];

        for (int i = 0; i < ran.length; i++) {
            ran[i] = random.nextInt(45) + 1;

            for (int j = 0; j < i; j++) {
                if (ran[i] == ran[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print((char) (65 + a) + "\t");
        for (int i = 0; i < ran.length; i++) {
            Arrays.sort(ran);
            System.out.print(ran[i] + "\t");
        }
        System.out.println();

        return ran;

    }

    public static void result() {
        int[] resultRan = new int[6];

        System.out.println();
        System.out.println("[로또 발표]");

        for (int i = 0; i < resultRan.length; i++) {
            resultRan[i] = random.nextInt(45) + 1;
            for (int j = 0; j < i; j++) {
                if (resultRan[i] == resultRan[j]) {
                    i--;
                    break;
                }
            }
        }
        System.out.print("\t");
        for (int i = 0; i < resultRan.length; i++) {
            Arrays.sort(resultRan);
            System.out.print(resultRan[i] + "\t");
        }
        System.out.println();

        result = resultRan;
    }

    public static void resultCount(){
        System.out.println("[내 로또 결과]");
        for (int[] lotto : lottos) {
            int correct = 0;
            System.out.print((char) (65 + lottos.size()) + "\t");      ////65 + ??
            for (int i = 0; i < result.length; i++) {
                System.out.print(lotto[i]+"\t");
                for (int j = 0; j < lotto.length; j++) {
                    if (result[i] == lotto[j]) {
                        correct++;
                    }
                }
            }
            System.out.print(">> " + correct + " 개 일치");
            System.out.println();

        }
    }


}
//--------------------------------------------------------------------

//
//    public static void main(String[] args) {
//        Random random = new Random();
//        int tryNum;
//        Scanner sc = new Scanner(System.in);
//
//        System.out.println("[로또 당첨 프로그램]");
//        System.out.print("로또 갯수를 입력해주세요. (숫자 1 ~ 10) : ");
//        tryNum = sc.nextInt();
//        while (true){
//        //내 로또번호 생성
//        //n회 반복
//            int sixNum[] = new int[6];
//            for (int k = 0; k < tryNum; k++) {
////            System.out.printf("%d \t", tryNum);
////                int sixNum[] = new int[6];
//
//                //1~45번호 부여
//                for (int i = 0; i < sixNum.length; i++) {
//                    sixNum[i] = random.nextInt(45) + 1;
//
//                    //중복검사
//                    for (int j = 0; j < i; j++) {
//                        if (sixNum[i] == sixNum[j])
//                            i--;
//                    }
//                }
//                //내 로또번호 출력
//                for (int i = 0; i < sixNum.length; i++) {
//
//                    Arrays.sort(sixNum);
//                    System.out.print(sixNum[i] + "\t");
//
//                }
//
//                System.out.println();
//            }
//            //로또 발표
//
//            System.out.println();
//            System.out.println("[로또 발표]");
//
//            int[] lottoNum = new int[6];
//
//            for (int i = 0; i < lottoNum.length; i++) {
//                lottoNum[i] = random.nextInt(45) + 1;
//                //중복검사
//                for (int j = 0; j < i; j++) {
//                    if (lottoNum[i] == lottoNum[j])
//                        i--;
//                }
//            }
//            //로또번호 출력
//            int cunt = 0;
//            for (int i = 0; i < lottoNum.length; i++) {
//
//                Arrays.sort(lottoNum);
//                System.out.print(lottoNum[i] + "\t");
//                if (sixNum[i] == lottoNum[i]){
//                    cunt ++;
//                }
//            }
//
//            System.out.println();
//            System.out.println();
//            System.out.println("[내 로또 결과]");
//
//
//
//        break;
//        }
//    }
//}
