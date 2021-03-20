package web.service;

import domain.homework;
import org.apache.commons.beanutils.BeanUtils;
import service.UserService;
import service.impl.UserServiceImpl;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.File;
import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import java.util.Map;

@WebServlet("/userLoginServlet")
public class userLoginServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        homework userByUP = null;
        UserService service = new UserServiceImpl();
        if(request.getSession().getAttribute("userUP") != null){
            userByUP =(homework) request.getSession().getAttribute("userUP");
        }else {
            Map<String, String[]> userInfo = request.getParameterMap();
            homework user = new homework();
            try {
                BeanUtils.populate(user,userInfo);
            } catch (IllegalAccessException | InvocationTargetException e) {
                e.printStackTrace();
            }

            userByUP = service.findUserByUP(user);
        }


        if(userByUP != null){
            request.getSession().setAttribute("userUP",userByUP);
            String username = userByUP.getUsername();
            File dirs = service.createDirs(username);
            request.getSession().setAttribute("homeworkDirs",dirs);
            request.getRequestDispatcher("homeworkManagePage.jsp").forward(request,response);
        }

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        this.doPost(request, response);
    }
}
