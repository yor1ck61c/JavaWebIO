package web.service;

import org.apache.commons.fileupload.FileItem;
import org.apache.commons.fileupload.disk.DiskFileItemFactory;
import org.apache.commons.fileupload.servlet.ServletFileUpload;

import javax.servlet.ServletException;
import javax.servlet.ServletInputStream;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.*;
import java.util.List;
import java.util.Objects;

@WebServlet("/uploadHomeworkServlet")
public class uploadHomeworkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        response.setCharacterEncoding("utf-8");

        DiskFileItemFactory diskFileItemFactory = new DiskFileItemFactory();
        ServletFileUpload servletFileUpload = new ServletFileUpload(diskFileItemFactory);
        servletFileUpload.setHeaderEncoding("utf-8");
        diskFileItemFactory.setSizeThreshold( 1024 * 500);
        File temp = new File("C:\\Users\\ASUS\\IdeaProjects\\WebExperi6\\temp");
        diskFileItemFactory.setRepository(temp);
        servletFileUpload.setSizeMax(1024*1024*500);
        File dirs =(File) request.getSession().getAttribute("homeworkDirs");
        try{
            List<FileItem> items = servletFileUpload.parseRequest(request);
            for (FileItem item : items) {
                if (item.isFormField()) {
                    String name = item.getFieldName();
                    String value = item.getString("utf-8");
                    System.out.println(name + ": " + value);
                }
                else {
                    String fileName = item.getName();
                    long sizeInBytes = item.getSize();
                    System.out.println(fileName);
                    System.out.println(sizeInBytes);

                    InputStream in = item.getInputStream();
                    byte[] buffer = new byte[1024];
                    int len = 0;

                    fileName = dirs.getAbsolutePath()+File.separator+fileName;//文件最终上传的位置
                    System.out.println(fileName);
                    OutputStream out = new FileOutputStream(fileName);

                    while ((len = in.read(buffer)) != -1) {
                        out.write(buffer, 0, len);
                    }

                    out.close();
                    in.close();
                    System.out.println("上传完成");
                    request.getRequestDispatcher("findAllHomeworkServlet").forward(request,response);
                }
            }

        }catch (Exception e){
            e.printStackTrace();
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
