package bai1;

import java.util.Scanner;

public class MainInvoice {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- NHẬP THÔNG TIN HÓA ĐƠN ---");
        System.out.print("Nhập mã mặt hàng: ");
        String partNumber = sc.nextLine();

        System.out.print("Nhập mô tả mặt hàng: ");
        String partDescription = sc.nextLine();

        System.out.print("Nhập số lượng mua: ");
        int quantity = sc.nextInt();

        System.out.print("Nhập giá mỗi mặt hàng: ");
        double pricePerItem = sc.nextDouble();

        Invoice invoice = new Invoice(partNumber, partDescription, quantity, pricePerItem);

        System.out.println("\n--- THÔNG TIN HÓA ĐƠN ĐÃ XỬ LÝ ---");
        System.out.println("Mã mặt hàng: " + invoice.getPartNumber());
        System.out.println("Mô tả: " + invoice.getPartDescription());
        System.out.println("Số lượng: " + invoice.getQuantity());
        System.out.println("Đơn giá: " + invoice.getPricePerItem());
        System.out.println("Tổng tiền hóa đơn: " + invoice.getInvoiceAmount());

        sc.close();
    }
}