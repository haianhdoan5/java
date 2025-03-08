/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Buoithuchanh2;

/**
 *
 * @author admin
 */
public class HinhTron {
    private Diem tam;
    private double bk;

    public HinhTron(Diem tam, double bk) {
        this.tam = tam;
        this.bk = bk;
    }

    /**
     * @return the tam
     */
    public Diem getTam() {
        return tam;
    }

    /**
     * @param tam the tam to set
     */
    public void setTam(Diem tam) {
        this.tam = tam;
    }

    /**
     * @return the bk
     */
    public double getBk() {
        return bk;
    }

    /**
     * @param bk the bk to set
     */
    public void setBk(double bk) {
        this.bk = bk;
    }
    
    public int XDVT_Diem_Dt(Diem d){
        double x=tam.tinhKhoangCach(d);
        if(x>bk)
            return 1;
        else if(x<bk)
            return -1;
        return 0;
    }
    
    public int XDVT_Dt_Dt(HinhTron dt){
        double x=tam.tinhKhoangCach(dt.getTam());
        if(x>bk)
            return 1;
        else if(x<bk)
            return -1;
        return 0;
    }
}
