package web.service;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.nio.charset.StandardCharsets;

@WebServlet("/deleteHomeworkServlet")
public class deleteHomeworkServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        String fileName = new String(request.getParameter("fileName").getBytes(StandardCharsets.ISO_8859_1), StandardCharsets.UTF_8);
        File dirs =(File) request.getSession().getAttribute("homeworkDirs");
        File homework = new File(dirs.getAbsolutePath(), fileName);
        System.out.println(homework.getName());
        boolean delete = homework.delete();

        request.getRequestDispatcher("findAllHomeworkServlet").forward(request,response);
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
