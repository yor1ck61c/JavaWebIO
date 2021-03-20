package IOexercise;

import java.io.File;

public class FileDemo05 {

    public static void main(String[] args) {
        //其他信息 length()方法
        //是文件的情况下才能使用，返回文件字节数，其他情况返回0

        String path = "C:/Users/ASUS/Desktop/homework.jpg";
        File src = new File(path);

        System.out.println(src.length());


    }
}
