

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Servlet6
 */
@WebServlet("/Servlet6")
public class Servlet6 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Servlet6() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String eno1= request.getParameter("e1");
		String name1= request.getParameter("n1");
		String salary1= request.getParameter("s1");
		String dept1= request.getParameter("d1");

		//setattribute(attributename,attributevalue)
		request.setAttribute("Employeenumber", eno1);//attributename,attributevalue
		request.setAttribute("Empname", name1);
		request.setAttribute("Salary", salary1);
		request.setAttribute("Depart", dept1);

		ServletContext context= getServletContext();
		RequestDispatcher rd= context.
				getRequestDispatcher("/Servlet7");
		rd.forward(request, response);


	}

}
