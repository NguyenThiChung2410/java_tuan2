/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt03;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    public static void menu() {
        Scanner sc = new Scanner(System.in);
        int chon;
        do {
            System.out.println("===========CHUONG TRINH QUAN LY SINH VIEN============");
            System.out.println("1. Nhap danh sach sinh vien");
            System.out.println("2. Xuat thong tin danh sach sinh vien");
            System.out.println("3. Xuat danh sach sinh vien co hoc luc gioi");
            System.out.println("4. Sap xep danh sach sinh vien theo diem");
            System.out.println("5. Ket thuc");
            System.out.println("===================================");
            System.out.print("Chon chuc nang (0-5): ");
            chon = sc.nextInt();
            sc.nextLine();

            switch (chon) {
                case 1:
                    nhapDs();
                    break;
                case 2:
                    xuatDs();
                    break;
                case 3:
                    xuatHocLucGioi();
                    break;
                case 4:
                    sapXepTheoDiem();
                    break;
                case 5:
                    System.out.println("Goodbye !");
                    break;
                default:
                    System.out.println("Lua chon khong hop le, vui long nhap lai !!! ");
            }
        } while (chon != 5);
    }

    private static void nhapDs() {
        System.out.println("Thuc hien nhap:");

        Scanner sc = new Scanner(System.in);
        String tieptuc;

        do {
            System.out.print("Cho biet loai sinh vien (IT:1,Biz:2): ");
            int chon = Integer.parseInt(sc.nextLine());
            SinhVien sv = null;
            if (chon == 1) {

                System.out.print("Cho biet ho ten: ");
                String hoTen = sc.nextLine();
                System.out.print("Diem Java: ");
                double java = Double.parseDouble(sc.nextLine());
                System.out.print("Diem HTML: ");
                double html = Double.parseDouble(sc.nextLine());
                System.out.print("Diem CSS: ");
                double css = Double.parseDouble(sc.nextLine());

                sv = new SinhVienIT(hoTen, java, css, html);
            } else if (chon == 2) {
                System.out.print("Cho biet ho ten: ");
                String hoTen = sc.nextLine();
                System.out.print("Diem Marketing: ");
                double marketing = Double.parseDouble(sc.nextLine());
                System.out.print("Diem Sales: ");
                double sales = Double.parseDouble(sc.nextLine());

                sv = new SinhVienBiz(hoTen, marketing, sales);
            }

            if (sv != null) {
                ds.add(sv);
            }

            System.out.print("Tiep tuc (y/n)?: ");
            tieptuc = sc.nextLine();
        } while (tieptuc.equalsIgnoreCase("y"));
    }

    private static void xuatDs() {
        System.out.println("Thuc hien xuat danh sach sinh vien:");
        for (SinhVien sv : ds) {
            sv.xuat();
        }
    }

    private static void xuatHocLucGioi() {
        System.out.println("Thuc hien xuat danh sach sinh vien hoc luc gioi:");
        for (SinhVien sv : ds) {
            if (sv.getHocLuc().equals("Gioi") || sv.getHocLuc().equals("Xuat sac")) {
                sv.xuat();
            }
        }

    }

    private static void sapXepTheoDiem() {
        System.out.println("thuc hien sap xep:");
        Comparator<SinhVien> cmp = new Comparator<SinhVien>() {
            @Override
            public int compare(SinhVien sv1, SinhVien sv2) {
                return Double.compare(sv1.getDiem(), sv2.getDiem());
            }
        };
        Collections.sort(ds, cmp);
        xuatDs();
    }
}
