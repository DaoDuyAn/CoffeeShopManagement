package bo;

import java.util.ArrayList;
import java.util.Date;

import bean.NhanVien;
import dao.NhanViendao;

public class NhanVienbo {
	NhanViendao nvdao = new NhanViendao();
	ArrayList<NhanVien> ds;

	public ArrayList<NhanVien> getNhanVien() throws Exception {
		ds = nvdao.getNhanVien();
		return ds;
	}

	public int add(String MaNhanVien, String TenNhanVien, Date NgaySinh, Boolean GioiTinh, String MaChucVu)
			throws Exception {
		return nvdao.addNhanVien(MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, MaChucVu);
	}

	public int edit(String MaNhanVien, String TenNhanVien, Date NgaySinh, Boolean GioiTinh, String MaChucVu)
			throws Exception {
		return nvdao.editNhanVien(MaNhanVien, TenNhanVien, NgaySinh, GioiTinh, MaChucVu);
	}

	public int delete(String MaNhanVien) throws Exception {
		return nvdao.deleteNhanVien(MaNhanVien);
	}
}
