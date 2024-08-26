/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package lab2.bt05;

import java.util.Scanner;

/**
 *
 * @author admin
 */
public class Program {

    
    public static void main(String[] args) {
        TuyenSinh ts = new TuyenSinh();
        Scanner sc = new Scanner(System.in);
        int chon;

        do {
            System.out.println("========MENU========");
            System.out.println("1. Them moi thi sinh");
            System.out.println("2. Thong tin thi sinh");
            System.out.println("3. Tim kiem theo so bao danh");
            System.out.println("0. Thoat");
            System.out.print("Chon chuc nang: ");
            chon = sc.nextInt();
            sc.nextLine(); 

            switch (chon) {
                case 1:
                    themThiSinh(ts, sc);
                    break;

                case 2:
                    hienThiThongTin(ts);
                    break;

                case 3:
                    timKiemTheoSoBaoDanh(ts, sc);
                    break;

                case 0:
                    System.out.println("GoodBye.");
                    break;

                default:
                    System.out.println("Lua chon khong hop le.");
                    break;
            }
        } while (chon != 0);

        
        
    }

    private static void themThiSinh(TuyenSinh ts, Scanner sc) {
        String chon = "";
        do {
        System.out.print("Nhao so bao danh: ");
        String soBaoDanh = sc.nextLine();
        System.out.print("Nhap ho ten: ");
        String hoTen = sc.nextLine();
        System.out.print("Nhap dia chi: ");
        String diaChi = sc.nextLine();
        System.out.print("Nhap muc uu tien: ");
        String mucUuTien = sc.nextLine();
        System.out.print("Nhap khoi thi: ");
        String khoiThi = sc.nextLine();

        ts.themThiSinh(soBaoDanh, hoTen, diaChi, mucUuTien, khoiThi);
        System.out.print("Tiep tuc(Y/N): ");
            chon = sc.nextLine();
        } while (chon.equalsIgnoreCase("y"));
    }

    private static void hienThiThongTin(TuyenSinh tuyenSinh) {
        tuyenSinh.hienThiThongTin();
    }

    private static void timKiemTheoSoBaoDanh(TuyenSinh tuyenSinh, Scanner scanner) {
        System.out.print("Nhap so bao danh de tim kiem thi sinh: ");
        String soBaoDanhTimKiem = scanner.nextLine();
        ThiSinh thiSinhTimKiem = tuyenSinh.timKiemTheoSoBaoDanh(soBaoDanhTimKiem);
        if (thiSinhTimKiem != null) {
            System.out.println(thiSinhTimKiem);
        } else {
            System.out.println("So bao danh khong tim thay thi sinh nao.");
        }
    }
}
