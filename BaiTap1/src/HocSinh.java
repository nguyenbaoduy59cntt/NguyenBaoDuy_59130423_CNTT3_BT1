/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class HocSinh extends CaNhan{
    private String lop;
    private String nangKhieu;
    
    public HocSinh(String lop, String nangKhieu, String hoTen, int tuoi, String diaChi, String sdt){
        super(hoTen, tuoi, diaChi, sdt);
        this.lop = lop;
        this.nangKhieu = nangKhieu;
    }

    public String getLop() {
        return lop;
    }

    public void setLop(String lop) {
        this.lop = lop;
    }

    public String getNangKhieu() {
        return nangKhieu;
    }

    public void setNangKhieu(String nangKhieu) {
        this.nangKhieu = nangKhieu;
    }
    
    @Override
    public void HienThiTT(){
        System.out.println("Ho va ten hs: " + hoTen + "\n" + "Tuoi: "+tuoi+"\n"+"Dia chi: "+diaChi+"\n"+ "SDT: "+sdt+"/n" + "Lop: "
                +lop +"\n" + "Nang khieu: "+nangKhieu);
 }
}