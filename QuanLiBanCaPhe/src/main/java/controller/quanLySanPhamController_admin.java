package controller;

import java.io.IOException;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import java.util.ArrayList;

import bo.SanPhambo;
import bean.SanPham;

/**
 * Servlet implementation class quanLySanPhamController
 */
@WebServlet("/quanLySanPhamController_admin")
public class quanLySanPhamController_admin extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public quanLySanPhamController_admin() {
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

		SanPhambo spbo = new SanPhambo();
		ArrayList<SanPham> dssp;

		try {
			dssp = spbo.getSanPham();

			String action = request.getParameter("action");

			String tensp, anhsp;
			Long giaban;
			int masp, maloaisp;

			if (action != null) {
				switch (action) {
				case "add":
					tensp = request.getParameter("tensp");
					anhsp = request.getParameter("anhsp");
					giaban = Long.parseLong(request.getParameter("giaban"));
					maloaisp = Integer.parseInt(request.getParameter("maloaisp"));

					spbo.add(tensp, anhsp, giaban, maloaisp);

					break;
				case "edit":
					masp = Integer.parseInt(request.getParameter("masp"));
					tensp = request.getParameter("tensp");
					anhsp = request.getParameter("anhsp");
					giaban = Long.parseLong(request.getParameter("giaban"));
					maloaisp = Integer.parseInt(request.getParameter("maloaisp"));

					spbo.edit(masp, tensp, anhsp, giaban, maloaisp);

					break;
				case "delete":
					String confirmDelete = request.getParameter("confirm_delete");
					if (confirmDelete != null && confirmDelete.equals("true")) {
						masp = Integer.parseInt(request.getParameter("masp"));
						spbo.delete(masp);
					}

					break;

				default:
					break;
				}
				response.sendRedirect("quanLySanPhamController_admin");
			}

			request.setAttribute("dssp", dssp);

			RequestDispatcher rd = request.getRequestDispatcher("./view/QuanLySanPham_admin.jsp");
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
