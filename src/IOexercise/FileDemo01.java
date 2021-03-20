package IOexercise;

import java.io.File;

public class FileDemo01 {
    public static void main(String[] args) {
        String path = "C:/Users/ASUS/Desktop/homework.jpg";
        //构建File对象
        File src = new File(path);
        System.out.println(src.length());

        //构建File对象2             路径可任意拼接
        src = new File("C:/Users/ASUS/Desktop","homework.jpg");
        System.out.println(src.length());

        //构建File对象3
        src = new File(new File("C:/Users/ASUS/Desktop"),"homework.jpg");
        System.out.println(src.length());
    }
}
