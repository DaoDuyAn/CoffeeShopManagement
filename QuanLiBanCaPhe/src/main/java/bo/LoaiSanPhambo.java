package bo;

import java.util.ArrayList;

import bean.LoaiSanPham;
import dao.LoaiSanPhamdao;

public class LoaiSanPhambo {
	LoaiSanPhamdao lspdao = new LoaiSanPhamdao();
	ArrayList<LoaiSanPham> ds;

	public ArrayList<LoaiSanPham> getLoaiSP() throws Exception {
		ds = lspdao.getLoaiSP();
		return ds;
	}

	public int add(String TenLoaiSP) throws Exception {
		return lspdao.addLoaiSP(TenLoaiSP);
	}

	public int edit(int MaLoaiSP, String TenLoaiSP) throws Exception {
		return lspdao.editLoaiSP(MaLoaiSP, TenLoaiSP);
	}

	public int delete(int MaLoaiSP) throws Exception {
		return lspdao.deleteLoaiSP(MaLoaiSP);
	}
	
}
