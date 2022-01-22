package NuevoSevlet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class es
 */
@WebServlet("/es")
public class es extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public es() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		PrintWriter printWriter = response.getWriter();
		printWriter.print("<html>");
		printWriter.print("Hola "+request.getParameter("nombre")+" "+request.getParameter("apellido"));
		printWriter.print("<br>");
		printWriter.print("Bienvenido al el primer Servlet sus datos son: <br>");
		printWriter.print("Usuario: "+request.getParameter("usuario")+"<br>");
		printWriter.print("Correo: "+request.getParameter("correo")+"<br>");
		printWriter.print("Telefono: "+request.getParameter("telefono")+"<br>");
		printWriter.print("GRACIAS!! <br>");
		printWriter.print("</html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
