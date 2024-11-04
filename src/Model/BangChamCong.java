package Model;

public class BangChamCong {
    private String maBangChamCong;
    private String maNhanSu;
    private String thang;
    private int soNgayLamTrongThang;
    private int soNgayNghi;
    private String ghiChu;
    private String DuocPhepChinhSua;

	public BangChamCong(){}

	public BangChamCong(String maBangChamCong, String maNhanSu, String thang, int soNgayLamTrongThang, int soNgayNghi, String ghiChu, String DuocPhepChinhSua) {
	    this.maBangChamCong = maBangChamCong;
	    this.maNhanSu = maNhanSu;
	    this.thang = thang;
	    this.soNgayLamTrongThang = soNgayLamTrongThang;
	    this.soNgayNghi = soNgayNghi;
        this.ghiChu = ghiChu;
	    this.DuocPhepChinhSua = DuocPhepChinhSua;
	}
	public String getMaBangChamCong() {
		return maBangChamCong;
	}
	public void setMaBangChamCong(String maBangChamCong) {
		this.maBangChamCong = maBangChamCong;
	}
	public String getMaNhanSu() {
		return maNhanSu;
	}
	public void setMaNhanSu(String maNhanSu) {
		this.maNhanSu = maNhanSu;
	}
	public String getThang() {
		return thang;
	}
	public void setThang(String thang) {
		this.thang = thang;
	}

	public int getSoNgayLamTrongThang() {
		return soNgayLamTrongThang;
	}
	public void setSoNgayLamTrongThang(int soNgayLamTrongThang) {
		this.soNgayLamTrongThang = soNgayLamTrongThang;
	}

	public String getDuocPhepChinhSua() {
		return DuocPhepChinhSua;
	}
	public void setDuocPhepChinhSua(String DuocPhepChinhSua) {
		this.DuocPhepChinhSua = DuocPhepChinhSua;
	}

    public String getGhiChu() {
        return ghiChu;
    }
    
    public void setGhiChu(String ghiChu) {
        this.ghiChu = ghiChu;
    }
    
    public int getSoNgayNghi() {
        return soNgayNghi;
    }
    
    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }
}