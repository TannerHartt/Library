package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import java.io.IOException;
import java.io.InputStream;

public class DefaultServlet extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws IOException {
        String filename = req.getPathInfo().replaceFirst("/", "");
        String resourceDir = "static";
        if (filename.equals("/") || filename.equals("")) filename = "index.html";
        InputStream file = getClass().getClassLoader().getResourceAsStream(filename);

        if (file == null) {
            resp.setStatus(404);
            try {
                file.getClass().getClassLoader().getResourceAsStream("index.html");
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
