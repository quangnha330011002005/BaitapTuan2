/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt02;

/**
 *
 * @author ADMIN
 */
public class HinhTron {
    private double bankinh;
    
    public HinhTron(){
        this(1.0);
    }
    public HinhTron(double bankinh){
        this.bankinh=bankinh;
    }
    public double getBanKinh(){
        return bankinh;
    }
    public void setBanKinh(double bankinh){
        this.bankinh=bankinh;
    }
    public double tinhDienTich(){
        return Math.PI*bankinh*bankinh;
    }
    public double tinhChuVi(){
        return Math.PI*2*bankinh;
    }
}
