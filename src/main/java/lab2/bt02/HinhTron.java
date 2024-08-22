/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt02;

/**
 *
 * @author ADMIN
 */
public class HinhTron {
    private double bankinh;

    public HinhTron() {
    }

    public HinhTron(double bankinh) {
        this.bankinh = bankinh;
    }

    public double getBankinh() {
        return bankinh;
    }

    public void setBankinh(double bankinh) {
        this.bankinh = bankinh;
    }
    
    public double tinhDienTich(){
        return Math.PI * bankinh * bankinh;
    }
    public double tinhChuvi(){
        return  2 * Math.PI * bankinh;
    }
}
