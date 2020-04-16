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
public class QLDS implements IQLDS{
    ArrayList<CaNhan> dsCaNhan = new ArrayList<CaNhan>();

    public QLDS(ArrayList<CaNhan> dsCaNhan){
        this.dsCaNhan = dsCaNhan;
    }

    public ArrayList getDsCaNhan() {
        return dsCaNhan;
    }

    public void setDsCaNhan(ArrayList dsCaNhan) {
        this.dsCaNhan = dsCaNhan;
    }
    
     
    @Override
    public int them(CaNhan p){
        dsCaNhan.add(p);
        return 1;
    }

    @Override
    public int xoa(String ten){
        for (int i =0; i<dsCaNhan.size(); i++)
        {
            if (dsCaNhan.get(i).getHoTen() == ten)
                dsCaNhan.remove(i);
            else
                   return 1;
        }
        return 1;
        }

    @Override
    public void InDS(){
        for (int i =0; i<dsCaNhan.size(); i++){
            dsCaNhan.get(i).HienThiTT();
        }    
    }
}