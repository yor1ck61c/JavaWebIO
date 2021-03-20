package IOexercise;

import java.io.File;
import java.io.IOException;

public class FileDemo06 {
    /*
    * 其他信息
    * */
    public static void main(String[] args) throws IOException {
        String path = "C:/Users/ASUS/Desktop/io.txt";
        File src = new File(path);

        //在指定位置创建文件,文件不存在才能创建，返回true，如果已经存在则返回false。不能创建文件夹
        boolean status = src.createNewFile();
        System.out.println(status);

        //删除文件
        status = src.delete();
        System.out.println(status);
    }
}
