package IOexercise;

import java.io.File;

/*
* 列出下一级
* 1.list():列出下一级名称 返回字符串数组
* 2.listFiles():列出下一级File对象
* */
public class DirDemo03 {

    public static void main(String[] args) {
        //打印子孙级目录和文件名称
        String path = "C:\\Users\\ASUS\\IdeaProjects\\WebExperi6";
        File dir = new File(path);

        printFile(dir);


    }

    public static void printFile(File src){
        System.out.println(src.getName());
        if(src == null || !src.exists()){
            return;
        }else if (src.isDirectory()){
            for (File fs: src.listFiles()) {
                printFile(fs);
            }
        }
    }
}
