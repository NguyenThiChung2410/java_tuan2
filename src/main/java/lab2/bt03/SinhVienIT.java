/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt03;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien {
    public double diemJava;
    public double diemHtml;
    public double diemCss;

    public SinhVienIT(String hoTen, double diemJava, double diemHtml, double diemCss) {
        super(hoTen, "IT");
        this.diemJava = diemJava;
        this.diemHtml = diemHtml;
        this.diemCss = diemCss;
    }

    @Override
    public double getDiem() {
         return (2 * diemJava + diemHtml + diemCss) / 4;
    }
    
    
    
}
