package helloword;

import java.util.Random;
import java.util.Scanner;

public class baitapvd {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Random rd = new Random();
        String answer;

        do {
            
            int soMay = rd.nextInt(101);
            int soLanDoan = 0;
            boolean win = false;
            
            System.out.println("GAME ĐOÁN SỐ (0-100)");
            System.out.println(" đã chọn 1 số, bạn  có 7 lần để đoán!");

            
            while (soLanDoan < 7) {
                soLanDoan++;
                System.out.print("Lần " + soLanDoan + ", mời bạn đoán: ");
                int soNguoi = sc.nextInt();

                if (soNguoi == soMay) {
                    System.out.println("Chúc mừng! Bạn  đoán đúng rồi! Số máy là: " + soMay);
                    win = true;
                    break; 
                } else if (soNguoi < soMay) {
                    System.out.println("Số bạn đoán nhỏ hơn số của máy.");
                } else {
                    System.out.println("Số bạn  đoán lớn hơn số của máy.");
                }
            }

          
            if (!win) {
                System.out.println("Game Over ! Số đúng là: " + soMay);
            }

            
            System.out.print("bạn có muốn chơi tiếp không? (c/k): ");
            sc.nextLine(); 
            answer = sc.nextLine();

        } while (answer.equalsIgnoreCase("c"));

        System.out.println("Cảm ơn bạn đã chơi game !");
    }
}