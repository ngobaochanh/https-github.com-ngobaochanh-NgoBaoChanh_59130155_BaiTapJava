/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai2;

/**
 *
 * @author HS
 */

import bai1.NhanVien;
import java.util.ArrayList;

public class QuanLyNhanVien implements IQuanLy{
    ArrayList<NhanVien> dsNV = new ArrayList<>();

    @Override
    public void them(NhanVien nv) {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        dsNV.add(nv);
    }

    @Override
    public void inDS() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        for(int i=0; i< dsNV.size(); i++)
            System.out.println("Nhan vien thu " + (i+1) + ": \n" 
                    + dsNV.get(i).getThongTin() + "\n");
    }
    
    
}
