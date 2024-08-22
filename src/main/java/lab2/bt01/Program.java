/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt01;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Thong tin hinh chu nhat");
        System.out.print("Nhap dai: ");
        double dai = sc.nextDouble();
        System.out.print("Nhap rong: ");
        double rong = sc.nextDouble();

        ChuNhat cn = new ChuNhat(dai, rong);
        System.out.println("Ket qua: ");
        cn.xuat();

        System.out.println("Thong tin hinh vuong");
        System.out.print("Nhap canh: ");
        double canh = sc.nextDouble();

        Vuong hv = new Vuong(canh);
        System.out.println("Ket qua: ");
        hv.xuat();
    }
}
