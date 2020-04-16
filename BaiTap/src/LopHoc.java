/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
import java.util.ArrayList;
/**
 *
 * @author Admin
 */
public class LopHoc{
    private QLDS qldsHS;
    private QLDS qldsGVGD;
    private GiaoVien giaoVienCN;
    
    ArrayList<HocSinh> hocSinh = new ArrayList<>();
    ArrayList<GiaoVien> giaoVienGD = new ArrayList<>();
    
    
    public int themHocSinh(HocSinh hs){
        qldsHS.them(hs);
        return 1;
    }
    
    public int themGVGD(GiaoVien gv){
        qldsGVGD.them(gv);
        return 1;
    }
    
    public void inDSHS(){
        qldsHS.InDS();
    }
    
    public void inDSGVGD(){
        qldsGVGD.InDS();
    }
}


    




