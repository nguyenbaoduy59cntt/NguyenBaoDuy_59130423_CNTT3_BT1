/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class GiaoVien extends CaNhan{
    private String monDay;
    private String toBoMon;
    
    public GiaoVien(String monDay, String toBoMon, String hoTen, int tuoi, String diaChi, String sdt ){
        super(hoTen, tuoi, diaChi, sdt);
        this.monDay=monDay;
        this.toBoMon=toBoMon;
    }

    public String getMonDay() {
        return monDay;
    }

    public void setMonDay(String monDay) {
        this.monDay = monDay;
    }

    public String getToBoMon() {
        return toBoMon;
    }

    public void setToBoMon(String toBoMon) {
        this.toBoMon = toBoMon;
    }
    
    public void HienThiTT(){
        System.out.println("Ho va ten gv: " + hoTen + "\n" + "Tuoi: "+tuoi+"\n"+"Dia chi: "+diaChi+"\n"+ "SDT: "+sdt+"/n" + "Mon day: "
                +monDay +"\n" + "To bo mon: "+toBoMon);
    }
}

