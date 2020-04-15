/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.NhanVien;
/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyen Bao Duy", 21, "Binh Dinh", 10000, 100);
        NhanVien nv2 = new NhanVien("Pham Thi Yen Linh", 20, "Quang Nam", 20000, 200);
        NhanVien nv3 = new NhanVien("Le Van Ban", 24, "Ha Noi", 10000, 120);
        NhanVien nv4 = new NhanVien("Tran Thi Thu Ha", 27, "Quang Tri", 15000, 100);
        NhanVien nv5 = new NhanVien("Giang Thu Trang", 25, "Thanh Hoa", 10000, 110);
        
        QuanLyNhanVien qlnv = new QuanLyNhanVien();
        qlnv.them(nv1);
        qlnv.them(nv2);
        qlnv.them(nv3);
        qlnv.them(nv4);
        qlnv.them(nv5);
        
        qlnv.inDS();
    }
}
