package de.zeroco.contact;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class DeleteController extends HttpServlet {

	private static final long serialVersionUID = 1L;

	public void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		int id = Integer.parseInt(request.getParameter("id"));
		int rowUpdate = Service.delete(id);
		request.setAttribute("status", Service.status(rowUpdate));
		request.getRequestDispatcher("ContactDetails.jsp").forward(request, response);
	}
}
