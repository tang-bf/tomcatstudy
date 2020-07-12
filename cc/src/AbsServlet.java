import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * @ProjectName: tomcatStudy
 * @Package: PACKAGE_NAME
 * @ClassName: AbsServlet
 * @Description:
 * @Author: tbf
 * @CreateDate: 2020-04-25 20:22
 * @UpdateUser: Administrator
 * @UpdateDate: 2020-04-25 20:22
 * @UpdateRemark:
 * @Version: 1.0
 */

public class AbsServlet extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get   sssss...");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post   sssss...");
    }
}
