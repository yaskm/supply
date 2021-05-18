package com.scm.vendor.servlet;

import java.io.IOException;

import com.scm.vendor.util.VendorAthuntiacater;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;
@WebServlet("venorlogin")
public class venorlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String VendorName = request.getParameter("VendorName");
			String VendorPassword = request.getParameter("VendorPassword");
			boolean auth = VendorAthuntiacater.validate(VendorName, VendorPassword);
			if (auth) {
				session.setAttribute("AUTH", true);
				request.getRequestDispatcher("/vendorhome").forward(request, response);
			} else {
				response.sendRedirect("vendor/login.jsp");
				session.setAttribute("ERROR", "Athuentication Fail");
			}
		} catch (Exception e) {

		}
		response.getWriter().append("Served at: ").append(request.getContextPath());
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		doGet(request, response);
	}

}
