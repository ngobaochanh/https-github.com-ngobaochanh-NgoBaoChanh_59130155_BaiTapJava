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
public class SinhVienIT extends SinhVienPoly
{
    public double diemJava;
    public double diemCss;
    public double diemHtml;
    public SinhVienIT(String x, String y, double z, double t, double e) 
    {
        super(x, y);
        this.diemJava = z;
        this.diemCss = t;
        this.diemHtml = e;
    }
    
    @Override
    public double getDiem() 
    {
        //throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        return (2*this.diemJava + this.diemCss + this.diemHtml)/4;
    }
    
}
