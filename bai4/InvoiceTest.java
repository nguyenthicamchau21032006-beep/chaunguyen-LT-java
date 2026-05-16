package bai4;

import java.util.ArrayList;
import java.util.Scanner;

public class InvoiceTest {
    private static ArrayList<Invoice> listInvoice = new ArrayList<>();
    private static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        initMockData();

        int choice;
        do {
            System.out.println("\n================= MENU QUẢN LÝ HÓA ĐƠN =================");
            System.out.println("1. Nhập thêm Invoice vào danh sách (Không trùng mã)");
            System.out.println("2. Xuất thông tin toàn bộ Invoice trong danh sách");
            System.out.println("3. Sắp xếp danh sách hóa đơn tăng dần theo Mã MH và Số lượng");
            System.out.println("4. Tìm kiếm Invoice theo Mã mặt hàng (Tìm tuyến tính)");
            System.out.println("5. Xóa một Invoice theo Mã mặt hàng");
            System.out.println("0. Thoát chương trình");
            System.out.print("Mời em chọn chức năng (0-5): ");
            choice = sc.nextInt();
            sc.nextLine(); 

            switch (choice) {
                case 1:
                    nhapInvoice();
                    break;
                case 2:
                    xuatDanhSach();
                    break;
                case 3:
                    sapXepHoadon();
                    break;
                case 4:
                    timKiemInvoice();
                    break;
                case 5:
                    xoaInvoice();
                    break;
                case 0:
                    System.out.println("Đã thoát chương trình thành công!");
                    break;
                default:
                    System.out.println("Chức năng không hợp lệ! Vui lòng chọn lại.");
            }
        } while (choice != 0);
    }

    private static void initMockData() {
        listInvoice.add(new Invoice("MS05", "Ban phim Co", 2, 850000));
        listInvoice.add(new Invoice("MS01", "Chuot Logitech G102", 5, 150000));
        listInvoice.add(new Invoice("MS03", "Man hinh Dell 24 inch", 1, 3500000));
        listInvoice.add(new Invoice("MS02", "Tai nghe Sony", 3, 1200000));
        listInvoice.add(new Invoice("MS09", "O cung SSD 512GB", 10, 950000));
        listInvoice.add(new Invoice("MS04", "Ram Corsair 16GB", 4, 1100000));
        listInvoice.add(new Invoice("MS07", "Nguon May Tinh 650W", 2, 1350000));
        listInvoice.add(new Invoice("MS06", "Vo Case Gaming", 1, 750000));
        listInvoice.add(new Invoice("MS10", "Keo Tan Nhiet MX4", 20, 80000));
        listInvoice.add(new Invoice("MS08", "Card do hoa RTX 4060", 1, 15000000));
    }

    private static void nhapInvoice() {
        System.out.println("\n--- THÊM MỚI HÓA ĐƠN ---");
        String partNumber;
        while (true) {
            System.out.print("Nhập mã mặt hàng: ");
            partNumber = sc.nextLine();
            
            boolean biTrung = false;
            for (Invoice inv : listInvoice) {
                if (inv.getPartNumber().equalsIgnoreCase(partNumber)) {
                    biTrung = true;
                    break;
                }
            }
            
            if (biTrung) {
                System.out.println("Lỗi: Mã này đã tồn tại! Vui lòng nhập mã khác.");
            } else {
                break; 
            }
        }

        System.out.print("Nhập mô tả mặt hàng: ");
        String partDescription = sc.nextLine();
        System.out.print("Nhập số lượng mua: ");
        int quantity = sc.nextInt();
        System.out.print("Nhập giá mỗi mặt hàng: ");
        double pricePerItem = sc.nextDouble();
        sc.nextLine(); 

        Invoice newInv = new Invoice(partNumber, partDescription, quantity, pricePerItem);
        listInvoice.add(newInv);
        System.out.println("Thêm hóa đơn mới thành công!");
    }

    private static void xuatDanhSach() {
        System.out.println("\n--- HIỂN THỊ DANH SÁCH HÓA ĐƠN ---");
        if (listInvoice.isEmpty()) {
            System.out.println("Danh sách hiện đang trống!");
            return;
        }
        
        System.out.printf("%-10s %-25s %-10s %-15s %-15s\n", "Mã MH", "Mô tả sản phẩm", "Số lượng", "Đơn giá", "Tổng tiền");
        System.out.println("--------------------------------------------------------------------------------");
        for (Invoice inv : listInvoice) {
            System.out.printf("%-10s %-25s %-10d %-15.2f %-15.2f\n", 
                inv.getPartNumber(), inv.getPartDescription(), inv.getQuantity(), inv.getPricePerItem(), inv.getInvoiceAmount());
        }
    }

    private static void sapXepHoadon() {
        for (int i = 0; i < listInvoice.size() - 1; i++) {
            for (int j = i + 1; j < listInvoice.size(); j++) {
                int compareMa = listInvoice.get(i).getPartNumber().compareTo(listInvoice.get(j).getPartNumber());
                if (compareMa > 0) {
                    Invoice temp = listInvoice.get(i);
                    listInvoice.set(i, listInvoice.get(j));
                    listInvoice.set(j, temp);
                } else if (compareMa == 0) {
                    if (listInvoice.get(i).getQuantity() > listInvoice.get(j).getQuantity()) {
                        Invoice temp = listInvoice.get(i);
                        listInvoice.set(i, listInvoice.get(j));
                        listInvoice.set(j, temp);
                    }
                }
            }
        }
        System.out.println("Đã hoàn thành sắp xếp danh sách hóa đơn.");
        xuatDanhSach(); 
    }

    private static void timKiemInvoice() {
        System.out.print("\nNhập mã mặt hàng muốn tìm: ");
        String maTim = sc.nextLine();
        boolean checkTim = false;

        for (Invoice inv : listInvoice) {
            if (inv.getPartNumber().equalsIgnoreCase(maTim)) {
                System.out.println("\n[KẾT QUẢ TÌM THẤY]");
                System.out.println("+ Mã mặt hàng: " + inv.getPartNumber());
                System.out.println("+ Mô tả: " + inv.getPartDescription());
                System.out.println("+ Số lượng: " + inv.getQuantity());
                System.out.println("+ Đơn giá: " + inv.getPricePerItem());
                System.out.println("+ Tổng tiền: " + inv.getInvoiceAmount());
                checkTim = true;
                break; 
            }
        }
        if (!checkTim) {
            System.out.println("Không tìm thấy hóa đơn nào có mã: " + maTim);
        }
    }

    private static void xoaInvoice() {
        System.out.print("\nNhập mã mặt hàng muốn xóa: ");
        String maXoa = sc.nextLine();
        boolean checkXoa = false;

        for (int i = 0; i < listInvoice.size(); i++) {
            if (listInvoice.get(i).getPartNumber().equalsIgnoreCase(maXoa)) {
                listInvoice.remove(i); 
                System.out.println("Đã xóa hóa đơn có mã '" + maXoa + "' thành công!");
                checkXoa = true;
                break;
            }
        }
        if (!checkXoa) {
            System.out.println("Xóa thất bại! Không tồn tại mã mặt hàng '" + maXoa + "'.");
        }
    }
}