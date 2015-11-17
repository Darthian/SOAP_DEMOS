package controller;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import ws.*;
import ws.DemoStub.*;
import ws.ProductWSStub.*;

/**
 * Servlet implementation class DemoController
 */
public class DemoController extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public DemoController() {
        super();
        // TODO Auto-generated constructor stub
    }

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		PrintWriter out = response.getWriter();
		response.setContentType("text/html");
		try {
			DemoStub ds = new DemoStub();
			ProductWSStub pw = new ProductWSStub();
			out.print(ds.hello(new Hello()).get_return());
			
			Sum s = new Sum();
			s.setA(3);
			s.setB(4);
			out.print("<br> Sum: "+ds.sum(s).get_return());
			
			Product p = pw.find(new Find()).get_return();
			out.print("<h3> Product Information</h3>");
			out.print("<br> Id: "+p.getId());
			out.print("<br> Name: "+p.getName());
			out.print("<br> Price: "+p.getPrice());
			
			out.print("<h3> Product List Information</h3>");
			for(Product pr : pw.findAll(new FindAll()).get_return()){
				out.print("<br> Id: "+pr.getId());
				out.print("<br> Name: "+pr.getName());
				out.print("<br> Price: "+pr.getPrice());	
				out.print("<br>============================");
			}
			
			
		} catch (Exception e) {
			out.print(e.getMessage());
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		// TODO Auto-generated method stub
	}

}
