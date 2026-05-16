

public class XuatLuong {
    public static void main(String[] args) {
        // Tạo nhân viên mới để test
        NhanVien nv = new NhanVien("Nguyễn", "Văn An", 450);
        
        System.out.println("Nhân viên: " + nv.getHo() + " " + nv.getTen());
        System.out.println("Số sản phẩm: " + nv.getSoSP());
        System.out.println("Lương: " + nv.getLuong());
    }
}
