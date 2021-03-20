package IOexercise;

import java.io.File;

public class FileDemo02 {
    public static void main(String[] args) {
        String path = "C:/Users/ASUS/Desktop/homework.jpg";
       /*
       * 相对路径与绝对路径
       * 1.存在盘符：绝对路径
       * 2.不存在盘符：相对路径  相对于项目路径 System.property("user.dir");
       * */

       //file可构建一个不存在的路径/文件/文件夹
        File src = new File(path);
        System.out.println(System.getProperty("user.dir"));
        src = new File("C:\\Users\\ASUS\\IdeaProjects\\GetAndPost\\unexistFile");
        System.out.println(src);
    }
}
