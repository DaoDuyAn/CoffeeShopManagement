package dao;

import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;

import bean.TaiKhoan;

public class TaiKhoandao {
	public ArrayList<TaiKhoan> getTaiKhoan() throws Exception {
		ArrayList<TaiKhoan> ds = new ArrayList<TaiKhoan>();

		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "select * from TaiKhoan";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		ResultSet rs = cmd.executeQuery();

		while (rs.next()) {
			String maTaiKhoan = rs.getString("MaTaiKhoan");
			String tenDangNhap = rs.getString("TenDangNhap");
			String matKhau = rs.getString("MatKhau");
			String maNhanVien = rs.getString("MaNhanVien");
			ds.add(new TaiKhoan(maTaiKhoan, tenDangNhap, matKhau, maNhanVien));
		}
		rs.close();

		return ds;
	}
	
	public String getTenChucVu(String MaNhanVien) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "SELECT ChucVu.TenChucVu FROM TaiKhoan INNER JOIN NhanVien ON TaiKhoan.MaNhanVien = NhanVien.MaNhanVien INNER JOIN ChucVu ON NhanVien.MaChucVu = ChucVu.MaChucVu WHERE (TaiKhoan.MaNhanVien = ?)";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setString(1, MaNhanVien);

		ResultSet rs = cmd.executeQuery();
		String tenChucVu = null;
		while (rs.next()) {
			tenChucVu = rs.getString("TenChucVu");
		}
		rs.close();
		
		return tenChucVu;
	}

	public int addTaiKhoan(String MaTaiKhoan, String TenDangNhap, String MatKhau, String MaNhanVien) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "insert into TaiKhoan(MaTaiKhoan, TenDangNhap, MatKhau, MaNhanVien) values(?,?,?,?)";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setString(1, MaTaiKhoan);
		cmd.setString(2, TenDangNhap);
		cmd.setString(3, MatKhau);
		cmd.setString(4, MaNhanVien);

		int res = cmd.executeUpdate();
		return res;
	}

	public int editTaiKhoan(String MaTaiKhoan, String TenDangNhap, String MatKhau, String MaNhanVien) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "update TaiKhoan set TenDangNhap=?, MatKhau=?, MaNhanVien=? where MaTaiKhoan=?";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setString(1, TenDangNhap);
		cmd.setString(2, MatKhau);
		cmd.setString(3, MaNhanVien);
		cmd.setString(4, MaTaiKhoan);

		int res = cmd.executeUpdate();
		return res;
	}

	public int deleteTaiKhoan(String MaTaiKhoan) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "delete TaiKhoan where MaTaiKhoan=?";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setString(1, MaTaiKhoan);

		int res = cmd.executeUpdate();
		return res;
	}

	public static void main(String[] args) {
		TaiKhoandao t = new TaiKhoandao();
		ArrayList<TaiKhoan> p = new ArrayList<TaiKhoan>();
		String ten = null;

		int q = 0;
		try {
			ten=t.getTenChucVu("NV1");
//			p = t.getTaiKhoan();
//			q = t.addTaiKhoan("bunb", "kkk", (long) 50000, 1);
//			q = t.editTaiKhoan(7, "bunb", "ggg", (long) 50000, 1);
//			q = t.deleteTaiKhoan(7);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(ten);
//		System.out.println(p);
//		System.out.println(q);

	}
}
