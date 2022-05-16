package solution3;

/*
    ZeroBase 백엔드 고기욱
*/

public class Project3 {
    public static void main(String[] args) {
        long totalCount = 127;
        long pageIndex = 1;

        Pager pager = new Pager(totalCount);
        pager.html(pageIndex);
    }
}
