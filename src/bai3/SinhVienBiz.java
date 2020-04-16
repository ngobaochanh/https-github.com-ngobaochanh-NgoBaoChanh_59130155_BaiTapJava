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
public class SinhVienBiz extends SinhVienPoly
{
    public double diemMarketing;
    public double diemSales;
    
    public SinhVienBiz(String x, String y, double z, double t) {
        super(x, y);
        this.diemMarketing = z;
        this.diemSales = t;
    }

    @Override
    public double getDiem() {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (2*this.diemMarketing + this.diemSales)/3;
    }
}
