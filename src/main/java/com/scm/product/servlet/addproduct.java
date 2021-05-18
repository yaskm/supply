package com.scm.product.servlet;

import java.io.IOException;
import java.sql.SQLException;

import com.scm.model.Product;
import com.scm.product.util.ProductDb;

import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class addproduct extends HttpServlet {
	private static final long serialVersionUID = 1L;

	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String ProductName = request.getParameter("ProductName");
		String Description = request.getParameter("Description");
		int Price = Integer.parseInt(request.getParameter("Price"));

		Product p1 = new Product();
		p1.setProductName(ProductName);
		p1.setProductDisc(ProductName);
		p1.setProductPrice(Price);

		try {
			ProductDb.productInsert(p1);
		} catch (SQLException e) {
			e.printStackTrace();
		}

	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {

		doGet(request, response);
	}

}
