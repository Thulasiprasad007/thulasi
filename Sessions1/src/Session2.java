

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import com.mysql.cj.Session;

/**
 * Servlet implementation class Session2
 */
@WebServlet("/Session2")
public class Session2 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Session2() {
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
		String msg="";
		HttpSession h=request.getSession();
		if(h.isNew())
		{
			h.setAttribute("f", new int[] {0});
			h.setAttribute("g",new int[]{0});
		}
		int[] foo=(int[])h.getAttribute("f");
		int[] bar=(int[])h.getAttribute("g");
		if(request.getParameter("foo")!=null)
		{
			foo[0]++;
			msg="bhought a pepsi.you have"+foo[0];
		}
		else if(request.getParameter("bar")!=null)
		{
			bar[0]++;
			msg="bhought a Mirindha.you have"+bar[0];
		}
		else if(request.getParameter("see")!=null)
		{  
			h.invalidate();
			msg="You have"+foo[0]+"Pepsi And"+bar[0]+"Marinda in your cart";
		}
		else
		{
		     h.invalidate();
		     msg="Your order for"+foo[0]+"pepsi and"+bar[0]+"Maridha is Accepted.Your shopping cart is empty";
		}
		PrintWriter w=response.getWriter();
		w.println("<h1>"+msg);
		w.println("<a href='Session1'>Back to shop</a>");
	}

}
