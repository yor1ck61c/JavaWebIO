package IOexercise;

import java.io.*;

/*
 * 第一个程序：理解操作步骤
 * 1.创建源
 * 2.选择流
 * 3.操作
 * 4.释放资源
 * */
public class IO_02 {

    public static void main(String[] args)  {
        File src = new File("C:\\Users\\ASUS\\IdeaProjects\\WebExperi6\\test.txt");
        System.out.println(src.getAbsolutePath());
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(src);
            //操作(分段读取)
            byte[] flush = new byte[1024*10];
            int len = -1;
            while((len = inputStream.read(flush)) != -1){
                String str = new String(flush,0,len);
                System.out.println(str);
            }

        } catch (IOException e) {
            e.printStackTrace();
        } finally {
            //释放资源
            try {
                assert inputStream != null;
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
