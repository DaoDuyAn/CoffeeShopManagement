package bo;

import java.util.ArrayList;

import bean.TaiKhoan;
import dao.TaiKhoandao;

public class TaiKhoanbo {
	TaiKhoandao tkdao = new TaiKhoandao();
	ArrayList<TaiKhoan> ds;

	public ArrayList<TaiKhoan> getTaiKhoan() throws Exception {
		ds = tkdao.getTaiKhoan();
		return ds;
	}
	
	public String getTenChucVu(String maNhanVien) throws Exception {
		String tenChucVu = tkdao.getTenChucVu(maNhanVien);
		return tenChucVu;
	}

	public int add(String MaTaiKhoan, String TenDangNhap, String MatKhau, String MaNhanVien) throws Exception {
		return tkdao.addTaiKhoan(MaTaiKhoan, TenDangNhap, MatKhau, MaNhanVien);
	}

	public int edit(String MaTaiKhoan, String TenDangNhap, String MatKhau, String MaNhanVien) throws Exception {
		return tkdao.editTaiKhoan(MaTaiKhoan, TenDangNhap, MatKhau, MaNhanVien);
	}

	public int delete(String MaTaiKhoan) throws Exception {
		return tkdao.deleteTaiKhoan(MaTaiKhoan);
	}
}
