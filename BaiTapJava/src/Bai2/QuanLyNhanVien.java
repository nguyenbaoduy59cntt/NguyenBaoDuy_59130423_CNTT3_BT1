/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai2;

import Bai1.NhanVien;
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> DSNV = new ArrayList<NhanVien>();
    
    @Override
    public void them(NhanVien nv) {
        DSNV.add(nv);
    }

    @Override
    public void inDS(){
         for (int i = 0; i <=5; i++) {
             System.out.println("Danh Sach Nhan Vien");
            System.out.println((i+1) + ":");
            System.out.println(DSNV.get(i).getThongTin());
        }
    }
}
