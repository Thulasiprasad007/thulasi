

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletConfig;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebInitParam;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class Config1
 */
@WebServlet(
		urlPatterns = { "/Config1" }, 
		initParams = { 
				@WebInitParam(name = "Company", value = "CTS"), 
				@WebInitParam(name = "Venue", value = "Chennai")
		})
public class Config1 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Config1() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
    String v1,t1;
    public void init(ServletConfig config) throws ServletException
    {
    	super.init(config);
    	v1=config.getInitParameter("Company");
    	t1=config.getInitParameter("Venue");    	
    }
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		     PrintWriter p=response.getWriter();
		      ServletConfig con=getServletConfig();
		      p.println("Company:"+con.getInitParameter("Company"));
		      p.println("Venue:"+con.getInitParameter("Venue"));
		      p.println("<h3>Venue:"+v1);
		      p.println("<h3>Company:"+t1);
		
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
