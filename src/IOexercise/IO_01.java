package IOexercise;

import java.io.*;

/*
* 第一个程序：理解操作步骤
* 1.创建源
* 2.选择流
* 3.操作
* 4.释放资源
* */
public class IO_01 {

    public static void main(String[] args)  {
        File src = new File("C:\\Users\\ASUS\\IdeaProjects\\WebExperi6\\test.txt");
        System.out.println(src.getAbsolutePath());
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(src);
            //操作
            /*int data1 = inputStream.read();//第一个数据
            int data2 = inputStream.read();//第二个数据
            //数据不存在会返回-1
            System.out.println((char) data1);
            System.out.println((char) data2);*/
            int temp;
            while((temp = inputStream.read()) != -1){
                System.out.println((char)temp);
            }

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
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
