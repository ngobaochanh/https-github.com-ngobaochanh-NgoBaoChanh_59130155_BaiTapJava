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
public class Mainbai1 {
    public static void main(String[] args) {
        NhanVien nv01 = new NhanVien();
        NhanVien nv02 = new NhanVien();
        nv02.setTen("Ngo Bao Chanh");
        nv02.setTuoi(58);
        nv02.setDiaChi("Ninh diem");
        nv02.setTienLuong(300000);
        nv02.setTongSoGioLam(200);
        System.out.println(nv01.getThongTin());
        System.out.println(nv02.getThongTin());
    }
    
}
