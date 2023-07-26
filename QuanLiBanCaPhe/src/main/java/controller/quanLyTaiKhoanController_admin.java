package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import bo.TaiKhoanbo;
import bean.TaiKhoan;

@WebServlet("/quanLyTaiKhoanController_admin")
public class quanLyTaiKhoanController_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public quanLyTaiKhoanController_admin() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		request.setCharacterEncoding("utf-8");
		response.setCharacterEncoding("utf-8");

		TaiKhoanbo tkbo = new TaiKhoanbo();
		ArrayList<TaiKhoan> dstk;

		try {
			dstk = tkbo.getTaiKhoan();

			String action = request.getParameter("action");

			String matk, tendn, mk, manv;

			if (action != null) {
				switch (action) {
				case "add":
					matk = request.getParameter("matk");
					tendn = request.getParameter("tendn");
					mk = request.getParameter("mk");
					manv = request.getParameter("manv");

					tkbo.add(matk, tendn, mk, manv);

					break;
				case "edit":
					matk = request.getParameter("matk");
					tendn = request.getParameter("tendn");
					mk = request.getParameter("mk");
					manv = request.getParameter("manv");

					tkbo.edit(matk, tendn, mk, manv);

					break;
				case "delete":
					String confirmDelete = request.getParameter("confirm_delete");
					if (confirmDelete != null && confirmDelete.equals("true")) {
						matk = request.getParameter("matk");
						tkbo.delete(matk);
					}

					break;
				default:
					break;
				}

				response.sendRedirect("quanLyTaiKhoanController_admin");
			}

			request.setAttribute("dstk", dstk);

			RequestDispatcher rd = request.getRequestDispatcher("./view/QuanLyTaiKhoan_admin.jsp");
			rd.forward(request, response);

		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * @see HttpServlet#doPost(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doPost(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		// TODO Auto-generated method stub
		doGet(request, response);
	}

}
