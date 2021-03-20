package IOexercise;

import java.io.*;

/*
* 文件字节输出流
* 1.创建源
* 2.选择流
* 3.操作
* 4.释放资源
* */
public class IO_03 {

    public static void main(String[] args) {

        File dest = new File("C:\\Users\\ASUS\\IdeaProjects\\WebExperi6\\test2.txt");

        OutputStream outputStream = null;

        try {
            outputStream = new FileOutputStream(dest);//括号内写为(dest,true)时会在原本文件内附加新内容 false时会清除掉原有内容再写新内容
            //操作：写出
            String message = "Hello OS";
            byte[] data = message.getBytes();
            try {
                outputStream.write(data,0,data.length);
            } catch (IOException e) {
                e.printStackTrace();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

    }
}
