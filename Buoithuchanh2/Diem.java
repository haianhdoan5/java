/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Buoithuchanh2;

/**
 *
 * @author admin
 */
public class Diem {
    private double Hdo;
    private double Tdo;
    
    public Diem( double x, double y){
        this.Hdo=x;
        this.Tdo=y;
    }
    
    public double getHdo(){
        return this.Hdo;
    }

    public void setHdo(double x){
        this.Hdo=x;
    }
    
    public double getTdo(){
        return this.Tdo;
    }

    public void setTdo(double x){
        this.Tdo=x;
    }
    
    public void hienThiDiem() {
        System.out.println("(" + Hdo + ", " + Tdo + ")");
    }

    public double tinhKhoangCach(Diem Dkhac) {
        return Math.sqrt(Math.pow((Hdo - Dkhac.getHdo()), 2) + Math.pow((Tdo - Dkhac.getTdo()), 2));
    }
    
}
