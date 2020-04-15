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
public class XeNoiThanh extends ChuyenXe{
    private String soTuyen;
    private int soKm;
    
    public XeNoiThanh(String soTuyen, int soKm, String maSoChuyen, String hoTenTaiXe, String soXe, double doanhThu){
        super(maSoChuyen, hoTenTaiXe, soXe, doanhThu);
        this.soTuyen=soTuyen;
        this.soKm=soKm;
    }

    public String getSoTuyen() {
        return soTuyen;
    }

    public void setSoTuyen(String soTuyen) {
        this.soTuyen = soTuyen;
    }

    public int getSoKm() {
        return soKm;
    }

    public void setSoKm(int soKm) {
        this.soKm = soKm;
    }
}