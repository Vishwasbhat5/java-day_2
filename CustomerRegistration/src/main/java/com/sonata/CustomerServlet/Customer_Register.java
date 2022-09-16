package com.sonata.CustomerServlet;

import com.sonata.Cust_Bean.Customer_Bean;
import com.sonata.Customer_DAO.CustomerDAO;

import jakarta.servlet.RequestDispatcher;
import jakarta.servlet.ServletException;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

public class Customer_Register extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    private CustomerDAO customerDAO = new CustomerDAO();
       
    /**
     * @see HttpServlet#HttpServlet()
     */
    public Customer_Register() {
        super();
        // TODO Auto-generated constructor stub
    }





  /**
     * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        // TODO Auto-generated method stub
        response.getWriter().append("Served at: ").append(request.getContextPath());
        
        RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/customerregister.jsp");
        dispatcher.forward(request, response);
        
        
    }





  /**
     * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse response)
     */
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        
        String firstName = request.getParameter("firstName");
        String lastName = request.getParameter("lastName");
       // String username = request.getParameter("username");
       // String password = request.getParameter("password");
        String address = request.getParameter("address");
        String contact = request.getParameter("contact");
        
         Customer_Bean customer = new Customer_Bean();
            customer.setName(Name);
            customer.getCustomerId(CustomerId);
            customer.setAddress(address);
            customer.setContactno(contact);





          try {
                customerDAO.registerCustomer(customer);
            } catch (Exception e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
           //WEB-INF/views/customerdetails.jsp




           RequestDispatcher dispatcher = request.getRequestDispatcher("/WEB-INF/views/customerdetails.jsp");
            dispatcher.forward(request, response);
        }