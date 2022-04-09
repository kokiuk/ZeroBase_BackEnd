import java.util.Random;

public class MyVote {
    public static void main(String[] args) {
        int people1 = 0;
        int people2 = 0;
        int people3 = 0;
        int people4 = 0;
        String name = "";
        Random random = new Random();
//        System.out.println("voteNum = " + voteNum);
        for(int i=0; i<10000; i++){
            int voteNum = random.nextInt(4)+1;
//            System.out.println("voteNum = " + voteNum);
            if(voteNum == 1){
                name = "이재명";
                people1 ++;
//                System.out.println("people1 = " + people1);
            }
            else if(voteNum == 2){
                name = "윤석열";
                people2 ++;
//                System.out.println("people2 = " + people2);
            }
            else if(voteNum == 3){
                name = "심상정";
                people3 ++;
//                System.out.println("people3 = " + people3);
            }
            else{
                name = "안철수";
                people4 ++;
//                System.out.println("people4 = " + people4);
            }
            double allVoteNum = people1 + people2 + people3 + people4;
            double voteRate = (allVoteNum / 10000) * 100;
            double num1Rate = (people1/allVoteNum) * 100;
            double num2Rate = (people2/allVoteNum) * 100;
            double num3Rate = (people3/allVoteNum) * 100;
            double num4Rate = (people4/allVoteNum) * 100;
//            System.out.printf("%.2f%%\n",voteRate);

            System.out.printf("[투표진행율]: %.2f%%, %.0f명 투표 ==> %s\n",voteRate,allVoteNum,name);
            System.out.printf("[기호:1] 이재명: %.2f%%, (투표수: %d)\n",num1Rate,people1);
            System.out.printf("[기호:2] 윤석열: %.2f%%, (투표수: %d)\n",num2Rate,people2);
            System.out.printf("[기호:3] 심상정: %.2f%%, (투표수: %d)\n",num3Rate,people3);
            System.out.printf("[기호:4] 안철수: %.2f%%, (투표수: %d)\n",num4Rate,people4);
            System.out.println("");
        }
        if(people1 > people2 && people1 > people3 && people1 > people4){
            System.out.println("[투표결과] 당선인 : 이재명 ");
        }
        else if(people2 > people1 && people2 > people3 && people2 > people4){
            System.out.println("[투표결과] 당선인 : 윤석열 ");
        }
        else if(people3 > people1 && people3 > people2 && people3 > people4){
            System.out.println("[투표결과] 당선인 : 심상정 ");
        }
        else if(people4 > people1 && people4 > people2 && people4 > people3){
            System.out.println("[투표결과] 당선인 : 안철수 ");
        }

    }

}
