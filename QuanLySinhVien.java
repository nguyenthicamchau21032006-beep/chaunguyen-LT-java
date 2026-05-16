

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySinhVien {
    public static void main(String[] args) {
        ArrayList<String> dsSV = new ArrayList<>();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("\n--- MENU QUẢN LÝ SINH VIÊN ---");
            System.out.println("1. Thêm Sinh viên");
            System.out.println("2. Xuất danh sách");
            System.out.println("3. Sửa Sinh viên");
            System.out.println("4. Xóa Sinh viên");
            System.out.println("5. Tìm Sinh viên có chữ 'An'");
            System.out.println("6. Sắp xếp Sinh viên");
            System.out.println("7. Xuất số lượng sinh viên");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn  chọn: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1:
                    System.out.print("Nhập tên SV muốn thêm: ");
                    dsSV.add(sc.nextLine());
                    break;
                case 2:
                    System.out.println("Danh sách SV: " + dsSV);
                    break;
                case 3:
                    System.out.print("Nhập vị trí muốn sửa (từ 0): ");
                    int index = sc.nextInt();
                    sc.nextLine();
                    if (index >= 0 && index < dsSV.size()) {
                        System.out.print("Nhập tên mới: ");
                        dsSV.set(index, sc.nextLine());
                    } else System.out.println("Vị trí không hợp lệ!");
                    break;
                case 4:
                    System.out.print("Nhập tên muốn xóa: ");
                    String tenXoa = sc.nextLine();
                    if (dsSV.remove(tenXoa)) System.out.println("Đã xóa!");
                    else System.out.println("Không tìm thấy tên này.");
                    break;
                case 5:
                    System.out.println("Các SV có tên chứa chữ 'An':");
                    for (String ten : dsSV) {
                        if (ten.toLowerCase().contains("an")) System.out.println(ten);
                    }
                    break;
                case 6:
                    Collections.sort(dsSV);
                    System.out.println("Đã sắp xếp xong!");
                    break;
                case 7:
                    System.out.println("Số lượng sinh viên hiện tại: " + dsSV.size());
                    break;
            }
        } while (chon != 0);
        System.out.println("Tạm biệt!");
    }
}
