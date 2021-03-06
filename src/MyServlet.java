import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by teaching on 2017-04-10.
 */
@WebServlet(name = "MyServlet")
public class MyServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

        //provide a proper html document as a response

        //get an stream for writing our response to
        PrintWriter out = response.getWriter();

        //parse the request in order to make some decisions on what to provide as a response
        String query = request.getQueryString();
		/*all we'll do is show the query string back to the user
		 * however you could do anything you want with it such as
		 * tokenize it and make a database request or whatever
		 * TODO: as an exercise open a database connection or file and serve an xml document
		 */

        //create a title for the Web page (that we can change easily)
        String title = "This is my first web page";
        //declare a string to hold the first line of html (the xml doctype)
        String docType = "<!doctype html public \"-//w3c//dtd html 4.0 transitional//en\">\n";
        String message = "wow that was easy";
        //formulate and write a response so the user can reneder the request
        out.println(docType + "<html>\n" + "<head><title>" + title + "</title> </head>" +
                "<body bgcolor=\"#f0f0f0\"><h1 align=\"center\">" + message + "</h1>User's request was: "+ query + "</body></html>");



    }
}
