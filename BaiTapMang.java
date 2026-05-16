

import java.util.Scanner;
import java.util.Arrays;

public class BaiTapMang {
    
    
    public static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        
        
        System.out.print("Nhập số lượng phần tử N: ");
        int n = sc.nextInt();
        int[] arr = new int[n];
        
        for (int i = 0; i < n; i++) {
            System.out.print("Nhập phần tử thứ " + (i + 1) + ": ");
            arr[i] = sc.nextInt();
        }

       
        System.out.println("\n--- Toàn bộ mảng: " + Arrays.toString(arr));

        
        int tong = 0;
        for (int x : arr) tong += x;
        System.out.println("--- Tổng mảng: " + tong);

        
        System.out.print("Nhập số K cần tìm: ");
        int k = sc.nextInt();
        int demK = 0;
        for (int x : arr) if (x == k) demK++;
        System.out.println("--- Số " + k + " xuất hiện " + demK + " lần.");

        int max = arr[0], min = arr[0];
        for (int x : arr) {
            if (x > max) max = x;
            if (x < min) min = x;
        }
        System.out.println("--- Phần tử lớn nhất: " + max);
        System.out.println("--- Phần tử nhỏ nhất: " + min);

        
        System.out.print("--- Các số nguyên tố trong mảng: ");
        for (int x : arr) {
            if (isPrime(x)) System.out.print(x + " ");
        }
        System.out.println();

        
        Arrays.sort(arr);
        System.out.println("--- Mảng tăng dần: " + Arrays.toString(arr));

       
        System.out.print("--- Mảng giảm dần: ");
        for (int i = n - 1; i >= 0; i--) {
            System.out.print(arr[i] + (i == 0 ? "" : ", "));
        }
    }
}
