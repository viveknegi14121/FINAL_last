/*
 * vivek 2014121
 * himanshu 2014047
 */
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
import java.io.ByteArrayInputStream;
import java.io.IOException;
import javax.json.Json;
import javax.json.JsonObject;
import javax.json.JsonReader;
import javax.servlet.AsyncContext;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuthService;
@WebServlet(urlPatterns={"/arsenal"}, asyncSupported=true) 
public class arsenal extends HttpServlet {
	private static final long serialVersionUID = 1L;
	@Override 
   protected void doGet(HttpServletRequest req, HttpServletResponse resp) 
      throws IOException, ServletException {
      String error = req.getParameter("error"); 
      if ((null != error) && ("access_denied".equals(error.trim()))) { 
         HttpSession sess = req.getSession(); 
         sess.invalidate(); 
         resp.sendRedirect(req.getContextPath()); 
         return; 
      } 
      AsyncContext ctx = req.startAsync(); 
      ctx.start(new GetUserInfo(req, resp, ctx)); 
   } 
}
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
   class GetUserInfo implements Runnable { 
   private HttpServletRequest req; 
   private HttpServletResponse resp; 
   private AsyncContext asyncCtx; 
   public GetUserInfo(HttpServletRequest req, HttpServletResponse resp, AsyncContext asyncCtx) { 
      this.req = req; 
      this.resp = resp; 
      this.asyncCtx = asyncCtx; 
   }
   @Override 
   public void run() {  
      HttpSession sess = req.getSession(); 
      OAuthService service = (OAuthService)sess.getAttribute("oauth2Service");
      String code = req.getParameter("code"); 
      Token token = service.getAccessToken(null, new Verifier(code)); 
      sess.setAttribute("token", token);
      try { 
         req.login("fred", "fredfred"); 
      } catch (ServletException e) {  
      }
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
      OAuthRequest oReq = new OAuthRequest(Verb.GET, 
            "https://www.googleapis.com/oauth2/v2/userinfo");//Wait 
      service.signRequest(token, oReq); 
      Response oResp = oReq.send(); 
      System.out.println(oResp.getBody());
      JsonReader reader = Json.createReader(new ByteArrayInputStream( 
            oResp.getBody().getBytes())); 
      JsonObject profile = reader.readObject();  
      sess.setAttribute("name", profile.getString("name")); 
      sess.setAttribute("email", profile.getString("email")); 
      try {
    	if(profile.getString("email").equals("vivek14121@iiitd.ac.in"))
    	{resp.sendRedirect("J95");
    		}
    	
    	else
    		resp.sendRedirect("J94");
	} catch (IOException e) {
		e.printStackTrace();
	}
      //  ... 
      asyncCtx.complete(); 
   } 
}