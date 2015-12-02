/*
 * vivek 2014121
 * himanshu 2014047
 */

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.PrintWriter;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributes;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J96
 */
@WebServlet("/J96")
public class J96 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public J96() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		PrintWriter w=response.getWriter();
		String email,name,enrol,cat,gender,physdis,dob,phd,xboard,xmarks,xiiboard,xiimarks,phdp1,phdp2,phdp3,phdp4,gatescore,yopg;
    	String uguni,ugdep,ugdeg,ugstate,ugmarks,ugcity,pg,pgcoll,pgcity,pgmarks,pgdep,pgdeg,pgstate,pgthesis;
    	String cemail,cdobt,cname,cenrol,ccat,cgender,cpd,cdob,cphd,cgdeg,cpgdeg,cxboard,cxiiboard,cdepg,cdeppg,cunig,cunipg;
    	String cstateg,cstatepg,cxper,cxiiper,cxg,cxl,cxe,cxiig,cxiil,cxiie,cpgper,cgper,cgatescore,cgateg,cgatel,cgatee,cpgg,cpgl,cpge,cgg,cgl,cge,cdatef,cdateu;
    	//cemail=request.getParameter("email");
    	//cname=request.getParameter("name");
    	if(request.getParameter("email")==null)
    	{
    		cemail="";
    	}
    	else
    	{
    		cemail=request.getParameter("email");
    	}
    	if(request.getParameter("name")==null)
    	{
    		cname="";
    	}
    	else
    	{
    		cname=request.getParameter("name");
    	}
    	if(request.getParameter("eno")==null)
    	{
    		cenrol="";
    	}
    	else
    	{
    		cenrol=request.getParameter("eno");
    	}
    	if(request.getParameter("cat")!=null)
    	{
    		ccat=request.getParameter("cat");
    	}
    	else
    	{
    		ccat="";
    	}
    	//RadioButton b=(RadioButton)pi_gender_tog.getSelectedToggle();
		if(request.getParameter("gender")!=null)
		{
			cgender=request.getParameter("gender");
		}
		else
		{
			cgender="";
		}
		//b=(RadioButton)pi_pd_tog.getSelectedToggle();
		if(request.getParameter("pd")!=null)
		{
			cpd=request.getParameter("pd");
		}
		else
		{
			cpd="";
		}

		//b=(RadioButton)pi_dob_tog.getSelectedToggle();
		if(request.getParameter("dob_con")!=null)
		{
			cdobt=request.getParameter("dob_con");
		}
		else
		{
			cdobt="";
		}
		if(request.getParameter("phds")==null)
		{
			cphd="";
		}
		else
		{
			cphd=request.getParameter("phds");
		}
		if(request.getParameter("gd")==null)
		{
			cgdeg="";
		}
		else
		{
			cgdeg=request.getParameter("gd");
		}
		if(request.getParameter("pgd")==null)
		{
			cpgdeg="";
		}
		else
		{
			cpgdeg=request.getParameter("pgd");
		}
		if(request.getParameter("xb")==null)
		{
			cxboard="";
		}
		else
		{
			cxboard=request.getParameter("xb");
		}
		if(request.getParameter("xiib")==null)
		{
			cxiiboard="";
		}
		else
		{
			cxiiboard=request.getParameter("xiib");
		}
		if(request.getParameter("gdep")==null)
		{
			cdepg="";
		}
		else
		{
			cdepg=request.getParameter("gdep");
		}
		if(request.getParameter("pgdep")==null)
		{
			cdeppg="";
		}
		else
		{
			cdeppg=request.getParameter("pgdep");
		}
		if(request.getParameter("gu")==null)
		{
			cunig="";
		}
		else
		{
			cunig=request.getParameter("gu");
		}
		if(request.getParameter("pgu")==null)
		{
			cunipg="";
		}
		else
		{
			cunipg=request.getParameter("pgu");
		}
		//cunig=ei_uni_grad.getText();
		//cunipg=ei_uni_post_grad.getText();
		if(request.getParameter("gs")==null)
		{
			cstateg="";
		}
		else
		{
			cstateg=request.getParameter("gs");
		}
		if(request.getParameter("pgs")==null)
		{
			cstatepg="";
		}
		else
		{
			cstatepg=request.getParameter("pgs");
		}
		if(request.getParameter("xm")==null)
		{
			cxper="";
		}
		else
		{
			cxper=request.getParameter("xm");
		}
		if(request.getParameter("xiim")==null)
		{
			cxiiper="";
		}
		else
		{
			cxiiper=request.getParameter("xiim");
		}
		if(request.getParameter("gm")==null)
		{
			cgper="";
		}
		else
		{
			cgper=request.getParameter("gm");
		}
		if(request.getParameter("pgm")==null)
		{
			cpgper="";
		}
		else
		{
			cpgper=request.getParameter("pgm");
		}
		if(request.getParameter("gatem")==null)
		{
			cgatescore="";
		}
		else
		{
			cgatescore=request.getParameter("gatem");
		}
		/*cxper=request.getParameter("xg");
		cxiiper=request.getParameter("xiig");
		cgper=request.getParameter("gg");
		cpgper=request.getParameter("pgg");
		cgatescore=request.getParameter("gateg");
		*/
		int y1=0,y2=0,y3=0,a1=0,a2=0,a3=0,b1=0,b2=0,b3=0,z1=0,z2=0,z3=0;
		//LocalDate ld;
		//ld=pi_date.getValue();
		
		//System.exit(0);
		if(request.getParameter("dob").length()==0)
		{
			cdob="";
		}
		else
		{
			cdob=request.getParameter("dob");
			System.out.println("Date"+cdob);
			String date_split[]=cdob.split("-");y1=Integer.parseInt(date_split[0]);y2=Integer.parseInt(date_split[1]);y3=Integer.parseInt(date_split[2]);
		}
		//ld=sub_app_from.getValue();
		if(request.getParameter("adf").length()==0)
		{
			cdatef="";
		}
		else
		{
			cdatef=request.getParameter("adf");
			String date_split[]=cdatef.split("-");a1=Integer.parseInt(date_split[0]);a2=Integer.parseInt(date_split[1]);a3=Integer.parseInt(date_split[2]);

		}
		//ld=sub_app_upto.getValue();
		if(request.getParameter("adu").length()==0)
		{
			cdateu="";
		}
		else
		{
			cdateu=request.getParameter("adu");
			String date_split[]=cdateu.split("-");b1=Integer.parseInt(date_split[0]);b2=Integer.parseInt(date_split[1]);b3=Integer.parseInt(date_split[2]);
		}
		if(request.getParameter("xg")!=null)
		{
			cxg="true";
		}
		else
		{
			cxg="";
		}
		if(request.getParameter("xl")!=null)
		{
			cxl="true";
		}
		else
		{
			cxl="";
		}
		if(request.getParameter("xe")!=null)
		{
			cxe="true";
		}
		else
		{
			cxe="";
		}
		if(request.getParameter("xiig")!=null)
		{
			cxiig="true";
		}
		else
		{
			cxiig="";
		}
		if(request.getParameter("xiil")!=null)
		{
			cxiil="true";
		}
		else
		{
			cxiil="";
		}
		if(request.getParameter("xiie")!=null)
		{
			cxiie="true";
		}
		else
		{
			cxiie="";
		}
		if(request.getParameter("gg")!=null)
		{
			cgg="true";
		}
		else
		{
			cgg="";
		}
		if(request.getParameter("ge")!=null)
		{
			cge="true";
		}
		else
		{
			cge="";
		}
		if(request.getParameter("gl")!=null)
		{
			cgl="true";
		}
		else
		{
			cgl="";
		}
		if(request.getParameter("pgg")!=null)
		{
			cpgg="true";
		}
		else
		{
			cpgg="";
		}
		if(request.getParameter("pgl")!=null)
		{
			cpgl="true";
		}
		else
		{
			cpgl="";
		}
		if(request.getParameter("pge")!=null)
		{
			cpge="true";
		}
		else
		{
			cpge="";
		}
		if(request.getParameter("gateg")!=null)
		{
			cgateg="true";
		}
		else
		{
			cgateg="";
		}
		if(request.getParameter("gatel")!=null)
		{
			cgatel="true";
		}
		else
		{
			cgatel="";
		}
		if(request.getParameter("gatee")!=null)
		{
			cgatee="true";
		}
		else
		{
			cgatee="";
		}



		int flag;



    	/*if(pi_email.getText().compareTo(email)!=0)
		{
			flag=2;
		}
		if(pi_name.getText().compareTo(name)!=0)
		{
			flag=2;
		}
		if(pi_enrol_no.getText().compareTo(enrol)!=0)
		{
			flag=2;
		}
		if(pi_cat!=null)
		{
			if(pi_cat.getValue().compareTo(cat)!=0)
			{

				flag=2;
			}
		}
		RadioButton b=(RadioButton)pi_gender_tog.getSelectedToggle();
		if(b!=null)
		{
			if(b.getText().compareTo(gender)!=0)
			{
				flag=2;
			}
		}
		b=(RadioButton)pi_pd_tog.getSelectedToggle();
		if(b!=null)
		{
			if(b.getText().compareTo(physdis)!=0)
			{
				flag=2;
			}
		}
		String str;
		b=(RadioButton)pi_dob_tog.getSelectedToggle();
		if(b!=null)
		{
			if(pi_date.getValue()!=null)
			{
				if(b.getText().compareTo("on")==0)
				{
					ld=pi_date.getValue();
					if(ld!=null)
					{
    					str=ld.toString();
    					if(dob.compareTo(str)!=0)
    					{
    						flag=2;
    					}
					}
				}
				else if(b.getText().compareTo("before")==0)
				{
					ld=pi_date.getValue();
					if(ld!=null)
					{
    					str=ld.toString();
    					if(dob.compareTo(str)!=0)
    					{
    						flag=2;
    					}
					}
				}
			}
		}*/
		//ArrayList<Data>list=new ArrayList<Data>();
		ArrayList<String> list1=new ArrayList<String>();
		ArrayList<String> list2=new ArrayList<String>();
		ArrayList<String> list3=new ArrayList<String>();
		File d=new File("C:\\ap");
    	if(!d.exists())
    	{
    		if(d.mkdir())
    		{
    			System.out.println("Created");
    		}
    		else
    		{
    			System.out.println("Failed");
    		}
    	}
    	String s,line[]=new String[15],str,st;
    	char a[]=new char[15];
    	System.out.println("FGF");
    	//for(File f : d.listFiles()) System.out.println("ASD" + f.getAbsolutePath());
    	for(File f : d.listFiles())
    	{
    		try
    		{
        		flag=1;
    			int i;
	    		BufferedReader wr = new BufferedReader(new FileReader(f));
	    		list3.add(f.getAbsolutePath().toString());
	    		line=wr.readLine().split("/");
	    		email=line[1];
	    		line=wr.readLine().split("/");
	    		name=line[1];
	    		line=wr.readLine().split("/");
	    		enrol=line[1];
	    		wr.readLine();
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		phd=line[1];
	    		wr.readLine();
	    		wr.readLine();
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		gender=line[1];
	    		line=wr.readLine().split("/");
	    		cat=line[1];
	    		line=wr.readLine().split("/");
	    		physdis=line[1];
	    		line=wr.readLine().split("/");
	    		dob=line[1];
	    		for(i=0;i<5;i++)
	    		{
	    			wr.readLine();
	    		}
	    		line=wr.readLine().split("/");
	    		xboard=line[1];
	    		line=wr.readLine().split("/");
	    		xmarks=line[1];
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		xiiboard=line[1];
	    		line=wr.readLine().split("/");
	    		xiimarks=line[1];
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		ugdeg=line[1];
	    		line=wr.readLine().split("/");
	    		ugdep=line[1];
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		uguni=line[1];
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		ugstate=line[1];
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		ugmarks=line[1];
	    		line=wr.readLine().split("/");
	    		//phd=line[1];
	   			line=wr.readLine().split("/");
	    		phdp1=line[1];
	    		line=wr.readLine().split("/");
		   		phdp2=line[1];
		   		line=wr.readLine().split("/");
		   		phdp3=line[1];
		   		line=wr.readLine().split("/");
		    	phdp4=line[1];
		   		line=wr.readLine().split("/");
		    	pg=line[1];
		   		line=wr.readLine().split("/");
		    	pgcoll=line[1];
		   		line=wr.readLine().split("/");
		    	pgcity=line[1];
		   		line=wr.readLine().split("/");
		    	pgstate=line[1];
		   		line=wr.readLine().split("/");
		    	pgdep=line[1];
		    	line=wr.readLine().split("/");
		    	yopg=line[1];
		   		line=wr.readLine().split("/");
		    	pgdeg=line[1];
		   		line=wr.readLine().split("/");
		    	pgthesis=line[1];
		   		line=wr.readLine().split("/");
		   		//System.out.println(line[1]);
		   		if(line[1].equals("null"))
		   			pgmarks="";
		   		else
		   			{
		   			String arr[]=line[1].split(":");
		   			pgmarks=arr[1];
		   			}
		    	
		    	wr.readLine();
		    	wr.readLine();
		    	wr.readLine();
		    	wr.readLine();
		    	wr.readLine();
	    		wr.readLine();
		    	wr.readLine();
		    	wr.readLine();
		    	wr.readLine();
	    		wr.readLine();
	    		line=wr.readLine().split("/");
	    		gatescore=line[1];
	    		str=f.getAbsolutePath();
	    		Path path = Paths.get(str);

	    		BasicFileAttributes attr = Files.readAttributes(path, BasicFileAttributes.class);
	    		st=attr.creationTime().toString();

	    		a=st.toCharArray();
	    		str="";for(i=0;i<=10;i++){if(i==4){z3=Integer.parseInt(str);str="";}else if(i==7){z2=Integer.parseInt(str);str="";}else if(i==10){z1=Integer.parseInt(str);str="";}else str+=a[i];}
	    		wr.close();
	    		flag=1;
	    		if(cname.length()>0&&name.compareTo(cname)!=0)
	    		{
	    			flag=2;
	    		}

	    		if(cemail.length()>0&&email.compareTo(cemail)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cenrol.length()>0&&enrol.compareTo(cenrol)!=0)
	    		{
	    			flag=2;
	    		}

	    		if(ccat.length()>0&&cat.compareTo(ccat)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cgender.length()>0&&gender.compareTo(cgender)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cpd.length()>0&&physdis.compareTo(cpd)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cdob.length()>0)
	    		{
	    			int x1,x2,x3;String date_split[]=dob.split("-");x1=Integer.parseInt(date_split[0]);x2=Integer.parseInt(date_split[1]);x3=Integer.parseInt(date_split[2]);
	    			if(cdobt.compareTo("On")==0)
	    			{if(x1!=y1||x2!=y2||x3!=y3)	{flag=2;}
	    			}
	    			else if(cdobt.compareTo("Before")==0)
	    			{if(y3<x3){flag=2;}else if(y3==x3&&y2<x2){flag=2;}else if(y3==x3&&y2==x2&&y1<x1){flag = 2;}
	    			}
	    			else if(cdobt.compareTo("After")==0)
	    			{if(y3>x3){flag=2;}
	    			else if(y3==x3&&y2>x2){flag=2;}else if(y3==x3&&y2==x2&&y1>x1){flag = 2;}
	    			}
	    		}
	    		if(cphd.length()>0&&cphd.compareTo(phd)!=0)
	    		{
	    			flag=2;
	    		}
    			if(cgdeg.length()>0&&cgdeg.compareTo(ugdeg)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cpgdeg.length()>0&&cpgdeg.compareTo(pgdeg)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cxboard.length()>0&&cxboard.compareTo(xboard)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cxiiboard.length()>0&&cxiiboard.compareTo(xiiboard)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cdepg.length()>0&&cdepg.compareTo(ugdep)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cdeppg.length()>0&&cdeppg.compareTo(pgdep)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cunig.length()>0&&cunig.compareTo(uguni)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cunipg.length()>0&&cunipg.compareTo(uguni)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cstateg.length()>0&&cstateg.compareTo(ugstate)!=0)
	    		{
	    			flag=2;
	    		}
	    		if(cstatepg.length()>0&&cstatepg.compareTo(pgstate)!=0)
	    		{
	    			flag=2;
	    		}

	    		if(cgg.length()+cgl.length()+cge.length()==0)
	    		{

	    		}
	    		else if((cgg.length()>0&&ugmarks.compareTo(cgper)>0)||(cgl.length()>0&&ugmarks.compareTo(cgper)<0)||(cge.length()>0&&ugmarks.compareTo(cgper)==0))
	    		{
	    			//
	    		}
	    		else
	    		{
	    			flag=2;
	    		}
	    		if(cpgg.length()+cpgl.length()+cpge.length()==0)
	    		{

	    		}
	    		else if((cpgg.length()>0&&pgmarks.compareTo(cpgper)>0)||(cpgl.length()>0&&pgmarks.compareTo(cpgper)<0)||(cpge.length()>0&&pgmarks.compareTo(cpgper)==0))
	    		{

	    		}
	    		else
	    		{
	    			flag=2;
	    		}

	    		if(cxg.length()+cxl.length()+cxe.length()==0)
	    		{

	    		}
	    		else if((cxg.length()>0&&xmarks.compareTo(cxper)>0)||(cxl.length()>0&&xmarks.compareTo(cxper)<0)||(cxe.length()>0&&xmarks.compareTo(cxper)==0))
	    		{
	    		}
	    		else
	    		{
	    			flag=2;
	    		}
	    		if(cxiig.length()+cxiil.length()+cxiie.length()==0)
	    		{

	    		}
	    		else if((cxiig.length()>0&&xiimarks.compareTo(cxiiper)>0)||(cxiil.length()>0&&xiimarks.compareTo(cxiiper)<0)||(cxiie.length()>0&&xiimarks.compareTo(cxiiper)==0))
	    		{

	    		}
	    		else
	    		{
	    			flag=2;
	    		}
	    		if(cgateg.length()+cgatel.length()+cgatee.length()==0)
	    		{

	    		}
	    		else if((cgateg.length()>0&&gatescore.compareTo(cgatescore)>0)||(cgatel.length()>0&&gatescore.compareTo(cgatescore)<0)||(cgatee.length()>0&&gatescore.compareTo(cgatescore)==0))
	    		{

	    		}
	    		else
	    		{
	    			flag=2;
	    		}

	    		if(cdatef.length()>0){if(a3>z3)flag=2;else if(a3==z3&&a2>z2)flag=2;else if(a3==z3&&a2==z2&&a1>z1)flag = 2;}
	    		if(cdateu.length()>0){if(b3<z3)flag=2;else if(b3==z3&&b2<z2)flag=2;else if(b3==z3&&b2==z2&&b1<z1)flag = 2;}
				if(flag==1)
	    		{
	    			list1.add(enrol);
	    			list2.add(name);
	    			//list.add(new Data(name,enrol,f.getAbsolutePath().toString()));
	    		}
	    		
	    		

    		}
    		catch(FileNotFoundException e)
    		{
    			e.printStackTrace();
    		}
    		catch(IOException e)
    		{
    			e.printStackTrace();
    		}
    	}
    	System.out.println(list1.size());
		w.println("<html><body>");
		w.println("<table>");
		for(int j=0;j<list1.size();j++)
		{
			System.out.println(list3.get(j));
			w.println("<tr><td>"+list1.get(j)+"&nbsp&nbsp&nbsp&nbsp&nbsp</td><td>"+list2.get(j)+"</td><td><a href='"+list3.get(j)+"' target='_blank' >link</a>"+"</td></tr>");
		}
		w.println("</body><html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
