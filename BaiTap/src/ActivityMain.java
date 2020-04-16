/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Admin
 */
public class ActivityMain {
    public static void main(String[] args) {
    // Tao thong tin 2 hs
    HocSinh hs1 = new HocSinh("CNTT3", "Hat", "Le Thanh Ha", 21, "Binh Dinh", "0123456");
    HocSinh hs2 = new HocSinh("CNTT2", "Mua", "La Thanh", 22, "Quang Nam", "123456");
    
    // Tao thong tin 2 gv
    GiaoVien gv1 = new GiaoVien("Duong Loi", "Chinh tri", "Tran Thi Tan",30 , "Nha Trang", "1224667");
    GiaoVien gv2 = new GiaoVien("Mac 2", "Chinh tri", "Tran Van Hanh",35 , "Nha Trang", "1124667");
    
//    // Them hs & gv
    LopHoc lop = new LopHoc();
    lop.themHocSinh(hs1);
    lop.themHocSinh(hs2);
    lop.themGVGD(gv1);
    lop.themGVGD(gv2);
    //In
//    lop.inDSHS();
//    lop.inDSGVGD();
    }
}

