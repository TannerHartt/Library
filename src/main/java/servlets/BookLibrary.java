package servlets;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import org.apache.tomcat.util.http.fileupload.IOUtils;
import java.io.IOException;
import java.io.InputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

public class BookLibrary extends HttpServlet {



    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        InputStream file = getClass().getClassLoader().getResourceAsStream("BookLibrary/main.html");
        IOUtils.copy(file, resp.getOutputStream());
    }
}

class BookServlet extends HttpServlet {
    String url = "";
    String username = "postgres";
    String password = "postgres";


    Connection conn;
    {
        try {
            conn = DriverManager.getConnection(url,username,password);
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

}

class Book {
    private int bookId;
    private String name;
    private String author;
    private int genreId;
    private String isbn;
    private String publisher;
    private int release;

    public Book(int bookId, String name, String author, int genreId, String isbn, String publisher, int release) {
        this.bookId = bookId;
        this.name = name;
        this.author = author;
        this.genreId = genreId;
        this.isbn = isbn;
        this.publisher = publisher;
        this.release = release;
    }

    @Override
    public String toString() {
        return "Book{" +
                "bookId=" + bookId +
                ", name='" + name + '\'' +
                ", author='" + author + '\'' +
                ", genreId=" + genreId +
                ", isbn='" + isbn + '\'' +
                ", publisher='" + publisher + '\'' +
                ", release=" + release +
                '}';
    }

    public int getBookId() { return bookId; }
    public void setBookId(int bookId) { this.bookId = bookId; }
    public String getName() { return name; }
    public void setName(String name) { this.name = name; }
    public String getAuthor() { return author; }
    public void setAuthor(String author) { this.author = author; }
    public int getGenreId() { return genreId; }
    public void setGenreId(int genreId) { this.genreId = genreId; }
    public String getIsbn() { return isbn; }
    public void setIsbn(String isbn) { this.isbn = isbn; }
    public String getPublisher() { return publisher; }
    public void setPublisher(String publisher) { this.publisher = publisher; }
    public int getRelease() { return release; }
    public void setRelease(int release) { this.release = release; }
}
