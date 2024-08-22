/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package lab2.bt02;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron {

    private double chieucao;

    public HinhTru() {
        super();
        this.chieucao = 0.0;
    }

    public HinhTru(double bankinh, double chieucao) {
        super(bankinh);
        this.chieucao = chieucao;
    }

    public double getChieucao() {
        return chieucao;
    }

    public void setChieucao(double chieucao) {
        this.chieucao = chieucao;
    }

    public double tinhThetich() {
        return super.tinhDienTich() * chieucao;
    }

    @Override
    public double tinhDienTich() {
        double s_day = super.tinhDienTich();
        double s_xq = super.tinhChuvi() * chieucao;
        return 2 * s_day + s_xq;
    }

}
