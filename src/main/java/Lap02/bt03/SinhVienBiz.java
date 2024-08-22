/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt03;

/**
 *
 * @author ADMIN
 */
public  class SinhVienBiz extends SinhVien {
    public double diemMaketing;
    public double diemSales;
    
    public SinhVienBiz(String hoten,double diemMaketing,double diemSales){
        super(hoten,"Biz");
        this.diemMaketing=diemMaketing;
        this.diemSales=diemSales;
    }
    @Override
    public double getDiem() {
        return(diemMaketing*2+diemSales)/3;
    }
}
