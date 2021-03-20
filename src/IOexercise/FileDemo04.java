package IOexercise;

import java.io.File;

public class FileDemo04 {

    public static void main(String[] args) {
        /*
        * 文件状态
        * */

        String path = "C:/Users/ASUS/Desktop/homework.jpg";
        File src = new File(path);

        //是否存在
        System.out.println(src.exists());
        //是否是文件
        System.out.println(src.isFile());
        //是否是文件夹
        System.out.println(src.isDirectory());

        //常用操作

        src = new File("xxx");
        if(null == src || !src.exists()){
            //文件不存在的操作
            System.out.println("文件不存在");
        }else {
            if (src.isFile()){
                System.out.println("文件操作");
            }else{
                System.out.println("文件夹操作");
            }
        }
    }
}
