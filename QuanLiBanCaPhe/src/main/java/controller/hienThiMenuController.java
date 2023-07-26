package controller;

import java.io.IOException;
import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import java.util.ArrayList;

import bo.DatMonbo;
import bo.LoaiSanPhambo;
import bo.SanPhambo;
import bean.DatMon;
import bean.LoaiSanPham;
import bean.SanPham;

/**
 * Servlet implementation class showMenuOrder
 */
@WebServlet("/hienThiMenuController")
public class hienThiMenuController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public hienThiMenuController() {
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

		LoaiSanPhambo lspbo = new LoaiSanPhambo();
		SanPhambo spbo = new SanPhambo();

		ArrayList<LoaiSanPham> dslsp;
		ArrayList<SanPham> dssp;
		try {
			dslsp = lspbo.getLoaiSP();
			dssp = spbo.getSanPham();

			String maloai = request.getParameter("maloai");

			if (maloai != null) {
				dssp = spbo.getSanPham_MaLoai(Integer.parseInt(maloai));
			} else {
				dssp = spbo.getSanPham_MaLoai(1);
			}

			request.setAttribute("dslsp", dslsp);
			request.setAttribute("dssp", dssp);

			RequestDispatcher rd = request.getRequestDispatcher("./view/BanHang.jsp");
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
