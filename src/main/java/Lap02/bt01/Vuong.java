/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt01;

/**
 *
 * @author ADMIN
 */
public class Vuong {
    public double Canh;
    
    public Vuong(double Canh){
        this.Canh=Canh;
    }
    public double getChuvi(){
      return Canh*4;  
    }
    public double getDienTich(){
        return Canh*Canh;
    }
    public void Xuat(){
        System.out.println("HV[Canh"+Canh+"Chu Vi"+getChuvi()+"Dien Tich"+getDienTich()+"]");
    }
}
