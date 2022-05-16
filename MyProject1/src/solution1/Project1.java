package solution1;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/*
    ZeroBase 백엔드 고기욱
*/

public class Project1{
    public static void main(String[] args) {

        String html = "";

        //테이블 css
        html += "<head>";
        html +=     "<meta charset='UTF-8'/>";
        html +=     "<style>";
        html +=         "table { border-collapse: collapse; width: 100%; }";
        html +=         "th, td { border: solid 1px #000; }";
        html +=     "</style>";
        html += "</head>";

        html += "<body>";

        html += "<div style =\"width:100%; height:50px; line-height:50px;\">";
        html +=     "<span style=\"font-size:25px; font-weight:bold;\">자바 환경정보</span>";
        html += "</div>";

        //테이블 셋팅
        html += "<table>";
        html +=     "<thead>";
        html +=         "<th>키</th>";
        html +=         "<th></th>";
        html +=     "</thead>";
        html +=     "<tbody>";

        //테이블 내용
        for(Object k : System.getProperties().keySet()){
            String key = k.toString();
            String value = System.getProperty(key);

            html += "<tr>";
            html +=     "<td>" + key + "</td>";
            html +=     "<td>" + value + "</td>";
            html += "</tr>";
        }

        html +=     "</tbody>";
        html += "</table>";
        html += "</body>";

        //파일 만들기
        try {
            File file = new File("property.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(html);
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            System.out.println("== The End ==");
        }

    }

}

