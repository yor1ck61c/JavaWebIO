package IOexercise;

import java.io.File;

public class pathDemo1 {
    public static void main(String[] args) {
        String path = "C:\\Users\\ASUS\\Desktop";
        System.out.println(path);
        //suggest:1.
        path = "C:/Users/ASUS/Desktop";
        System.out.println(path);
        //2.
        path = "C:" + File.separator + "Users" + File.separator + "ASUS" + File.separator + "Desktop";
        System.out.println(path);
    }
}
