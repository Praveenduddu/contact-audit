package de.zeroco.contact;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class InsertController extends HttpServlet {

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		String name = request.getParameter("name");
		String email = request.getParameter("email");
		int generatedKey = Service.getGeneratedKey(Service.getObjectUsingParameters(name, email));
		request.setAttribute("key", generatedKey);
		request.getRequestDispatcher("Display.jsp").forward(request, response);
	}
}
