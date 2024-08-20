/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt01;

/**
 *
 * @author ADMIN
 */
public class ChuNhat {
    public double dai;
    public double rong;
    
    public ChuNhat(double dai,double rong){
   
        this.dai=dai;
        this.rong=rong;
}
        public double getChuVi(){   
            return(dai+rong)*2;
        }
        public double getDienTich(){
            return dai*rong;
        }
        public void Xuat(){
            System.out.println("HCN[dai"+dai+"rong"+rong+"dien tich"+getDienTich()+"Chu vi"+getChuVi());
        }
}
