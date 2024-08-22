/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt03;

/**
 *
 * @author ADMIN
 */
public class SinhVienIT extends SinhVien{
    public double diemJava;
    public double diemCSS;
    public double diemHtml;
    
    public SinhVienIT(String hoten,double diemJava,double diemCSS,double diemHtml){
        super(hoten,"IT");
        this.diemJava=diemJava;
        this.diemCSS=diemCSS;
        this.diemHtml=diemHtml;
    }

    @Override
    public double getDiem() {
        return (diemJava*2+diemHtml+diemCSS)/4;
    }
}
