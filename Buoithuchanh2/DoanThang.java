/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.Buoithuchanh2;

/**
 *
 * @author admin
 */
public class DoanThang {
    private Diem A;
    private Diem B;
    
    public DoanThang( Diem x, Diem y){
        this.A=x;
        this.B=y;
    }
    
    public Diem getA(){
        return this.A;
    }

    public void setA(Diem x){
        this.A=x;
    }
    
    public Diem getB(){
        return this.B;
    }

    public void setB(Diem x){
        this.B=x;
    }
    
    public void hienThiDoanThang() {
        System.out.println("[(" + getA().getHdo() + ", " + getA().getTdo() + "),(" + getB().getHdo() + ", " + getB().getTdo() + ")]");
    }

    public double tinhDoDaiDD() {
        return A.tinhKhoangCach(B);
    }
    
    public boolean checkSongSong(DoanThang dt2){
        double v1=(A.getHdo()-B.getHdo())*(dt2.A.getTdo()-dt2.B.getTdo());
        double v2=(A.getTdo()-B.getTdo())*(dt2.A.getHdo()-dt2.B.getHdo());
        return Double.compare(v1, v2)==0;
    }
}
