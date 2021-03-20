package IOexercise;

import java.io.File;

public class FileDemo03 {

    public static void main(String[] args) {

        //基本信息

        String path = "C:/Users/ASUS/Desktop/homework.jpg";
        File src = new File(path);
        //名称
        System.out.println(src.getName());
        //路径（相对或绝对，根据创建时的路径返回）
        System.out.println(src.getPath());
        //绝对路径
        System.out.println(src.getAbsolutePath());
        //父路径(返回分隔符前一个的名称，没有就返回null)
        System.out.println(src.getParent());
        //父对象
        System.out.println(src.getParentFile());



    }
}
