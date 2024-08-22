/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt02;

import java.util.Scanner;

/**
 *
 * @author ADMIN
 */
public class Program {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Thong tin hinh tron");
        System.out.print("Nhap ban kinh: ");
        double bankinh=sc.nextDouble();
        
        HinhTron ht=new HinhTron(bankinh);
        System.out.print("Thong tin hinh tron:");
        System.out.println("HTron [ban kinh: " + ht.getBankinh() + ", dien tich: " + ht.tinhDienTich() + ", chu vi: " + ht.tinhChuvi() + "]");
        
        System.out.println("Thong tin hinh tru");
        System.out.print("Nhap chieu cao: ");
        double chieucao=sc.nextDouble();
        
        HinhTru htru=new HinhTru(bankinh,chieucao);
        System.out.println("Thong tin hinh tru:");
        System.out.println("HTru [bankinh: " + htru.getBankinh() + ", chieu cao: " + htru.getChieucao() + ",dien tich: "  + htru.tinhDienTich() + ", the tich: " + htru.tinhThetich()+ "]");
    }
    
}
