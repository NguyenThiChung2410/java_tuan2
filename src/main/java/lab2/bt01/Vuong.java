/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt01;

/**
 *
 * @author ADMIN
 */
public class Vuong extends ChuNhat {

    public Vuong(double canh) {
        super(canh, canh);
    }

    @Override
    public void xuat() {
        System.out.println("HV [canh:" + super.dai + ", chu vi: " + super.getChuvi() + ", dien tich: " + super.getDientich() + "]");
    }

}
