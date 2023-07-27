package controller;

import java.io.IOException;
import java.util.ArrayList;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import bean.TaiKhoan;
import bo.TaiKhoanbo;

/**
 * Servlet implementation class dangNhapController
 */
@WebServlet("/dangNhapController")
public class dangNhapController extends HttpServlet {
	private static final long serialVersionUID = 1L;

	/**
	 * @see HttpServlet#HttpServlet()
	 */
	public dangNhapController() {
		super();
		// TODO Auto-generated constructor stub
	}

	/**
	 * @see HttpServlet#doGet(HttpServletRequest request, HttpServletResponse
	 *      response)
	 */
	protected void doGet(HttpServletRequest request, HttpServletResponse response)
			throws ServletException, IOException {
		String tendn = request.getParameter("tendn");
		String matkhau = request.getParameter("matkhau");

		TaiKhoanbo tkbo = new TaiKhoanbo();
		ArrayList<TaiKhoan> dstk;

		HttpSession session = request.getSession();
		try {
			dstk = tkbo.getTaiKhoan();
			int check = 1;
			if (tendn != null && matkhau != null) {
				for (TaiKhoan tk : dstk) {
					if (tendn.equals(tk.getTenDangNhap()) && matkhau.equals(tk.getMatKhau())) {
						String manv = tk.getMaNhanVien();
						session.setAttribute("tendn", tendn);
						session.setAttribute("manv", manv);
						// Hiển thị giao diện theo chức vụ
						if (tkbo.getTenChucVu(manv).equals("nhân viên")) {
							response.sendRedirect("hienThiMenuController");
						} else if (tkbo.getTenChucVu(manv).equals("admin")) {
							response.sendRedirect("GiaoDienChinh_admin");
						}
					} else {
						check = 0;
					}
				}
			}

			request.setAttribute("dnsai", check);
			RequestDispatcher rd = request.getRequestDispatcher("./view/DangNhap.jsp");
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
