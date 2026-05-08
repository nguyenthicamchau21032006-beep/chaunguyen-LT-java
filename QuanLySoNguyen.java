package bai1;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class QuanLySoNguyen {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        ArrayList<Integer> dsSo = new ArrayList<>();
        int chon;

        do {
            System.out.println("\n MENU QUẢN LÝ SỐ NGUYÊN ");
            System.out.println("1. Thêm số");
            System.out.println("2. Sửa số");
            System.out.println("3. Xóa số");
            System.out.println("4. Tìm kiếm số");
            System.out.println("5. Sắp xếp danh sách");
            System.out.println("6. Xuất danh sách");
            System.out.println("0. Thoát");
            System.out.print("Mời bạn chọn: ");
            chon = sc.nextInt();

            switch (chon) {
                case 1: 
                    System.out.print("Nhập số nguyên cần thêm: ");
                    dsSo.add(sc.nextInt());
                    System.out.println("Đã thêm thành công!");
                    break;

                case 2: 
                    System.out.print("Nhập vị trí (index) cần sửa: ");
                    int viTriSua = sc.nextInt();
                    if (viTriSua >= 0 && viTriSua < dsSo.size()) {
                        System.out.print("Nhập giá trị mới: ");
                        dsSo.set(viTriSua, sc.nextInt());
                        System.out.println("Đã sửa thành công!");
                    } else {
                        System.out.println("Vị trí không tồn tại em ơi!");
                    }
                    break;

                case 3: 
                    System.out.print("Nhập vị trí (index) cần xóa: ");
                    int viTriXoa = sc.nextInt();
                    if (viTriXoa >= 0 && viTriXoa < dsSo.size()) {
                        dsSo.remove(viTriXoa);
                        System.out.println("Đã xóa xong!");
                    } else {
                        System.out.println("Vị trí không hợp lệ!");
                    }
                    break;

                case 4: 
                    System.out.print("Nhập số cần tìm: ");
                    int soTim = sc.nextInt();
                    if (dsSo.contains(soTim)) {
                        System.out.println("Số " + soTim + " có trong danh sách tại vị trí " + dsSo.indexOf(soTim));
                    } else {
                        System.out.println("Không tìm thấy số này!");
                    }
                    break;

                case 5:
                    Collections.sort(dsSo);
                    System.out.println("Đã sắp xếp tăng dần!");
                    break;

                case 6: 
                    System.out.println("Danh sách hiện tại: " + dsSo);
                    break;
            }
        } while (chon != 0);
        
        System.out.println("Tạm biệt em!");
        sc.close();
    }
}