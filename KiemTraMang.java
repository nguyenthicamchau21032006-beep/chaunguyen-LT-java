
public class KiemTraMang {

    
    public static boolean laSoNguyenTo(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= Math.sqrt(n); i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    public static void main(String[] args) {
        // Mảng dữ liệu từ đề bài
        int[] M = {3, 6, 7, 8, 11, 17, 2, 90, 2, 5, 4, 5, 8};
        
        int soLe = 0;
        int soChan = 0;

        System.out.print("Dòng 1 (Số lẻ): ");
        for (int x : M) {
            if (x % 2 != 0) {
                System.out.print(x + " ");
                soLe++;
            }
        }
        System.out.println("-> Tổng cộng có " + soLe + " số lẻ.");

        System.out.print("Dòng 2 (Số chẵn): ");
        for (int x : M) {
            if (x % 2 == 0) {
                System.out.print(x + " ");
                soChan++;
            }
        }
        System.out.println("-> Tổng cộng có " + soChan + " số chẵn.");

       
        System.out.print("Dòng 3 (Số nguyên tố): ");
        for (int x : M) {
            if (laSoNguyenTo(x)) System.out.print(x + " ");
        }
        System.out.println();

        System.out.print("Dòng 4 (Không phải số nguyên tố): ");
        for (int x : M) {
            if (!laSoNguyenTo(x)) System.out.print(x + " ");
        }
        System.out.println();
    }
}
