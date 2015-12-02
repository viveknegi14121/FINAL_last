/*
 * vivek 2014121
 * himanshu 2014047
 */
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import javafx.scene.control.CheckBox;
import javafx.scene.control.RadioButton;

/**
 * Servlet implementation class J94
 */
@WebServlet("/J94")
public class J94 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public J94() 
    {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		// TODO Auto-generated method stub
		int flag=1;
		PrintWriter w=response.getWriter();
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
		{
			w.println("<html><body>");
			w.println("<form action='' method='post'><h2>Personal Information</h2>Email  <input type='email' name='s_pi_email' required><br>");
			w.println("Name <input type='text' name='s_pi_name' required><br>Address Of Correspondence  <input type='text' name=s_pi_add required><br>");
			w.println("Mobile <input type='number' name='s_pi_mob' min='999999999' max='9999999999' required><br>PhD Stream <input type='radio' name='s_pi_phd' value='Computer Science' onClick='s_pi_p1_fun();' required>Computer Science");
			w.println("<input type='radio' name='s_pi_phd' value='Electroncis and Communication' onclick='s_pi_p2_fun();' required>Electroncis and Communication");
			w.println("<input type='radio' name='s_pi_phd' value=Computational Biology' onclick='s_pi_p3_fun();' required>Computational Biology<br>");
			w.println("Phd Preference 1 <select name='s_pi_p1' id='s_pi_p1' required></select><br>");
			w.println("Phd Preference 2 <select name='s_pi_p2' id='s_pi_p2' required></select><br>");
			w.println("Phd Preference 3 <select name='s_pi_p3' id='s_pi_p3' required></select><br>");
			w.println("<script type='text/JavaScript'>function s_pi_p1_fun(){var x=['-------','Artificial Intelligence and Robotics - CSE','Compiler - CSE','Coputer Architechture and System Design - CSE','Computer Graphics - CSE','Computer Vision - CSE','Image Analysis and Biometrics - CSE','Information Management and Data Engineering - CSE','Machine Learning -CSE','Massively Parallel System - CSE','Mobile Computing and Networking Application - CSE','Program Alysis - CSE','Security and Privacy - CSE','Signal and Image Processing- CSE','Software Engineering - CSE','Theoretical Computer Science - CSE','Wireless Networks - CSE'];var t1=document.getElementById('s_pi_p1');var t2=document.getElementById('s_pi_p2');var t3=document.getElementById('s_pi_p3');t1.length=0;t2.length=0;t3.length=0;for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t1.add(y)}for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t2.add(y)}for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t3.add(y)}}</script>");
			w.println("<script type='text/JavaScript'>function s_pi_p2_fun(){var x=['-------','Computer Architechture and System Design - ECE','Controls and Robotics - ECE','Digital and Anlaog VLSI System Design - ECE','Electrmagnetics - ECE','Embedded and VLSI systems design - ECE','Embedded Systems - ECE','Fiber-Wireless Architechtures - ECE','Machine Learning - ECE','OFDM based Optical Access Networks - ECE','Optical Wireless Communication Systems - ECE','RF and mixed signal electronics - ECE','Signal and Image Processing - ECE','Wireless Communication - ECE','Wireless Networks - ECE'];var t1=document.getElementById('s_pi_p1');var t2=document.getElementById('s_pi_p2');var t3=document.getElementById('s_pi_p3');t1.length=0;t2.length=0;t3.length=0;for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t1.add(y)}for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t2.add(y)}for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t3.add(y)}}</script>");
			w.println("<script type='text/JavaScript'>function s_pi_p3_fun(){var x=['-------','Biophysics - CB','Structural Biology CB','System  Biology - CB'];var t1=document.getElementById('s_pi_p1');var t2=document.getElementById('s_pi_p2');var t3=document.getElementById('s_pi_p3');t1.length=0;t2.length=0;t3.length=0;for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t1.add(y)}for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t2.add(y)}for(var i=0,y;i<x.length;i++){y=document.createElement('option');y.text=x[i];t3.add(y)}}</script>");
			w.println("Gender <input type='radio' name='s_pi_gender' value='Male' required>Male<br> <input type='radio' name='s_pi_gender' value='Female' required>Female<br>");
			w.println("Category <input type='radio' name='s_pi_cat' value='General' required>General <br><input type='radio' name='s_pi_cat' value='SC' required>SC <br><input type='radio' name='s_pi_cat' value='ST' required>ST <br><input type='radio' name='s_pi_cat' value='OBC' required>OBC<br>");
			w.println("Physically Disabled <input type='radio' name='s_pi_pd' value='Yes' required>Yes <br>		<input type='radio' name='s_pi_pd' value='No' required>No<br>");
			w.println("Date Of Birth <input type='date' name='s_pi_dob' required> <br> Children/War Widows <input type='radio' name=s_pi_ww value='Yes' required>Yes<br>	<input type='radio' name='s_pi_ww' value='No' required>No<br>");
			w.println("Father's Name <input type='text' name='s_pi_fname' required><br>");
			w.println("Nationality <select name=s_pi_nat"
					+ " required><option>-------</option><option>Afghan</option><option>Albanian</option><option>Algerian</option><option>American</option><option>Andorran</option><option>Angolan</option><option>Antiguans</option><option>Argentinean</option>"
					+"<option>Armenian</option><option>Australian</option><option>Austrian</option><option>Azerbaijani</option><option>Bahamian</option><option>Bahraini</option><option>Bangladeshi</option><option>Barbadian</option><option>Barbudans</option>"
					+"<option>Batswana</option><option>Belarusian</option><option>Belgian</option><option>Belizean</option><option>Beninese</option><option>Bhutanese</option><option>Bolivian</option><option>Bosnian</option><option>Brazilian</option><option>British</option>"
					+"<option>Bruneian</option><option>Bulgarian</option><option>Burkinabe</option><option>Burmese</option><option>Burundian</option><option>Cambodian</option><option>Cameroonian</option><option>Canadian</option><option>Cape Verdean</option>"
					+"<option>Central African</option><option>Chadian</option><option>Chilean</option><option>Chinese</option><option>Colombian</option><option>Comoran</option><option>Congolese</option><option>Costa Rican</option><option>Croatian</option>"
					+"<option>Cuban</option><option>Cypriot</option><option>Czech</option><option>Danish</option><option>Djibouti</option><option>Dominican</option><option>Dutch</option><option>East Timorese</option><option>Ecuadorean</option><option>Egyptian</option>"
					+"<option>Emirian</option><option>Equatorial Guinean</option><option>Eritrean</option><option>Estonian</option><option>Ethiopian</option><option>Fijian</option><option>Filipino</option><option>Finnish</option><option>French</option>"
					+"<option>Gabonese</option><option>Gambian</option><option>Georgian</option><option>German</option><option>Ghanaian</option><option>Greek</option><option>Grenadian</option><option>Guatemalan</option><option>Guinea-Bissauan</option>"
					+"<option>Guinean</option><option>Guyanese</option><option>Haitian</option><option>Herzegovinian</option><option>Honduran</option><option>Hungarian</option><option>Icelander</option><option>Indian</option><option>Indonesian</option>"
					+"<option>Iranian</option><option>Iraqi</option><option>Irish</option><option>Israeli</option><option>Italian</option><option>Ivorian</option><option>Jamaican</option><option>Japanese</option><option>Jordanian</option><option>Kazakhstani</option><option>Kenyan</option>"
					+"<option>Kittian and Nevisian</option><option>Kuwaiti</option><option>Kyrgyz</option><option>Laotian</option><option>Latvian</option><option>Lebanese</option><option>Liberian</option><option>Libyan</option>"
					+"<option>Liechtensteiner</option><option>Lithuanian</option><option>Luxembourger</option><option>Macedonian</option><option>Malagasy</option><option>Malawian</option><option>Malaysian</option><option>Maldivan</option>"
					+"<option>Malian</option><option>Maltese</option><option>Marshallese</option><option>Mauritanian</option><option>Mauritian</option><option>Mexican</option><option>Micronesian</option><option>Moldovan</option><option>Monacan</option>"
					+"<option>Mongolian</option><option>Moroccan</option><option>Mosotho</option><option>Motswana</option><option>Mozambican</option><option>Namibian</option><option>Nauruan</option><option>Nepalese</option><option>Netherlander</option>"
					+"<option>New Zealander</option><option>Ni-Vanuatu</option><option>Nicaraguan</option><option>Nigerian</option><option>Nigerien</option><option>North Korean</option><option>Northern Irish</option><option>Norwegian</option>"
					+"<option>Omani</option><option>Pakistani</option><option>Palauan</option><option>Panamanian</option><option>Papua New Guinean</option><option>Paraguayan</option><option>Peruvian</option><option>Polish</option><option>Portuguese</option>"
					+"<option>Qatari</option><option>Romanian</option><option>Russian</option><option>Rwandan</option><option>Saint Lucian</option><option>Salvadoran</option><option>Samoan</option><option>San Marinese</option><option>Sao Tomean</option>"
					+"<option>Saudi</option><option>Scottish</option><option>Senegalese</option><option>Serbian</option><option>Seychellois</option><option>Sierra Leonean</option><option>Singaporean</option><option>Slovakian</option>"
					+"<option>Slovenian</option><option>Solomon Islander</option><option>Somali</option><option>South African</option><option>South Korean</option><option>Spanish</option><option>Sri Lankan</option><option>Sudanese</option>"
					+"<option>Surinamer</option><option>Swazi</option><option>Swedish</option><option>Swiss</option><option>Syrian</option><option>Taiwanese</option><option>Tajik</option><option>Tanzanian</option><option>Thai</option><option>Togolese</option><option>Tongan</option>"
					+"<option>Trinidadian or Tobagonian</option><option>Tunisian</option><option>Turkish</option><option>Tuvaluan</option><option>Ugandan</option><option>Ukrainian</option><option>Uruguayan</option>"
					+"<option>Uzbekistani</option><option>Venezuelan</option><option>Vietnamese</option><option>Welsh</option><option>Yemenite</option><option>Zambian</option><option>Zimbabwean</option></select><br>");
			w.println("Permanent Address <input type='text' name='s_pi_perm_add' required><br>Pin Code <input type='number' min='99999' max='999999' name='s_pi_pc' required>");
			w.println("<h2>Education Information</h2><h4>Schooling Information</h4><br>X Board <input type='text' name='s_ei_x_board' required><br>X Marks  <input type='number' min='0' max='100' name='s_ei_x_marks' required><br>");
			w.println("Year Of Passing X		<select name='s_ei_yopx' required><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option>"
					+"<option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option>"
					+"<option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option>"
					+"<option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option>"
					+"<option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option></select><br>");
			w.println("XII Board XII Board <input type='text' name='s_ei_xii_board' required><br>XII Marks <input type='number' min='0' max='100' name='s_ei_xii_marks' required><br>");
			w.println("Year Of Passing XII		<select name='s_ei_yopxii' required><option>2015</option><option>2014</option><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option>"
					+"<option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option>"
					+"<option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option>"
					+"<option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option>"
					+"<option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option></select><br>");
			w.println("<h4>Graduation Information</h4><br>Degree<input type='text' name='s_ei_deg' required><br>Department<input type='text' name='s_ei_dep' required><br>Name Of College<input type='text' name='s_ei_coll' required><br>Name Of University <input type='text' name='s_ei_uni' required><br>City <input type='text' name='s_ei_city' required><br>");
			w.println("State <select name='s_ei_state' required><option>Andhra Pradesh</option><option>Arunachal Pradesh</option><option>Assam</option><option>Bihar</option><option>Chhattisgarh</option><option>Goa</option><option>Gujarat</option>"
					+"<option>Haryana</option><option>Himachal Pradesh</option><option>Jammu and Kashmir</option><option>Jharkhand</option><option>Karnataka</option><option>Kerala</option>"
					+"<option>Madhya Pradesh</option><option>Maharashtra</option><option>Manipur</option><option>Meghalaya</option><option>Mizoram</option><option>Nagaland</option><option>Odisha(Orissa)</option>"
					+"<option>Punjab</option><option>Rajasthan</option><option>Sikkim</option><option>Tamil Nadu</option><option>Tripura</option><option>Uttar Pradesh</option><option>Uttarakhand</option><option>West Bengal<option></select><br>");
			w.println("Year Of Graduation <select name='s_ei_yog' required><option>2015</option><option>2014</option><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option>"
					+"<option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option>"
					+"<option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option>"
					+"<option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option>"
					+"<option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option> </select><br>");
			w.println("CGPA or Marks ? <input type='radio' name='s_ei_cgpa_or_marks' value='CGPA' required>CGPA<input type='number' min='0' max='10' name='s_ei_cgpa' > / <select name='s_ei_div' required><option>4</option><option>6</option></select><br>");
			w.println("	     	<input type='radio' name='s_ei_cgpa_or_marks' value='Marks' required>Marks<input type='text' name='s_ei_marks' ><br><br>");
			w.println("<input type='checkbox' id='c1' onclick='fun1(\"c1\",\"d1\")' name='s_ei_ece_phd'>Are you applying for ECE PhD ?<br>");
			w.println("<div id='d1' style='display:none'>Preference 1 <select name='s_ece_p1' id='s_ece_p1'><option>-------</option><option>Advanced Signal Processing</option><option>Statisical Signal Processing</option><option>Digital VLSI Design</option><option>Analog CMOS design</option><option>Digital Communication</option><option>Communication Networks</option><option>Linear Systems</option><option>Introduction to Robotics</option><option>RF Circuit Design</option><option>Antennas and Propgation</option><option>Embedded Systems</option></select>'<br>");
			w.println("Preference 2 <select name='s_ece_p2' id='s_ece_p2'><option>-------</option><option>Advanced Signal Processing</option><option>Statisical Signal Processing</option><option>Digital VLSI Design</option><option>Analog CMOS design</option><option>Digital Communication</option><option>Communication Networks</option><option>Linear Systems</option><option>Introduction to Robotics</option><option>RF Circuit Design</option><option>Antennas and Propgation</option><option>Embedded Systems</option></select>'<br>");
			w.println("Preference 3 <select name='s_ece_p3' id='s_ece_p3'><option>-------</option><option>Advanced Signal Processing</option><option>Statisical Signal Processing</option><option>Digital VLSI Design</option><option>Analog CMOS design</option><option>Digital Communication</option><option>Communication Networks</option><option>Linear Systems</option><option>Introduction to Robotics</option><option>RF Circuit Design</option><option>Antennas and Propgation</option><option>Embedded Systems</option></select>'<br>");
			w.println("Preference 4 <select name='s_ece_p4' id='s_ece_p4'><option>-------</option><option>Advanced Signal Processing</option><option>Statisical Signal Processing</option><option>Digital VLSI Design</option><option>Analog CMOS design</option><option>Digital Communication</option><option>Communication Networks</option><option>Linear Systems</option><option>Introduction to Robotics</option><option>RF Circuit Design</option><option>Antennas and Propgation</option><option>Embedded Systems</option></select>'<br></div><br>");
			w.println("<input type='checkbox' id='c2' onclick='fun2(\"c2\",\"d2\")' name='s_ei_pg'>Have you completed your Post Graduation ?<br>");
			w.println("<div id='d2' style='display : none'>Name Of College <input type='text' name='s_pg_coll' ><br>City <input type='text' name='s_pg_city' > <br> Department <input type='text' name='s_pg_dep'  ><br>Degree <input type='text' name='s_pg_deg'  ><br>Thesis <input type='text' name='s_pg_thesis'  ><br>");
			w.println("State <select name='s_pg_state'  ><option>Andhra Pradesh</option><option>Arunachal Pradesh</option><option>Assam</option><option>Bihar</option><option>Chhattisgarh</option><option>Goa</option><option>Gujarat</option>"
					+"<option>Haryana</option><option>Himachal Pradesh</option><option>Jammu and Kashmir</option><option>Jharkhand</option><option>Karnataka</option><option>Kerala</option>"
					+"<option>Madhya Pradesh</option><option>Maharashtra</option><option>Manipur</option><option>Meghalaya</option><option>Mizoram</option><option>Nagaland</option><option>Odisha(Orissa)</option>"
					+"<option>Punjab</option><option>Rajasthan</option><option>Sikkim</option><option>Tamil Nadu</option><option>Tripura</option><option>Uttar Pradesh</option><option>Uttarakhand</option><option>West Bengal<option></select><br>");
			w.println("Year Of Graduation <select name='s_pg_yopg' ><option>2015</option><option>2014</option><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option>"
					+"<option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option>"
					+"<option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option>"
					+"<option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option>"
					+"<option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option> </select><br>");
			w.println("CGPA or Marks ? <input type='radio' name='s_pg_cgpa_or_marks' value='CGPA' >CGPA<input type='s_pg_cgpa'> / <select name='s_pg_div'><option>4</option><option>6</option></select><br>");
			w.println("	     	<input type='radio' name=s_pg_cgpa_or_marks' value='Marks' >Marks<input type='text' name=s_pg_marks><br></div><br>");
			w.println("<input type='checkbox' id='c3' onclick='fun3(\"c3\",\"d3\")' name='s_ei_oth'>Other Academic Degrees ?<br>");
			w.println("<div id='d3' style='display : none'>Exam Name<input type='text' name='s_oth_name' ><br>Subject <input type='text' name='s_oth_sub' ><br>");
			w.println("Year Of Graduation <select name='s_oth_yopg' ><option>2015</option><option>2014</option><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option>"
					+"<option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option>"
					+"<option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option>"
					+"<option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option>"
					+"<option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option> </select><br>");
			w.println("Score <input type='text' name='s_oth_score' ><br>Rank <input type='text' name='s_oth_rank' ><br></div><br>");
			w.println("<input type='checkbox' id='c4' onclick='fun4(\"c4\",\"d4\")' name='s_ei_gate'>Taken GATE Exam ? <br>");
			w.println("<div id='d4' style='display : none'>Area <input type='text' name='s_gate_area' ><br>Marks <input type='number' name='s_gate_marks' ><br>Score <input type='number' min='0' max='1000' name='s_gate_score' ><br>Rank <input type='text' name='s_gate_rank'><br>");
			w.println("Year Of Graduation <select name='s_gate_yog' ><option>2015</option><option>2014</option><option>2013</option><option>2012</option><option>2011</option><option>2010</option><option>2009</option><option>2008</option><option>2007</option><option>2006</option><option>2005</option><option>2004</option><option>2003</option><option>2002</option>"
					+"<option>2001</option><option>2000</option><option>1999</option><option>1998</option><option>1997</option><option>1996</option><option>1995</option><option>1994</option><option>1993</option><option>1992</option><option>1991</option><option>1990</option><option>1989</option>"
					+"<option>1988</option><option>1987</option><option>1986</option><option>1985</option><option>1984</option><option>1983</option><option>1982</option><option>1981</option><option>1980</option><option>1979</option><option>1978</option><option>1977</option><option>1976</option>"
					+"<option>1975</option><option>1974</option><option>1973</option><option>1972</option><option>1971</option><option>1970</option><option>1969</option><option>1968</option><option>1967</option><option>1966</option><option>1965</option><option>1964</option><option>1963</option>"
					+"<option>1962</option><option>1961</option><option>1960</option><option>1959</option><option>1958</option><option>1957</option><option>1956</option><option>1955</option><option>1954</option><option>1953</option><option>1952</option><option>1951</option> </select><br></div><br>");
			w.println("<h4>Achievements</h4>Achievements <input type='text' name='s_ei_ach' ><br>CV/Resume<input type='file' name='cv' value='Upload'><br>Statement Of Purpose<input type='file' name='sp' value='Upload'><br>");
			w.println("<script type='text/JavaScript'>function fun1(i,j){if(document.getElementById(i).checked){document.getElementById(j).style.display='block';}else{document.getElementById(j).style.display='none';}}</script>");
			w.println("<script type='text/JavaScript'>function fun2(i,j){if(document.getElementById(i).checked){document.getElementById(j).style.display='block';}else{document.getElementById(j).style.display='none';}}</script>");
			w.println("<script type='text/JavaScript'>function fun3(i,j){if(document.getElementById(i).checked){document.getElementById(j).style.display='block';}else{document.getElementById(j).style.display='none';}}</script>");
			w.println("<script type='text/JavaScript'>function fun4(i,j){if(document.getElementById(i).checked){document.getElementById(j).style.display='block';}else{document.getElementById(j).style.display='none';}}</script>");
			w.println("<input type='Submit' value='Submit'></form>");
			w.println("</body></html>");
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException 
	{
		/*// TODO Auto-generated method stub
		doGet(request, response);*/
		System.out.println("SDDF");
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
    	try
    	{
    		//BufferedReader reader = new BufferedReader(new FileReader("./src/enrol.txt"));
    		String s,r,t,u;
    		char a[]=new char[25];
    		//int i=Integer.parseInt(s),j;
    		//j=i;
    		//t=String.valueOf(j);
    		//i++;
    		//s=String.valueOf(i);
    		//reader.close();
    		//BufferedWriter w=new BufferedWriter(new FileWriter("./src/enrol.txt"));
    		//w.write(s);
    		//w.close();
    		r=d.toString();
    		r=r+"\\"+request.getParameter("s_pi_mob")+".txt";
    	
    		BufferedWriter wr=new BufferedWriter(new FileWriter(r));
			wr.write("Email/"+request.getParameter("s_pi_email")+System.lineSeparator());
			wr.write("Name/"+request.getParameter("s_pi_name")+System.lineSeparator());
		
			wr.write("Enrollment NO./"+request.getParameter("s_pi_mob")+System.lineSeparator());
			wr.write("Address Of correspondence/"+request.getParameter("s_pi_add")+System.lineSeparator());
			wr.write("Mobile/"+request.getParameter("s_pi_mob")+System.lineSeparator());
			wr.write("PhD/"+request.getParameter("s_pi_phd")+System.lineSeparator());
    		wr.write("Preference 1/"+request.getParameter("s_pi_p1")+System.lineSeparator());
    		wr.write("Preference 2/"+request.getParameter("s_pi_p2")+System.lineSeparator());
    		wr.write("Preference 3/"+request.getParameter("s_pi_p3")+System.lineSeparator());
			wr.write("Gender/"+request.getParameter("s_pi_gender")+System.lineSeparator());
    		wr.write("Category/"+request.getParameter("s_pi_cat")+System.lineSeparator());
    		wr.write("PhysicallyDisabled/"+request.getParameter("s_pi_pd")+System.lineSeparator());
    		wr.write("Date/"+request.getParameter("s_pi_dob")+System.lineSeparator());
			wr.write("War Widow/"+request.getParameter("s_pi_ww")+System.lineSeparator());
    		wr.write("Father's Name/"+request.getParameter("s_pi_fname")+System.lineSeparator());
			wr.write("Nationality/"+request.getParameter("s_pi_nat")+System.lineSeparator());
			wr.write("Permanent Address/"+request.getParameter("s_pi_perm_add")+System.lineSeparator());
	    	wr.write("Pin Code/"+request.getParameter("s_pi_pc")+System.lineSeparator());
	    	
			wr.write("X Board/"+request.getParameter("s_ei_x_board")+System.lineSeparator());
    	
			wr.write("X Mark/"+request.getParameter("s_ei_x_marks")+System.lineSeparator());
    	
			wr.write("Year Of Passing X/"+request.getParameter("s_ei_yopx")+System.lineSeparator());
			wr.write("XII Board/"+request.getParameter("s_ei_xii_board")+System.lineSeparator());;
	    	wr.write("XII Marks/"+request.getParameter("s_ei_xii_marks")+System.lineSeparator());
	    	wr.write("Year Of Passing XII/"+request.getParameter("s_ei_yopxii")+System.lineSeparator());
			wr.write("Degree/"+request.getParameter("s_ei_deg")+System.lineSeparator());
			
	    	wr.write("Department/"+request.getParameter("s_ei_dep")+System.lineSeparator());
			wr.write("Name Of College/"+request.getParameter("s_ei_coll")+System.lineSeparator());
	    	wr.write("Name Of University/"+request.getParameter("s_ei_uni")+System.lineSeparator());
	    	wr.write("Name Of City/"+request.getParameter("s_ei_city")+System.lineSeparator());	
			wr.write("State/"+request.getParameter("s_ei_state")+System.lineSeparator());
			wr.write("Year Of Graduation/"+request.getParameter("s_ei_yog")+System.lineSeparator());
			
	    	if(request.getParameter("s_ei_cgpa_or_marks").equals("CGPA"))
	    	{
	   			String p,q;
	   			Double x;
	   			p=request.getParameter("s_ei_div");
	   			
	   			if(p.compareTo("4")==0) 
	   			{
	   				
	    			q=request.getParameter("s_ei_cgpa");
	    			System.out.println(q);
		    		x=Double.parseDouble(q);
	    			x=x*25;
	    			p=String.valueOf(x);
	    			
	    		}
	    		else
	    		{
	    			q=request.getParameter("s_ei_cgpa");
	    			x=Double.parseDouble(q);
	    			x=x*10;
	    			p=String.valueOf(x);
	    		}
	    		wr.write("CGPA/"+p+System.lineSeparator());
	    	}
	    	else
	    	{
	    		wr.write("Marks/"+request.getParameter("s_ei_marks")+System.lineSeparator());
	    	}
			if(request.getParameter("s_ei_ece_phd")==null)
			{
				wr.write("Applying For ECE PhD/null"+System.lineSeparator());
				wr.write("Preference 1/null"+System.lineSeparator());
				wr.write("Preference 2/null"+System.lineSeparator());
				wr.write("Preference 3/null"+System.lineSeparator());
				wr.write("Preference 4/null"+System.lineSeparator());
			}
			else
			{
				wr.write("Applying For ECE PhD/"+request.getParameter("s_ei_ece_phd")+System.lineSeparator());
				wr.write("Preference 1/"+request.getParameter("s_ece_p1")+System.lineSeparator());
				wr.write("Preference 2/"+request.getParameter("s_ece_p2")+System.lineSeparator());
				wr.write("Preference 3/"+request.getParameter("s_ece_p2")+System.lineSeparator());
				wr.write("Preference 4/"+request.getParameter("s_ece_p4")+System.lineSeparator());
			}
			if(request.getParameter("s_ei_pg")==null)
			{
				wr.write("Completed Post Graduation/null"+System.lineSeparator());
				wr.write("Name Of College/null"+System.lineSeparator());
	    		wr.write("City/null"+System.lineSeparator());
	    		wr.write("State/null"+System.lineSeparator());
				wr.write("Deparment/null"+System.lineSeparator());
	    		wr.write("Year Of Post Graduation /null"+System.lineSeparator());
				wr.write("Degree/null"+System.lineSeparator());
				wr.write("Thesis Title /null"+System.lineSeparator());
	       		wr.write("CGPA/null"+System.lineSeparator());
	    	}
			else
			{
				wr.write("Completed Post Graduation/"+request.getParameter("s_ei_pg")+System.lineSeparator());		
				wr.write("Name Of College/"+request.getParameter("s_pg_coll")+System.lineSeparator());
	    		wr.write("City/"+request.getParameter("s_pg_city")+System.lineSeparator());
	    		wr.write("State/"+request.getParameter("s_pg_state")+System.lineSeparator());
				wr.write("Deparment/"+request.getParameter("s_pg_dep")+System.lineSeparator());
	    		wr.write("Year Of Post Graduation /"+request.getParameter("s_pg_yopg")+System.lineSeparator());
				wr.write("Degree/"+request.getParameter("s_pg_deg")+System.lineSeparator());
				wr.write("Thesis Title /"+request.getParameter("s_pg_thesis")+System.lineSeparator());
	       		wr.write("CGPA/");
				if(request.getParameter("s_pg_cgpa_or_marks").equals("CGPA"))
		    	{
		    		String p,q;
		    		Double x;
		   			p=request.getParameter("s_pg_div");
		   			if(p.compareTo("4")==0)
		   			{
		   				q=request.getParameter("s_pg_cgpa");
			   			x=Double.parseDouble(q);
		    			x=x*25;
		    			p=String.valueOf(x);
		    		}
		    		else
		    		{
		    			
		    			q=request.getParameter("s_pg_cgpa");
		    			x=Double.parseDouble(q);
		    			x=x*10;
		    			p=String.valueOf(x);
		    		}
		    		wr.write("CGPA:"+p+System.lineSeparator());
		    	//	wr.write("By/"+ei_div.getValue()+System.lineSeparator());
		    	}
		    	else
		    	{
		    		wr.write("Marks:"+request.getParameter("s_pg_marks")+System.lineSeparator());
		    	}
		    }
			if(request.getParameter("s_ei_oth")==null)
			{
				wr.write("Other Academic Degrees/null"+System.lineSeparator());
	    		wr.write("Exam Name/null"+System.lineSeparator());
	    		wr.write("Subject/null"+System.lineSeparator());
	    		wr.write("Year/null"+System.lineSeparator());
	    		wr.write("Score/null"+System.lineSeparator());
	    		wr.write("Rank/null"+System.lineSeparator());
			}
			else
			{
				wr.write("Other Academic Degrees/"+request.getParameter("s_ei_oth")+System.lineSeparator());
	    		wr.write("Exam Name/"+request.getParameter("s_oth_name")+System.lineSeparator());
	    		wr.write("Subject/"+request.getParameter("s_oth_sub")+System.lineSeparator());
	    		wr.write("Year/"+request.getParameter("s_oth_yopg")+System.lineSeparator());
	    		wr.write("Score/"+request.getParameter("s_oth_score")+System.lineSeparator());
	    		wr.write("Rank/"+request.getParameter("s_oth_rank")+System.lineSeparator());
			}
			if(request.getParameter("s_ei_gate")==null)
			{
				wr.write("Taken GATE Exam/null"+System.lineSeparator());
				wr.write("Year/null"+System.lineSeparator());
				wr.write("Area/null"+System.lineSeparator());
				wr.write("Marks/null"+System.lineSeparator());
	    		wr.write("Score/null"+System.lineSeparator());
	    		wr.write("Rank/null"+System.lineSeparator());
	    	}
			else
			{
				wr.write("Taken GATE Exam/YES"+System.lineSeparator());
				wr.write("Area/"+request.getParameter("s_gate_area")+System.lineSeparator());
				wr.write("Year/"+request.getParameter("s_gate_yog")+System.lineSeparator());
				wr.write("Marks/"+request.getParameter("s_gate_marks")+System.lineSeparator());
				wr.write("Score/"+request.getParameter("s_gate_score")+System.lineSeparator());
				wr.write("Rank/"+request.getParameter("s_gate_rank")+System.lineSeparator());
			}
			wr.write("Achievements/"+request.getParameter("s_ei_ach")+System.lineSeparator());
			wr.write("cv/"+request.getParameter("cv")+System.lineSeparator());
			wr.write("sp/"+request.getParameter("sp")+System.lineSeparator());
			wr.close();
		}
    	catch(Exception e)
    	{
    		e.printStackTrace();
    	}
	}
}