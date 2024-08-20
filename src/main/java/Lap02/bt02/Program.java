/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt02;

/**
 *
 * @author ADMIN
 */
public class Program {

    public static void main(String[] args) {
        HinhTron c1 = new HinhTron(5.0);
        System.out.println("Hinh Tron[ban kinh " + c1.getBanKinh() + " Dien Tich " + c1.tinhDienTich() + " Chu Vi " + c1.tinhChuVi());

        HinhTru c2 = new HinhTru(5.0, 4.0);
        System.out.println("Hinh Tru [ban kinh " + c2.getBanKinh() + " chieu cao " + c2.getChieuCao() +
                " Dien Tich " + c2.tinhDienTich() + " Chu Vi" + c2.tinhChuVi());
    }
}
