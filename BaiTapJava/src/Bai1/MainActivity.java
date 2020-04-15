/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Bai1;

/**
 *
 * @author Admin
 */
public class MainActivity {
    public static void main(String[] args) {
        NhanVien nv1 = new NhanVien("Nguyen Bao Duy", 21, "Binh Dinh", 2000, 100);
        NhanVien nv2 = new NhanVien("Pham Thi Yen Linh", 21, "Quang Nam", 2000, 200);
        System.out.println(nv1.getThongTin());
        System.out.println(nv2.getThongTin());
    }
}
