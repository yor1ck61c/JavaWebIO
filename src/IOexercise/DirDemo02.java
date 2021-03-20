package IOexercise;

import java.io.File;

/*
* 列出下一级
* 1.list():列出下一级名称 返回字符串数组
* 2.listFiles():列出下一级File对象
* */
public class DirDemo02 {

    public static void main(String[] args) {
        String path = "C:/Users/ASUS/Desktop";
        File dir = new File(path);

        //下级名称
        String[] list = dir.list();
        assert list != null;
        for (String s: list) {
            System.out.println(s);
        }

        //下级文件对象
        File[] files = dir.listFiles();
        assert files != null;
        for (File fs:files) {
            System.out.println(fs);
        }

        //所有盘符
        File[] roots = dir.listRoots();

    }
}
