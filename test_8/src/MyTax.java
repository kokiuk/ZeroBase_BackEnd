import java.util.Scanner;

public class MyTax {
    static Scanner sc = new Scanner(System.in);
    static int myMoney;
    static int[] taxPercent = {6,15,24,35,38,40,42,45};
    static int[] taxMoney = {0,12000000,46000000,88000000,150000000,300000000,500000000,1000000000};
    static int[] taxMoney2 = {0,12000000,34000000,42000000,62000000,150000000,200000000,500000000};
    static int[] accTax = {0,1080000,5220000,14900000,19400000,25400000,35400000,65400000};
    public static void main(String[] args) {

        System.out.println("[과세금액 계산 프로그램]");
        inputMoney();
        taxCal();
        accTaxCal();
    }

    public static void inputMoney(){
        System.out.print("연소득을 입력해 주세요 : ");
        myMoney = sc.nextInt();
    }

//    public static void taxCal(){
//        for(int i = 0; i < 8; i++){
//            if(myMoney <= taxMoney[i] && myMoney > taxMoney[i-1]){                  //10얻 이하
//                for(int j = 0; j < i; j++){
//                    if(taxMoney[j] == '0'){
//                        int myTax = (myMoney / 100) * taxPercent[j];
//                        System.out.println("myTax = " + myTax);
//                    }
//                    else if(taxMoney[j] > 0) {
//                        System.out.println(taxMoney2[j]);
//                        System.out.println("taxPercent = " + taxPercent[j-1]);
//                    }
//                }
//            }
//        }
//
//    }

