package domain;

import org.apache.commons.io.FileUtils;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class FileBean {

    File file;

    public File getFile() {
        return file;
    }

    public void setFile(File file) {
        this.file = file;
    }

    public boolean createDir(){
        return file.mkdirs();
    }

    public void deleteSth(File file){
        if(file.exists()) {//判断路径是否存在
            if(file.isFile()){//boolean isFile():测试此抽象路径名表示的文件是否是一个标准文件。
                file.delete();
            }else{//不是文件，对于文件夹的操作
                //保存 路径D:/1/新建文件夹2  下的所有的文件和文件夹到listFiles数组中
                File[] listFiles = file.listFiles();//listFiles方法：返回file路径下所有文件和文件夹的绝对路径
                for (File file2 : listFiles) {
                    /*
                     * 递归作用：由外到内先一层一层删除里面的文件 再从最内层 反过来删除文件夹
                     *    注意：此时的文件夹在上一步的操作之后，里面的文件内容已全部删除
                     *         所以每一层的文件夹都是空的  ==》最后就可以直接删除了
                     */
                    deleteSth(file2);
                }
            }
            file.delete();
        }else {
            System.out.println("该file路径不存在！！");
        }

    }
    public void copyFile(String oldPath, String newPath) throws IOException {
        File oldFile = new File(oldPath);
        File file = new File(newPath);
        FileInputStream in = new FileInputStream(oldFile);
        FileOutputStream out = new FileOutputStream(file);;

        byte[] buffer=new byte[2097152];
        int readByte = 0;
        while((readByte = in.read(buffer)) != -1){
            out.write(buffer, 0, readByte);
        }
        in.close();
        out.close();
    }
    public void copyDir(String sourcePath, String newPath) throws IOException {
        File file = new File(sourcePath);
        String[] filePath = file.list();

        if (!(new File(newPath)).exists()) {
            (new File(newPath)).mkdir();
        }

        for (int i = 0; i < filePath.length; i++) {
            if ((new File(sourcePath + file.separator + filePath[i])).isDirectory()) {
                copyDir(sourcePath+ file.separator+ filePath[i], newPath + file.separator + filePath[i]);
            }
            if (new File(sourcePath+ file.separator + filePath[i]).isFile()) {
                copyFile(sourcePath + file.separator + filePath[i], newPath + file.separator + filePath[i]);
            }

        }
    }

    public void moveFileOrDir(String sourceDir,String destDir) throws IOException {
        FileUtils.moveFile(new File(sourceDir),new File(destDir));
    }
}
