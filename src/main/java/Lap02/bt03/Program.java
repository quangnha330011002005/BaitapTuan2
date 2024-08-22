/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Lap02.bt03;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 *
 * @author ADMIN
 */
public class Program {
    
   //Khai bao ds kieu ArrayList<SinhVien> de luu tru

    static ArrayList<SinhVien> ds = new ArrayList<>();

    public static void main(String[] args) {
        menu();
    }

    private static void menu() {
        int chon = 5;
        Scanner sc = new Scanner(System.in);
       
        System.out.println("============Quan Ly Sinh Vien==========");
        System.out.println("1:Nhap danh sach cac sinh vien: ");
        System.out.println("2:Xuat danh sach cac sinh vien: ");
        System.out.println("3:Xuat danh sach cac sinh vien hoc luc gioi: ");
        System.out.println("4:Sap xep danh sach cac sinh vien: ");
        System.out.println("5: ket thuc!");
        System.out.println("!@#$%^&^*__*&^^^%$#$@");
        System.out.println("bam chon (1-->5::)");

        chon = sc.nextInt();
        switch (chon) {
            case 1:
                NhapDs();
                break;
            case 2:
                XuatDs();
                break;
            case 3:
                XuatSvGioi();
            case 4:
                SapXep();
            case 5:
                System.out.println("Thoat CTrinh! ");
                break;
        }
        while (chon != 5) {
           
        }
    }
    private static void NhapDs() {
        String tieptuc="y";
        do{
            SinhVien sv=null;
            Scanner sc1=new Scanner(System.in);//Nhap so
            Scanner sc2=new Scanner(System.in);//Nhap chuoi
            
            System.out.println("Thuc hien nhap danh sach sinh vien:");
            int chon=0;
            
            System.out.println("Cho biet loai sinh vien (1:IT;2:BIZ)");
            chon=sc1.nextInt();
            if(chon==1){
                //Nhap Thong tin sinh vien IT
                System.out.println("Ho Ten:");
                String hoten=sc2.nextLine();
                System.out.println("DiemJava:");
                Double DiemJava=sc1.nextDouble();
                System.out.println("DiemCss:");
                Double DiemCss=sc1.nextDouble();
                System.out.println("DiemHTML:");
                Double DiemHtml=sc1.nextDouble();
                //Tao doi tuong kieu sinh vien IT
                sv=new SinhVienIT(hoten, 0, 0, 0);
            }else if(chon==2){
               //Nhap Thong tin sinh vien Biz
                System.out.println("Ho Ten:");
                String hoten=sc2.nextLine();
                System.out.println("DiemMaketing:");
                Double DiemMaketing=sc1.nextDouble();
                System.out.println("DiemSales:");
                Double DiemSales=sc1.nextDouble();
                //Tao doi tuong kieu Sinh vien Biz
                sv=new SinhVienBiz(hoten, 0, 0);
            }
            if(sv!=null){
                ds.add(sv);
            }
            System.out.println("Co muon tiep tuc?(y/n)");
            tieptuc=sc2.nextLine();
        }while(tieptuc.equalsIgnoreCase("y"));
    }

    private static void XuatDs() {
        System.out.println("Thuc hien xuat danh sach sinh vien");
        for(SinhVien sv:ds){
            sv.Xuat();
        }
    }

    private static void XuatSvGioi() {
        System.out.print("Danh Sach cac Sinh Vien Gioi:");
        for(SinhVien sv:ds){
            if (sv.getDiem()<0&&sv.getDiem()>=7.5){
                sv.Xuat();
            }
        }
    }

    private static void SapXep() {
      //Tao tieu chi sap sinh vien theo dtb
       Comparator<SinhVien>cmp=new Comparator<SinhVien>(){
           @Override
           public int compare(SinhVien sv1,SinhVien sv2){
               return Double.valueOf(sv1.getDiem()).compareTo(sv2.getDiem());
           }
       };
       Collections.sort(ds,cmp);
    }

    }

