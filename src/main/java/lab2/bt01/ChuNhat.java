/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt01;

/**
 *
 * @author ADMIN
 */
public class ChuNhat {

    public double dai;
    public double rong;

    public ChuNhat(double dai, double rong) {
        this.dai = dai;
        this.rong = rong;
    }

    public double getChuvi() {
        return (dai + rong) * 2;
    }

    public double getDientich() {
        return dai * rong;
    }

    public void xuat() {
        System.out.println("HCN [dai: " + dai + ", rong: " + rong + ", chu vi: " + getChuvi() + ", dien tich " + getDientich() + "]");
    }

}
