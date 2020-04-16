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
public class Mainbai2 {
    public static void main(String[] args) {
       IQuanLy qlNV = new QuanLyNhanVien();
       
       NhanVien nv01 = new NhanVien();
       nv01.setTen("Nguyen Duc Thang");
       nv01.setTuoi(20);
       nv01.setDiaChi("Ninh Hoa");
       nv01.setTienLuong(4000000);
       nv01.setTongSoGioLam(50);
       
       NhanVien nv02 = new NhanVien();
       nv02.setTen("Le Quoc Sang");
       nv02.setTuoi(21);
       nv02.setDiaChi("Ninh Diem");
       nv02.setTienLuong(2500000);
       nv02.setTongSoGioLam(150);
       
       NhanVien nv03 = new NhanVien();
       nv03.setTen("Le Anh Khoa");
       nv03.setTuoi(23);
       nv03.setDiaChi("Ninh Hai");
       nv03.setTienLuong(4500000);
       nv03.setTongSoGioLam(100);
       
       NhanVien nv04 = new NhanVien();
       nv04.setTen("Vuong Anh Xuan");
       nv04.setTuoi(17);
       nv04.setDiaChi("Ninh Thuy");
       nv04.setTienLuong(45000000);
       nv04.setTongSoGioLam(120);
       
       NhanVien nv05 = new NhanVien();
       nv05.setTen("Nguyen Thanh Vu");
       nv05.setTuoi(33);
       nv05.setDiaChi("Ninh Diem");
       nv05.setTienLuong(3700000);
       nv05.setTongSoGioLam(500);
       //Them nhan vien vao danh sach va in ra man hinh
       qlNV.them(nv01);
       qlNV.them(nv02);
       qlNV.them(nv03);
       qlNV.them(nv04);
       qlNV.them(nv05);
       qlNV.inDS();
    }
    
}