    public static void taxCal(){
        int myTax1;
        int nowMoney;
        int allTax;
        if (myMoney <= taxMoney[1]){
            myTax1 = (myMoney / 100) * taxPercent[0];
            System.out.printf("%10d * %2d%% = %10d\n",myMoney, taxPercent[0], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", myTax1);
        }
        else if (myMoney <= taxMoney[2]){
            nowMoney = myMoney - taxMoney[1];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            myTax1 = (nowMoney / 100 ) * taxPercent[1];
            allTax = myTax1 + taxPlus1;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[1], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
        else if(myMoney <= taxMoney[3]){
            nowMoney = myMoney - taxMoney[2];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            int taxPlus2 = (taxMoney2[2] / 100) * taxPercent[1];
            myTax1 = (nowMoney / 100 ) * taxPercent[2];
            allTax = myTax1 + taxPlus1 + taxPlus2;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[2], taxPercent[1], taxPlus2);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[2], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
        else if(myMoney <= taxMoney[4]){
            nowMoney = myMoney - taxMoney[3];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            int taxPlus2 = (taxMoney2[2] / 100) * taxPercent[1];
            int taxPlus3 = (taxMoney2[3] / 100) * taxPercent[2];
            myTax1 = (nowMoney / 100 ) * taxPercent[3];
            allTax = myTax1 + taxPlus1 + taxPlus2 + taxPlus3;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[2], taxPercent[1], taxPlus2);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[3], taxPercent[2], taxPlus3);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[3], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
        else if (myMoney <= taxMoney[5]){
            nowMoney = myMoney - taxMoney[4];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            int taxPlus2 = (taxMoney2[2] / 100) * taxPercent[1];
            int taxPlus3 = (taxMoney2[3] / 100) * taxPercent[2];
            int taxPlus4 = (taxMoney2[4] / 100) * taxPercent[3];
            myTax1 = (nowMoney / 100 ) * taxPercent[4];
            allTax = myTax1 + taxPlus1 + taxPlus2 + taxPlus3 + taxPlus4;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[2], taxPercent[1], taxPlus2);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[3], taxPercent[2], taxPlus3);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[4], taxPercent[3], taxPlus4);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[4], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
        else if(myMoney <= taxMoney[6]){
            nowMoney = myMoney - taxMoney[5];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            int taxPlus2 = (taxMoney2[2] / 100) * taxPercent[1];
            int taxPlus3 = (taxMoney2[3] / 100) * taxPercent[2];
            int taxPlus4 = (taxMoney2[4] / 100) * taxPercent[3];
            int taxPlus5 = (taxMoney2[5] / 100) * taxPercent[4];
            myTax1 = (nowMoney / 100 ) * taxPercent[5];
            allTax = myTax1 + taxPlus1 + taxPlus2 + taxPlus3 + taxPlus4 + taxPlus5;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[2], taxPercent[1], taxPlus2);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[3], taxPercent[2], taxPlus3);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[4], taxPercent[3], taxPlus4);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[5], taxPercent[4], taxPlus5);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[5], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
        else if(myMoney <= taxMoney[7]){
            nowMoney = myMoney - taxMoney[6];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            int taxPlus2 = (taxMoney2[2] / 100) * taxPercent[1];
            int taxPlus3 = (taxMoney2[3] / 100) * taxPercent[2];
            int taxPlus4 = (taxMoney2[4] / 100) * taxPercent[3];
            int taxPlus5 = (taxMoney2[5] / 100) * taxPercent[4];
            int taxPlus6 = (taxMoney2[6] / 100) * taxPercent[5];
            myTax1 = (nowMoney / 100 ) * taxPercent[6];
            allTax = myTax1 + taxPlus1 + taxPlus2 + taxPlus3 + taxPlus4 + taxPlus5 + taxPlus6;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[2], taxPercent[1], taxPlus2);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[3], taxPercent[2], taxPlus3);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[4], taxPercent[3], taxPlus4);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[5], taxPercent[4], taxPlus5);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[6], taxPercent[5], taxPlus6);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[6], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
        else {
            nowMoney = myMoney - taxMoney[7];
            int taxPlus1 = (taxMoney2[1] / 100) * taxPercent[0];
            int taxPlus2 = (taxMoney2[2] / 100) * taxPercent[1];
            int taxPlus3 = (taxMoney2[3] / 100) * taxPercent[2];
            int taxPlus4 = (taxMoney2[4] / 100) * taxPercent[3];
            int taxPlus5 = (taxMoney2[5] / 100) * taxPercent[4];
            int taxPlus6 = (taxMoney2[6] / 100) * taxPercent[5];
            int taxPlus7 = (taxMoney2[7] / 100) * taxPercent[6];
            myTax1 = (nowMoney / 100 ) * taxPercent[7];
            allTax = myTax1 + taxPlus1 + taxPlus2 + taxPlus3 + taxPlus4 + taxPlus5 + taxPlus6 + taxPlus7;
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[1], taxPercent[0], taxPlus1);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[2], taxPercent[1], taxPlus2);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[3], taxPercent[2], taxPlus3);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[4], taxPercent[3], taxPlus4);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[5], taxPercent[4], taxPlus5);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[6], taxPercent[5], taxPlus6);
            System.out.printf("%10d * %2d%% = %10d\n",taxMoney2[7], taxPercent[6], taxPlus7);
            System.out.printf("%10d * %2d%% = %10d\n",nowMoney, taxPercent[7], myTax1);
            System.out.println();
            System.out.printf("[세율에 의한 세금] : \t\t\t%d\n", (allTax));
        }
    }


    public static void accTaxCal(){
        int myTax2;
        for(int i =0; i < 7; i++){
            if(myMoney <= taxMoney[i+1] && myMoney > taxMoney[i]){
                myTax2 = (myMoney / 100) * taxPercent[i] - accTax[i];
                System.out.printf("[누진공제 계산에 의한 세금] : \t%d",myTax2);
            }
        }
        if(myMoney > 1000000000){
            myTax2 = (myMoney / 100) * taxPercent[7] - accTax[7];
            System.out.printf("[누진공제 계산에 의한 세금] : \t%d",myTax2);
        }
    }
}
