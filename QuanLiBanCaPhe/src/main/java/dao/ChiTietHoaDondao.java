package dao;

import java.util.ArrayList;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

import bean.ChiTietHoaDon;

public class ChiTietHoaDondao {
	public ArrayList<ChiTietHoaDon> getChiTietHoaDon(int MaHoaDon) throws Exception {
		ArrayList<ChiTietHoaDon> ds = new ArrayList<ChiTietHoaDon>();

		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "select * from ChiTietHoaDon where MaHoaDon=?";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setInt(1, MaHoaDon);
		
		ResultSet rs = cmd.executeQuery();
		while (rs.next()) {
			int maHoaDon = rs.getInt("MaHoaDon");
			int maSanPham = rs.getInt("MaSanPham");
			int soLuong = rs.getInt("SoLuong");
			Long donGia = rs.getLong("DonGia");
			ds.add(new ChiTietHoaDon(maHoaDon, maSanPham, soLuong, donGia));
		}
		rs.close();

		return ds;
	}

	public int addChiTietHoaDon(int MaHoaDon, int MaSanPham, int SoLuong, Long DonGia) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "insert into ChiTietHoaDon(MaHoaDon, MaSanPham, SoLuong, DonGia) values(?,?,?,?)";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setInt(1, MaHoaDon);
		cmd.setInt(2, MaSanPham);
		cmd.setInt(3, SoLuong);
		cmd.setLong(4, DonGia);

		int res = cmd.executeUpdate();
		return res;
	}

	public int editChiTietHoaDon(int MaHoaDon, int MaSanPham, int SoLuong, Long DonGia) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "update ChiTietHoaDon set MaSanPham=?, SoLuong=?, DonGia=? where MaHoaDon=?";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setInt(1, MaSanPham);
		cmd.setInt(2, SoLuong);
		cmd.setLong(3, DonGia);
		cmd.setInt(4, MaHoaDon);

		int res = cmd.executeUpdate();
		return res;
	}

	public int deleteChiTietHoaDon(int MaHoaDon, int MaSanPham) throws Exception {
		CoSo cs = new CoSo();
		cs.KetNoi();

		String sql = "delete ChiTietHoaDon where MaHoaDon=? and MaSanPham=?";
		PreparedStatement cmd = cs.cn.prepareStatement(sql);
		cmd.setInt(1, MaHoaDon);
		cmd.setInt(2, MaSanPham);

		int res = cmd.executeUpdate();
		return res;
	}

	public static void main(String[] args) {
		ChiTietHoaDondao t = new ChiTietHoaDondao();
		ArrayList<ChiTietHoaDon> p = new ArrayList<ChiTietHoaDon>();

		int q = 0;
		try {
//			q = t.addChiTietHoaDon("bunb", "kkk", (long) 50000, 1);
//			q = t.editChiTietHoaDon(7, "bunb", "ggg", (long) 50000, 1);
//			q = t.deleteChiTietHoaDon(7);
		} catch (Exception e) {

			e.printStackTrace();
		}
		System.out.println(p);
//		System.out.println(q);

	}

}
