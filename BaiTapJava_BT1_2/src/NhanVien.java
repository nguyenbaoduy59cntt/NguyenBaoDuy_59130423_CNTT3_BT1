/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;

    // Constructor không tham số
    public NhanVien(){
        ten= "Nguyễn Bảo Duy";
        tuoi= 21;
        diaChi= "Bình Định";
        tienLuong= 2000;
        tongSoGioLam= 100;
    }
    // Constructor có tham số
    public NhanVien(String ten, int tuoi, String diaChi, double tienLuong, int tongSoGioLam){
        this.ten = ten;
        this.tuoi = tuoi;
        this.diaChi = diaChi;
        this.tienLuong = tienLuong;
        this.tongSoGioLam = tongSoGioLam;
    }
    
    //  get/set
    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getTuoi() {
        return tuoi;
    }

    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }

    public String getDiaChi() {
        return diaChi;
    }

    public void setDiaChi(String diaChi) {
        this.diaChi = diaChi;
    }

    public double getTienLuong() {
        return tienLuong;
    }

    public void setTienLuong(double tienLuong) {
        this.tienLuong = tienLuong;
    }

    public int getTongSoGioLam() {
        return tongSoGioLam;
    }

    public void setTongSoGioLam(int tongSoGioLam) {
        this.tongSoGioLam = tongSoGioLam;
    }
    
    // Thưởng
    
     public double tinhThuong() {
        if (tongSoGioLam >= 200)
            return (tienLuong*20)/100;
        else
        {
            if (tongSoGioLam <200 && tongSoGioLam >=100 )
                    return (tienLuong*10)/100;
            else
                    return 0;
        }
    }
    
    // Trả về thông tin của nhân viên
    public String getThongTin() {
        return "Tên nv: " + ten + "\n" + "Tuổi: " + tuoi +"\n"+ "Địa chỉ: " + diaChi + "\n" + "Tiền lương: " + tienLuong + "\n" +
               "Tổng số giờ làm: " + tongSoGioLam + "\n" + "Tien Thuong: " + tinhThuong();
    }
}
