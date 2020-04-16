/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package bai1;

/**
 *
 * @author HS
 */
public class NhanVien {
    private String ten;
    private int tuoi;
    private String diaChi;
    private double tienLuong;
    private int tongSoGioLam;
    //Cac constructor ko co tham so
    public NhanVien()
    {
        this.ten = "";
        this.tuoi = 0;
        this.diaChi = "";
        this.tienLuong = 0;
        this.tongSoGioLam = 0;
    }
     
     //Cac ham setter
    public void setTen(String ten) 
    {
        this.ten = ten;
    }
    public void setTuoi(int tuoi)
    {
        this.tuoi = tuoi;
    }
    public void setDiaChi(String diaChi)
    {
        this.diaChi = diaChi;
    }
    public void setTienLuong(double tienLuong)
    {
        this.tienLuong = tienLuong;
    }
    public void setTongSoGioLam(int tongSoGioLam)
    {
        this.tongSoGioLam = tongSoGioLam;
    }
    //Cac ham getter
    public String getTen()
    {
        return this.ten;
    }
    public int getTuoi()
    {
        return this.tuoi;
    }
    public String getDiaChi()
    {
        return this.diaChi;
    }
    public double getTienLuong()
    {
        return this.tongSoGioLam;
    }
    public int getTongSoGioLam()
    {
        return this.tongSoGioLam;
    }
    //Cac phuong thuc
    public String getThongTin()
    {
        return "Ho va ten: " + this.ten + "\nTuoi: " + this.tuoi + "\nDia chi: " 
                + this.diaChi + "\nTien luong: " + this.tienLuong + "\nTong so gio lam : "
                + this.tongSoGioLam + "\nTien Thuong: " + this.tinhThuong();
    }
    public double tinhThuong()
    {
        if(this.tongSoGioLam >= 200)
            return this.tienLuong * 0.2;
        else if(this.tongSoGioLam >= 100 &&  this.tongSoGioLam < 200)
            return this.tienLuong * 0.1;
        else
            return 0;
    } 
}
