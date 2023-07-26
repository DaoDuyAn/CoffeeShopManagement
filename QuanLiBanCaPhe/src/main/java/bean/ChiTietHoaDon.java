package bean;

public class ChiTietHoaDon {
	private int MaHoaDon, MaSanPham, SoLuong;
	private Long DonGia;

	public ChiTietHoaDon(int maHoaDon, int maSanPham, int soLuong, Long donGia) {
		super();
		MaHoaDon = maHoaDon;
		MaSanPham = maSanPham;
		SoLuong = soLuong;
		DonGia = donGia;
	}

	public int getMaHoaDon() {
		return MaHoaDon;
	}

	public void setMaHoaDon(int maHoaDon) {
		MaHoaDon = maHoaDon;
	}

	public int getMaSanPham() {
		return MaSanPham;
	}

	public void setMaSanPham(int maSanPham) {
		MaSanPham = maSanPham;
	}

	public int getSoLuong() {
		return SoLuong;
	}

	public void setSoLuong(int soLuong) {
		SoLuong = soLuong;
	}

	public Long getDonGia() {
		return DonGia;
	}

	public void setDonGia(Long donGia) {
		DonGia = donGia;
	}

	@Override
	public String toString() {
		return "ChiTietHoaDon [MaHoaDon=" + MaHoaDon + ", MaSanPham=" + MaSanPham + ", SoLuong=" + SoLuong + ", DonGia="
				+ DonGia + "]";
	}

}
