/*
 * vivek 2014121
 * himanshu 2014047
 */
import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import org.scribe.builder.ServiceBuilder;
import org.scribe.oauth.OAuthService;

@WebServlet("/googleplus") 
public class GooglePlusServlet extends HttpServlet {
   private static final String CLIENT_ID = "486701667226-48s997ioibsfmv0vgd8tbqi30ksen650.apps.googleusercontent.com";
   private static final String CLIENT_SECRET = "X8QAy3H0vwbYYYy4wd_Flrgq";
   @Override 
   protected void doGet(HttpServletRequest req, HttpServletResponse res) 
      throws IOException, ServletException {
      //Configure 
		/*if(request.getParameter("s_pi_email")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_name")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_add")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_mob")==null)
		{
			flag=0;
		}
		else if(request.getParameter("s_pi_mob").length()!=10)
		{
			flag=0;
		}
		else
		{
			try
       	{
       		Integer.parseInt(request.getParameter("s_pi_mob"));
       	}
   		catch(Exception e)
   		{
   			flag=0;
   		}
		}
		System.out.println(flag);
		if(request.getParameter("s_pi_phd")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_p1")==null)
		{
			flag=0;
		}
		else if(request.getParameter("s_pi_p1").equals("-------"))
		{
			flag=0;
		}
		if(request.getParameter("s_pi_p2")==null)
		{
			flag=0;
		}
		else if(request.getParameter("s_pi_p2").equals("-------"))
		{
			flag=0;
		}
		if(request.getParameter("s_pi_p3")==null)
		{
			flag=0;
		}
		else if(request.getParameter("s_pi_p3").equals("-------"))
		{
			flag=0;
		}
		if(request.getParameter("s_pi_gender")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_cat")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_pd")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_dob")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_ww")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_fname")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_nat")==null)
		{
			flag=0;
		}
		else if(request.getParameter("s_pi_nat").equals("-------"))
		{
			flag=0;
		}
		if(request.getParameter("s_pi_perm_add")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_pi_pc")==null)
		{
			flag=0;
		}
		else 
		{
   		try
       	{
       		Integer.parseInt(request.getParameter("s_pi_pc"));
       	}
   		catch (Exception e)
   		{
   			flag=0;
   		}
		}
		if(request.getParameter("s_ei_x_board")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_x_marks")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_yopx")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_xii_board")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_xii_marks")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_yopxii")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_deg")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_dep")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_coll")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_uni")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_city")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_state")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_yog")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_cgpa_or_marks")==null)
		{
			flag=0;
		}
		if(request.getParameter("s_ei_ece_phd")==null)
		{
			//
		}
		else if(request.getParameter("s_ei_ece_phd").equals("on"))
		{
			if(request.getParameter("s_ece_p1")==null)
			{
				flag=0;
			}
			if(request.getParameter("s_ece_p2")==null)
			{
				flag=0;
			}
			if(request.getParameter("s_ece_p3")==null)
			{
				flag=0;
			}
		}
		if(request.getParameter("s_ei_pg")==null)
		{
			//
		}
		else if(request.getParameter("s_ei_pg").equals("on"))
		{
			if(request.getParameter("s_pg_coll")==null)
			{
				flag=0;
			}
			if(request.getParameter("s_pg_dep")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_deg")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_thesis")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_state")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_yog")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_cgpa_or_marks")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_cgpa")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_pg_marks")==null)
			{
				flag=0;
			}
			
		}
		if(request.getParameter("s_ei_oth")==null)
		{
			//
		}
		else if(request.getParameter("s_ei_oth").equals("on"))
		{
			if(request.getParameter("s_oth_name")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_oth_sub")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_oth_score")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_oth_rank")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_oth_state")==null)
			{
				flag=0;
			}
		}
		if(request.getParameter("s_ei_gate")==null)
		{
			//
		}
		else if(request.getParameter("s_ei_gate").equals("on"))
		{
			if(request.getParameter("s_gate_area")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_gate_marks")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_gate_score")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_gate_rank")==null)
			{
				flag=0;
			}
			else if(request.getParameter("s_gate_yog")==null)
			{
				flag=0;
			}
		}
		if(request.getParameter("s_ei_ach")==null)
		{
			flag=0;
		}
		if(flag==1)
		{
			w.println("<html><body><h1> Form Submitted <h1></body></html>");
		}
		else*/
      ServiceBuilder builder= new ServiceBuilder(); 
      OAuthService service = builder.provider(Google2Api.class) 
         .apiKey(CLIENT_ID) 
         .apiSecret(CLIENT_SECRET) 
         .callback("http://localhost:8080/j9/arsenal")
         .scope("openid profile email " + 
               "https://www.googleapis.com/auth/plus.login " + 
               "https://www.googleapis.com/auth/plus.me")
         .debug() 
         .build();
      HttpSession sess = req.getSession(); 
      sess.setAttribute("oauth2Service", service);
      res.sendRedirect(service.getAuthorizationUrl(null)); 
   } 
} 