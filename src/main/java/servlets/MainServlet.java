package servlets;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import java.io.IOException;
import java.io.InputStream;

public class MainServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String filename = req.getPathInfo().replaceFirst("/", "");
        String resourceDir = "mainPage";
        if (filename.equals("/") || filename.equals("")) filename = "ServerHomePage/index.html";
        InputStream file = getClass().getClassLoader().getResourceAsStream(filename);

        if (file == null) {
            resp.setStatus(404);
            try {
                file.getClass().getClassLoader().getResourceAsStream("ServerHomePage/index.html");
            } catch (NullPointerException e) {
                e.printStackTrace();
            }

            return;
        }

        String mimeType = getServletContext().getMimeType(filename);
        resp.setContentType(mimeType);
        IOUtils.copy(file, resp.getOutputStream());
    }
}
