/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt02;

/**
 *
 * @author ADMIN
 */
public class HinhTru extends HinhTron{
    private double chieucao;
    
    public HinhTru(){
        super(1.0);
        chieucao=1.0;
    }
    public HinhTru(double bankinh,double chieucao){
        super(bankinh);
        this.chieucao=chieucao;
    }
    public double getChieuCao(){
        return chieucao;
    }
    public void setChieuCao(double chieucao){
        this.chieucao=chieucao;
    }
    public double tinhTheTich(){
        return super.tinhDienTich()*chieucao;
    }

    @Override
    public double tinhDienTich() {
        double s_day=super.tinhDienTich();
        double s_xq=super.tinhChuVi()*chieucao;
        return 2*s_day+s_xq;
    }
    
    
}
