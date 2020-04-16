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
public abstract class SinhVienPoly 
    {
    public String hoTen;
    public String nganhHoc;
    
    public SinhVienPoly(String a, String b)
    {
        this.hoTen = a;
        this.nganhHoc = b;
    }
    public abstract double getDiem();
    public String getHocLuc()
    {
        if(this.getDiem() < 5)
            return "Hoc luc yeu";
        else if(this.getDiem() < 6.5)
            return "Hoc luc trung binh";
        else if(this.getDiem() < 7.5)
            return "Hoc luc kha";
        else if(this.getDiem() < 9)
            return "Hoc luc gioi";
        else
            return "Hoc luc xuat sac";
    }
    
    public void xuat()
    {
        System.out.println("Ho va ten: " + this.hoTen + "\nNganh hoc: " + this.nganhHoc);
    }
}
