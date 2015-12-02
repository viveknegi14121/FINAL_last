/*
 * vivek 2014121
 * himanshu negi 2014047
 */
import java.util.regex.Matcher;
import java.util.regex.Pattern;
import org.scribe.builder.api.DefaultApi20;
import org.scribe.exceptions.OAuthException;
import org.scribe.extractors.AccessTokenExtractor;
import org.scribe.model.OAuthConfig;
import org.scribe.model.OAuthConstants;
import org.scribe.model.OAuthRequest;
import org.scribe.model.Response;
import org.scribe.model.Token;
import org.scribe.model.Verb;
import org.scribe.model.Verifier;
import org.scribe.oauth.OAuth20ServiceImpl;
import org.scribe.oauth.OAuthService;
import org.scribe.utils.OAuthEncoder;
import org.scribe.utils.Preconditions;

public class Google2Api extends DefaultApi20 {
    private static final String AUTHORIZE_URL = "https://accounts.google.com/o/oauth2/auth?response_type=code&client_id=%s&redirect_uri=%s";
    private static final String SCOPED_AUTHORIZE_URL = AUTHORIZE_URL + "&scope=%s";
    @Override
    public String getAccessTokenEndpoint() {
        return "https://accounts.google.com/o/oauth2/token";
    }
    
    @Override
    public AccessTokenExtractor getAccessTokenExtractor() {
        return new AccessTokenExtractor() {
            
            @Override
            public Token extract(String response) {
                Preconditions.checkEmptyString(response, "Response body is incorrect. Can't extract a token from an empty string");
                Matcher matcher = Pattern.compile("\"access_token\" : \"([^&\"]+)\"").matcher(response);
                if (matcher.find())
                {
                  String token = OAuthEncoder.decode(matcher.group(1));
                  return new Token(token, "", response);
                } 
                else
                {
                  throw new OAuthException("Response body is incorrect. Can't extract a token from this: '" + response + "'", null);
                }
            }
        };
    }
    @Override
    public String getAuthorizationUrl(OAuthConfig config) {
        if (config.hasScope()) {
            return String.format(SCOPED_AUTHORIZE_URL, config.getApiKey(),
                    OAuthEncoder.encode(config.getCallback()),
                    OAuthEncoder.encode(config.getScope()));
        } else {
            return String.format(AUTHORIZE_URL, config.getApiKey(),
                    OAuthEncoder.encode(config.getCallback()));
        }
    }
    
    @Override
    public Verb getAccessTokenVerb() {
        return Verb.POST;
    }
    
    @Override
    public OAuthService createService(OAuthConfig config) {
        return new GoogleOAuth2Service(this, config);
    }
    
    private class GoogleOAuth2Service extends OAuth20ServiceImpl {
        private static final String GRANT_TYPE_AUTHORIZATION_CODE = "authorization_code";
        private static final String GRANT_TYPE = "grant_type";
        private DefaultApi20 api;
        private OAuthConfig config;
        public GoogleOAuth2Service(DefaultApi20 api, OAuthConfig config) {
            super(api, config);
            this.api = api;
            this.config = config;
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
        @Override
        public Token getAccessToken(Token requestToken, Verifier verifier) {
            OAuthRequest request = new OAuthRequest(api.getAccessTokenVerb(), api.getAccessTokenEndpoint());
            switch (api.getAccessTokenVerb()) {
            case POST:
                request.addBodyParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
                request.addBodyParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
                request.addBodyParameter(OAuthConstants.CODE, verifier.getValue());
                request.addBodyParameter(OAuthConstants.REDIRECT_URI, config.getCallback());
                request.addBodyParameter(GRANT_TYPE, GRANT_TYPE_AUTHORIZATION_CODE);
                break;
            case GET:
            default:
                request.addQuerystringParameter(OAuthConstants.CLIENT_ID, config.getApiKey());
                request.addQuerystringParameter(OAuthConstants.CLIENT_SECRET, config.getApiSecret());
                request.addQuerystringParameter(OAuthConstants.CODE, verifier.getValue());
                request.addQuerystringParameter(OAuthConstants.REDIRECT_URI, config.getCallback());
                if(config.hasScope()) request.addQuerystringParameter(OAuthConstants.SCOPE, config.getScope());
            }
            Response response = request.send();
            return api.getAccessTokenExtractor().extract(response.getBody());
        }
    }
}