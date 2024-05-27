package com.chainsys.servlet;

import java.io.IOException;
import java.sql.SQLException;
import java.util.ArrayList;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

/**
 * Servlet implementation class SearchData
 */
@WebServlet("/SearchData")
public class SearchData extends HttpServlet {
	private static final long serialVersionUID = 1L;
       
    
    public SearchData() {
        super();
      
    }

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
	 */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String name = request.getParameter("name");
        Crud crud = new Crud();
        try {
            ArrayList<FormData> formDataList = crud.searchProduct(name);
            request.setAttribute("allFormDataList", formDataList);
        } catch (SQLException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        request.getRequestDispatcher("table.jsp").forward(request, response);
    }


}
