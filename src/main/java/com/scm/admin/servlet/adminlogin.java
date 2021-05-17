package com.scm.admin.servlet;

import java.io.IOException;

import com.scm.admin.util.AdminAthuntiacater;
import com.scm.vendor.util.VendorAthuntiacater;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import jakarta.servlet.http.HttpSession;

public class adminlogin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		HttpSession session = request.getSession();
		try {
			String AdminName = request.getParameter("AdminName");
			String AdminPassword = request.getParameter("AdminPassword");
			boolean auth = AdminAthuntiacater.validate(AdminName, AdminPassword);
			if (auth) {
				session.setAttribute("AUTH", true);
				request.getRequestDispatcher("/adminhome").forward(request, response);
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
