package U4_Java集合.T2_6_公告管理案例;

import java.util.ArrayList;
import java.util.Date;

public class NoticeTest {
    public static void main(String[] args) {
        Notice notice1 = new Notice(1, "欢迎来到慕课网", "管理员", new Date());
        Notice notice2 = new Notice(2, "请同学们按时提交作业", "老师", new Date());
        Notice notice3 = new Notice(3, "考勤通知", "老师", new Date());

        // 添加公告
        ArrayList noticeList = new ArrayList<>();
        noticeList.add(notice1);
        noticeList.add(notice2);
        noticeList.add(notice3);

        // 显示公告
        System.out.println("显示公告内容：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice)noticeList.get(i)).getTitle());
        }
        System.out.println("------------------");

        // 在第一条公告后面添加新公告
        Notice notice4 = new Notice(3, "在线编辑器可以使用啦", "管理员", new Date());
        noticeList.add(1, notice4);

        // 显示公告
        System.out.println("显示添加后的公告内容：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice)noticeList.get(i)).getTitle());
        }
        System.out.println("------------------");

        // 删除按时完成作业的公告
        noticeList.remove(2);

        // 显示公告
        System.out.println("显示删除后的公告内容：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice)noticeList.get(i)).getTitle());
        }
        System.out.println("------------------");

        // 将第二条公告改为Java在线编辑器可以使用啦
        notice4.setTitle("Java在线编辑器可以使用啦");

        // 显示公告
        System.out.println("改正后的公告内容：");
        for (int i = 0; i < noticeList.size(); i++) {
            System.out.println(i + 1 + ":" + ((Notice)noticeList.get(i)).getTitle());
        }
        System.out.println("------------------");
    }
}
