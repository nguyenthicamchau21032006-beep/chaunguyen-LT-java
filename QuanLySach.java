package bai1;

import java.util.HashMap;
import java.util.Scanner;
import java.util.Map;

public class QuanLySach {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        HashMap<Integer, String> dsSach = new HashMap<>();
        int chon;

        do {
            System.out.println("\nHỆ THỐNG QUẢN LÝ SÁCH  ");
            System.out.println("1. Thêm sách mới");
            System.out.println("2. Xuất danh sách sách");
            System.out.println("3. Sửa tên sách theo mã");
            System.out.println("4. Xóa sách theo mã");
            System.out.println("5. Tìm kiếm sách theo mã");
            System.out.println("0. Thoát");
            System.out.print("Mời chọn chức năng: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1: // THÊM
                    System.out.print("Nhập mã sách (số nguyên): ");
                    int maThem = sc.nextInt();
                    sc.nextLine(); 
                    System.out.print("Nhập tên cuốn sách: ");
                    String tenThem = sc.nextLine();
                    dsSach.put(maThem, tenThem);
                    System.out.println("Đã thêm thành công!");
                    break;

                case 2: 
                    System.out.println("Danh sách các cuốn sách hiện có ");
                    if (dsSach.isEmpty()) {
                        System.out.println("Thư viện đang trống !");
                    } else {
                        for (Map.Entry<Integer, String> entry : dsSach.entrySet()) {
                            System.out.println("Mã: " + entry.getKey() + " | Tên sách: " + entry.getValue());
                        }
                    }
                    break;

                case 3: // SỬA
                    System.out.print("Nhập mã sách cần sửa: ");
                    int maSua = sc.nextInt();
                    sc.nextLine();
                    if (dsSach.containsKey(maSua)) {
                        System.out.print("Nhập tên mới cho cuốn sách: ");
                        String tenMoi = sc.nextLine();
                        dsSach.put(maSua, tenMoi);
                        System.out.println("Đã cập nhật tên sách!");
                    } else {
                        System.out.println("Không tìm thấy mã sách này để sửa!");
                    }
                    break;

                case 4: // XÓA
                    System.out.print("Nhập mã sách muốn xóa: ");
                    int maXoa = sc.nextInt();
                    if (dsSach.containsKey(maXoa)) {
                        dsSach.remove(maXoa);
                        System.out.println("Đã xóa cuốn sách khỏi hệ thống.");
                    } else {
                        System.out.println("Mã sách không tồn tại!");
                    }
                    break;

                case 5: 
                    System.out.print("Nhập mã sách cần tìm: ");
                    int maTim = sc.nextInt();
                    if (dsSach.containsKey(maTim)) {
                        System.out.println("=> Kết quả: " + dsSach.get(maTim));
                    } else {
                        System.out.println("Không tìm thấy cuốn sách nào có mã này.");
                    }
                    break;
            }
        } while (chon != 0);

        System.out.println("Chương trình kết thúc. !");
        sc.close();
    }
}