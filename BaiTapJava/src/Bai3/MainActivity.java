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
public class MainActivity {
    public static void main(String[] args) {
        
        SinhVienPoly sv1 = new SinhVienIT(10,7,9,"Pham Thi Yen Linh","CNTT");
        sv1.xuat();
        System.out.println("Điểm: "+ sv1.getDiem());
        System.out.println("Học lưc: "+ sv1.getHocLuc());
        
        SinhVienIT sv2 = new SinhVienIT(9,9,8.7,"Nguyen Bao Duy","CNTT");
        sv2.xuat();
        System.out.println("Điểm: "+ sv2.getDiem());
        System.out.println("Học lưc: "+ sv2.getHocLuc());
        
        SinhVienBiz sv3 = new SinhVienBiz(9,10,"Tran Van Binh","CNTT");
        sv3.xuat();
        System.out.println("Điểm: "+ sv3.getDiem());
        System.out.println("Học lưc: "+ sv3.getHocLuc());
    }
}
