package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import model.bean.User;
import model.dao.UserDAO;
import util.AuthUtil;
import util.DefineUtil;

public class AdminIndexUserController extends HttpServlet {
	private static final long serialVersionUID = 1L;
	private UserDAO userDAO;
    public AdminIndexUserController() {
        super();
        userDAO= new UserDAO();
    }

	protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
		response.setContentType("text/html");
		response.setCharacterEncoding("utf-8");
		if (!AuthUtil.checkLogin(request, response)) {
			response.sendRedirect(request.getContextPath()+"/login");
			return;
		}
		// láº¥y tá»•ng sá»‘ ngÆ°á»�i dÃ¹ng
				int numberOfItems= userDAO.numberOfItems();
				int numberOfPages=(int) Math.ceil((float) numberOfItems / DefineUtil.NUMBER_PER_PAGE);
				int currentPage= 1;
				try {
					currentPage=Integer.parseInt( request.getParameter("page"));
				} catch (Exception e) {
				}
				if (currentPage > numberOfPages || currentPage <1) {
					currentPage=1;
				}
				int offset= (currentPage-1)* DefineUtil.NUMBER_PER_PAGE;
				ArrayList<User> users= userDAO.getItemsPagination(offset);
				request.setAttribute("numberOfItems", numberOfItems);
				request.setAttribute("numberOfPages", numberOfPages);
				request.setAttribute("currentPage", currentPage);
				request.setAttribute("users", users);
				RequestDispatcher rd=request.getRequestDispatcher("/admin/user/index.jsp");
				rd.forward(request, response);
	}

	protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

	}

}
