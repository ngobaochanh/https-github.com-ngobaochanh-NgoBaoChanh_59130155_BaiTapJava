/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai3;

/**
 *
 * @author HS
 */
public class Mainbai3 {
    public static void main(String[] args) {
        SinhVienPoly svPoly = new SinhVienBiz("Tran Huu Tuan","CNTP",5,7);
        SinhVienIT svIT = new SinhVienIT( "Nguyen Van Canh","CNTT",4,8,7);
        SinhVienBiz svBiz = new SinhVienBiz("Tran Gia Huy","Ke Toan",3,9);
        
        svPoly.xuat();
        System.out.println("Diem: " + svPoly.getDiem() 
                + "\nHoc luc: " + svPoly.getHocLuc() + "\n");
        svIT.xuat();
        System.out.println("Diem: " + svIT.getDiem() 
                + "\nHoc luc: " + svIT.getHocLuc() + "\n");
        svBiz.xuat();
        System.out.println("Diem: " + svBiz.getDiem() 
                + "\nHoc luc: " + svBiz.getHocLuc() );
        
    }
    
}
