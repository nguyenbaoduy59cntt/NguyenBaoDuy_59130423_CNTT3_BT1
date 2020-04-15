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
        
        SinhVienPoly sv1 = new SinhVienPoly("Pham Thi Yen Linh","CNTT");
        sv1.xuat();
        
        SinhVienPoly sv2 = new SinhVienIT(9,9,8.7,"Nguyen Bao Duy","CNTT");
        sv2.xuat();
        
        SinhVienPoly sv3 = new SinhVienBiz(9,10,"Tran Van Binh","CNTT");
        sv3.xuat();
    }
}
