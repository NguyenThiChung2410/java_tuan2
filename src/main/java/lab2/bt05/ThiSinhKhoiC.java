/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt05;

/**
 *
 * @author admin
 */
public class ThiSinhKhoiC extends ThiSinh {
    public ThiSinhKhoiC(String soBaoDanh, String hoTen, String diaChi, String mucUuTien) {
        super(soBaoDanh, hoTen, diaChi, mucUuTien);
    }

    @Override
    public String toString() {
        return super.toString() + ", Khoi thi: C (Van, Su, Dia)";
    }
}
