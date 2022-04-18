import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import servlets.BookLibrary;
import servlets.MainServlet;
import servlets.LoginPage;
import servlets.ResetPasswordServlet;


public class ServerClass {

    /*
    Simple server class used to create a local server for testing. Starts and controls mappings of the server.
     */
    public static void main(String[] args) {

        Tomcat server = new Tomcat();
        server.setBaseDir("java.io.tmpdir");
        server.setPort(8080);
        server.getConnector();
        server.addContext("",null);

        server.addServlet("", "mainServlet", new MainServlet()).addMapping("/*");
        server.addServlet("", "loginServlet", new LoginPage()).addMapping("/login");
        server.addServlet("", "forgotPassword", new ResetPasswordServlet()).addMapping("/reset");
        server.addServlet("", "bookLibrary", new BookLibrary()).addMapping("/Book-demos.Library");

        try {
            server.start();
            System.out.println("Server is running on http://localhost:" + server.getConnector().getLocalPort());
            server.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }



    }
}
