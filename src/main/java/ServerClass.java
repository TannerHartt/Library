import org.apache.catalina.LifecycleException;
import org.apache.catalina.startup.Tomcat;
import servlets.DefaultServlet;
import servlets.LoginPage;


public class ServerClass {

    public static void main(String[] args) {

        Tomcat server = new Tomcat();
        server.setBaseDir("java.io.tmpdir");
        server.setPort(8080);
        server.getConnector();
        server.addContext("",null);

        server.addServlet("", "mainServlet", new DefaultServlet()).addMapping("/*");
        server.addServlet("", "loginServlet", new LoginPage()).addMapping("/login");

        try {
            server.start();
            System.out.println("Server is running on http://localhost:" + server.getConnector().getLocalPort());
            server.getServer().await();
        } catch (LifecycleException e) {
            e.printStackTrace();
        }



    }
}
