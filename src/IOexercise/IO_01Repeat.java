package IOexercise;

import java.io.*;

public class IO_01Repeat {
    public static void main(String[] args)  {
        File src = new File("C:\\Users\\ASUS\\IdeaProjects\\WebExperi6\\test.txt");
        InputStream inputStream = null;
        try {
            inputStream = new FileInputStream(src);
            int temp;
            while((temp = inputStream.read()) != -1)
                System.out.println((char) temp);
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            try {
                assert inputStream != null;
                inputStream.close();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
    }
}
