/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai4;

/**
 *
 * @author Admin
 */
public class ChuyenXe {
    private String maSoChuyen;
    private String hoTenTaiXe;
    private String soXe;
    private double doanhThu;
    
    
    public ChuyenXe(String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu){
        this.maSoChuyen=maSoChuyen;
        this.hoTenTaiXe=hoTenTaiXe;
        this.soXe=soXe;
        this.doanhThu=doanhThu;
    }

    public String getMaSoChuyen() {
        return maSoChuyen;
    }

    public void setMaSoChuyen(String maSoChuyen) {
        this.maSoChuyen = maSoChuyen;
    }

    public String getHoTenTaiXe() {
        return hoTenTaiXe;
    }

    public void setHoTenTaiXe(String hoTenTaiXe) {
        this.hoTenTaiXe = hoTenTaiXe;
    }

    public String getSoXe() {
        return soXe;
    }

    public void setSoXe(String soXe) {
        this.soXe = soXe;
    }

    public double getDoanhThu() {
        return doanhThu;
    }

    public void setDoanhThu(double doanhThu) {
        this.doanhThu = doanhThu;
    }
}
