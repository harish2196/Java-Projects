package com.chainsys.servlet;

import java.io.IOException;
import java.io.PrintWriter;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class PriceFilterServlet
 */
@WebServlet("/PriceFilterServlet")
public class PriceFilterServlet extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public PriceFilterServlet() {
        super();
        // TODO Auto-generated constructor stub
    }
  

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String priceRange = request.getParameter("priceRange");
        String[] prices = priceRange.split("-");
        double minPrice = Double.parseDouble(prices[0]);
        double maxPrice = Double.parseDouble(prices[1]);
        Crud crud = new Crud();
        
        try {
			ArrayList<FormData> formDataList =crud.filterPrice(minPrice, maxPrice);
		     request.setAttribute("allFormDataList", formDataList);
		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
        request.getRequestDispatcher("table.jsp").forward(request, response);

    }
}
