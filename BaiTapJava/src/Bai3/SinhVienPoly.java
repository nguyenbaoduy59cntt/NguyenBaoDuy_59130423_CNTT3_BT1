/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai3;

/**
 *
 * @author Admin
 */
public abstract class SinhVienPoly {
    private String hoTen;
    private String nganh;
    
    public SinhVienPoly(String hoTen, String nganh){
        this.hoTen=hoTen;
        this.nganh=nganh;
    }
    
    public String getHoTen() {
        return hoTen;
    }

    public void setHoTen(String hoTen) {
        this.hoTen = hoTen;
    }

    public String getNganh() {
        return nganh;
    }

    public void setNganh(String nganh) {
        this.nganh = nganh;
    }
    
    public abstract double getDiem();
    
    public String getHocLuc() {
        if (getDiem() < 5)
            return "Yếu";
        else if(5 <= getDiem() && getDiem() < 6.5) 
            return "Trung bình";
        else if (6.5 <= getDiem() && getDiem() < 7.5) 
            return "Khá";
        else if (7.5 <= getDiem() && getDiem() < 9) 
            return "Giỏi";
        return "Xuất sắc";	
    }
    
    public void xuat(){
        System.out.println("Ho ten SV: " + hoTen + "\n"+ "Nganh: " + nganh);
    }
    
    
    
}
