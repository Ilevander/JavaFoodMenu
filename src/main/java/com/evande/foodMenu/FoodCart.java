package com.evande.foodMenu;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;
import java.io.IOException;


public class FoodCart extends HttpServlet {
	private static final long serialVersionUID = 1L;

	
	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

		//get the data from the database
		String[] foodItems = {"Tajine","Cousscouss","Pizza"};
		request.setAttribute("foodItems", foodItems);
		
		//redirect the data to a different page (view)
		
		RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/show-food.jsp");
		
		dispatcher.forward(request, response);
	}

}









