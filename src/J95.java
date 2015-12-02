/*
 * vivek 2014121
 * himanshu 2014047
 */


import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class J95
 */
@WebServlet("/J95")
public class J95 extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public J95() {
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
		w.println("<html><body><form action='http://localhost:8080/j9/J96' method='get'>");
		w.println("Email <input type='email' name='email'><br>Name <input type='text' name='name'><br>Enrollment No <input type='text' name='eno'><br>");
		w.println("Category <select name='cat'><option></option><option>All</option><option>General</option><option>SC</option><option>ST</option><option>OBC</option></select><br>");
		w.println("Gender <input type='radio' name='gender' value='Male'>Male <br><input type='radio' name='gender' value='Female'>Female<br>Physically Disabled<input type='radio' name='pd' value='Yes'>Yes <br><input type='radio' name='pd' value='No'>No<br>");
		w.println("Date Of Birth <input type='radio' name='dob_con' value='Before'>Before   <input type='radio' name='dob_con' value='On'>On  <input type='radio' name='dob_con' value ='After'> After  <br><input type='date' name='dob'><br>");
		w.println("Phd Stream <select name='phds'><option></option><option>Computer Science</option><option>Electronics and Communication</option><option>Computational Biology</option></select><br>");
		w.println("Graduation Degree<select name='gd'><option></option><option>All</option><option>B.Tech</option><option>BSc</option></select><br>");
		w.println("Post Graduation Degree <select name='pgd'><option></option><option>All</option><option>M.Tech</option><option>MSc</option></select><br>");
		w.println("Class X Board <select name='xb'><option><option></option>All</option><option>CBSE</option><option>ICSE</option></select><br>");
		w.println("Class XII Board <select name='xiib'><option></option><option>All</option><option>CBSE</option><option>ICSE</option></select><br>");
		w.println("Department (Graduation)<select name='gdep'><option></option><option>Computer Science</option><option>Electronics and Communication</option></select><br>");
		w.println("Department (Post Graduation)<select name='pgdep'><option></option><option>Computer Science</option><option>Electronics and Communication</option></select><br>");
		w.println("University (Graduation) <input type='text' name='gu'><br>");
		w.println("University (Post Graduation)<input type='text' name=pgu'><br>");
		w.println("State (Graduation)<select name='gs'><option></option><option>All</option><option>Andhra Pradesh</option><option>Arunachal Pradesh</option><option>Assam</option><option>Bihar</option><option>Chhattisgarh</option><option>Goa</option><option>Gujarat</option>"
				+"<option>Haryana</option><option>Himachal Pradesh</option><option>Jammu and Kashmir</option><option>Jharkhand</option><option>Karnataka</option><option>Kerala</option>"
				+"<option>Madhya Pradesh</option><option>Maharashtra</option><option>Manipur</option><option>Meghalaya</option><option>Mizoram</option><option>Nagaland</option><option>Odisha(Orissa)</option>"
				+"<option>Punjab</option><option>Rajasthan</option><option>Sikkim</option><option>Tamil Nadu</option><option>Tripura</option><option>Uttar Pradesh</option><option>Uttarakhand</option><option>West Bengal<option></select><br>");
		w.println("State <select name='pgs'><option></option><option>All</option><option>Andhra Pradesh</option><option>Arunachal Pradesh</option><option>Assam</option><option>Bihar</option><option>Chhattisgarh</option><option>Goa</option><option>Gujarat</option>"
				+"<option>Haryana</option><option>Himachal Pradesh</option><option>Jammu and Kashmir</option><option>Jharkhand</option><option>Karnataka</option><option>Kerala</option>"
				+"<option>Madhya Pradesh</option><option>Maharashtra</option><option>Manipur</option><option>Meghalaya</option><option>Mizoram</option><option>Nagaland</option><option>Odisha(Orissa)</option>"
				+"<option>Punjab</option><option>Rajasthan</option><option>Sikkim</option><option>Tamil Nadu</option><option>Tripura</option><option>Uttar Pradesh</option><option>Uttarakhand</option><option>West Bengal<option></select><br>");
		w.println("Class X Board %    <input type='checkbox' name='xg'>Greater than  <input type='checkbox' name='xe'>Equal to<input type='checkbox' name='xl'>Less then <input type='text' name='xm'><br>");
		w.println("Class XII Board %    <input type='checkbox' name='xiig'>Greater than  <input type='checkbox' name='xiie'>Equal to<input type='checkbox' name='xiil'>Less then <input type='text' name='xiim'><br>");
		w.println("Graduation %    <input type='checkbox' name='gg'>Greater than  <input type='checkbox' name='ge'>Equal to<input type='checkbox' name='gl'>Less then  <input type='text'  name='gm'><br>");
		w.println("Post Gradutaion %    <input type='checkbox' name='pgg'>Greater than  <input type='checkbox' name='pge'>Equal to<input type='checkbox' name='pgl'>Less then  <input type='text' name='pgm'><br>");
		w.println("Gate Score     <input type='checkbox' name='gateg'>Greater than  <input type='checkbox' name='gatee'>Equal to<input type='checkbox' name='gatel'>Less then  <input type='text' name='gatem'><br>");
		w.println("Applicants Dated From <input type='date' name='adf'><br> Applicants Dated Upto <input type='date' name='adu'><br><input type='submit' value='Show Filtered Result'>");
		w.println("</form></body></html>");
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
