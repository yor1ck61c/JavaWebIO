package IOexercise;

import java.io.File;

/*
* 创建目录
* mkdir（确保上级目录存在，否则失败）
* mkdirs（上级目录可以不存在，如不存在会一同创建）
* */
public class DirDemo01 {
    public static void main(String[] args) {
        String path = "C:/Users/ASUS/Desktop/dir/test";
        File dir = new File(path);

        //创建目录
        boolean flag = dir.mkdir();
        System.out.println(flag);

        flag = dir.mkdirs();
        System.out.println(flag);


    }
}
