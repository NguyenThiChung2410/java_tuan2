/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt05;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author admin
 */
public class TuyenSinh {
    private List<ThiSinh> ds;

    public TuyenSinh() {
        ds = new ArrayList<>();
    }

    public void themThiSinh(String soBaoDanh, String hoTen, String diaChi, String mucUuTien, String khoiThi) {
        ThiSinh thiSinh = null;
        switch (khoiThi) {
            case "A":
                thiSinh = new ThiSinhKhoiA(soBaoDanh, hoTen, diaChi, mucUuTien);
                break;
            case "B":
                thiSinh = new ThiSinhKhoiB(soBaoDanh, hoTen, diaChi, mucUuTien);
                break;
            case "C":
                thiSinh = new ThiSinhKhoiC(soBaoDanh, hoTen, diaChi, mucUuTien);
                break;
            default:
                System.out.println("Khoi thi khong hop le.");
                return;
        }
        ds.add(thiSinh);
        System.out.println("Da them thi sinh thanh cong.");
    }

    public void hienThiThongTin() {
        if (ds.isEmpty()) {
            System.out.println("Danh sach thi sinh trong.");
            return;
        }
        for (ThiSinh thiSinh : ds) {
            System.out.println(thiSinh);
        }
    }

    public ThiSinh timKiemTheoSoBaoDanh(String soBaoDanh) {
        for (ThiSinh thiSinh : ds) {
            if (thiSinh.getSoBaoDanh().equals(soBaoDanh)) {
                return thiSinh;
            }
        }
        return null;
    }
}
