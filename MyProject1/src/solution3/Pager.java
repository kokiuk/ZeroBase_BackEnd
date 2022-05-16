package solution3;

import java.io.IOException;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class Pager {

    private long totalCount; //total 게시글 수
    private long pageCount; //페이지 수
    private long pageIndex; //현재 페이지번호

    private final int PAGE_MAX = 10; //한 페이지당 보여지는 글의 수
    private final int PAGE_VIEW_MAX = 10; //페이지네비게이션에서 보여주는 블럭수

    Pager(long totalCount) {
        this.totalCount = totalCount;
        //페이지 수 계산 (전체 게시글 - 1) / 한 페이지당 보여지는 글의 수 + 1
        this.pageCount = ((totalCount - 1) / PAGE_MAX) + 1;
    }

    //HTML 파일 작성
    public void html(long pageIndex) {
        this.pageIndex = pageIndex;
        try {
            File file = new File("page.html");
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));

            writer.write(htmlMain());
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

    }

    //HTML 파일 내용 작성
    private String htmlMain() {

        int pageEndNum = (int) (pageCount % PAGE_VIEW_MAX); //마지막 페이지 번호의 뒷자리

        String text = "<!DOCTYPE html>\r\n<html>\r\n<head>\r\n\t<meta charset=\"UTF-8\">\r\n\t<title>page</title>\r\n\t<style media=\"screen\">\r\n\t\t.on { color: red; }\r\n\t</style>\r\n</head>\r\n<body>\r\n\t<a href=\'#\'>[처음]</a>\r\n\t<a href=\'#\'>[이전]</a>";

        if (pageCount / PAGE_VIEW_MAX == pageIndex / PAGE_VIEW_MAX && pageIndex % PAGE_VIEW_MAX != 0) {
            for (int i = 1; i <= pageEndNum; i++) {
                text += textJudge(pageIndex, i);
            }
        } else {
            for (int i = 1; i <= PAGE_VIEW_MAX; i++) {
                text += textJudge(pageIndex, i);
            }
        }

        text += "\r\n\t<a href=\'#\'>[다음]</a>\r\n\t<a href=\'#\'>[마지막]</a>\r\n</body>\r\n</html>";
        return text;
    }

    //현재 페이지 표시 구분 메서드
    private String textJudge(long pageIndex, int index) {
        String addText = "";

        if ((pageIndex - 1) % PAGE_VIEW_MAX == index - 1) {
            addText += "\r\n\t<a href=\'#\' class=\"on\">";
            addText += String.valueOf(index + (pageIndex - 1) / PAGE_VIEW_MAX * 10);
            addText += "</a>";
        } else {
            addText += "\r\n\t<a href=\'#\'>";
            addText += String.valueOf(index + (pageIndex - 1) / PAGE_VIEW_MAX * 10);
            addText += "</a>";
        }
        return addText;
    }

}