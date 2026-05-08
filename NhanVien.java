package bai1;

public class NhanVien {
    // Các thuộc tính
    private String ho;
    private String ten;
    private int soSP;

    // Hàm khởi tạo có kiểm tra số sản phẩm âm
    public NhanVien(String ho, String ten, int soSP) {
        this.ho = ho;
        this.ten = ten;
        this.soSP = (soSP < 0) ? 0 : soSP; 
    }

    // Các hàm Get/Set
    public String getHo() { return ho; }
    public void setHo(String ho) { this.ho = ho; }

    public String getTen() { return ten; }
    public void setTen(String ten) { this.ten = ten; }

    public int getSoSP() { return soSP; }
    public void setSoSP(int soSP) {
        if (soSP >= 0) this.soSP = soSP;
    }

    // Hàm tính lương dựa trên đơn giá tùy thuộc số sản phẩm
    public double getLuong() {
        double donGia;
        if (soSP <= 199) {
            donGia = 0.5; // Ví dụ: 1-199 SP đơn giá 0.5
        } else if (soSP <= 399) {
            donGia = 0.55; // 200-399 SP đơn giá 0.55
        } else if (soSP <= 599) {
            donGia = 0.6; // 400-599 SP đơn giá 0.6
        } else {
            donGia = 0.65; // Trên 600 SP đơn giá 0.65
        }
        return soSP * donGia;
    }
}