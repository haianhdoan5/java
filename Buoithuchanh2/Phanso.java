/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Buoithuchanh2;

/**
 *
 * @author admin
 */
public class Phanso {
    private int tuSo;
    private int mauSo;

    public Phanso() {
        this.tuSo = 0;
        this.mauSo = 1;
    }
    
    public Phanso(int tuSo, int mauSo) {
        this.tuSo = tuSo;
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            throw new IllegalArgumentException("Mau phai khac 0.");
        }
    }

    public int getTuSo() {
        return tuSo;
    }

    public void setTuSo(int tuSo) {
        this.tuSo = tuSo;
    }

    public int getMauSo() {
        return mauSo;
    }

    public void setMauSo(int mauSo) {
        if (mauSo != 0) {
            this.mauSo = mauSo;
        } else {
            throw new IllegalArgumentException("Mau phai khac 0.");
        }
    }
    
    public int ucln(int x,int y){
        if(y>x){
            int temp=x;
            x=y;
            y=temp;
        }
        if(y==0)
            return x;
        return ucln(y,x%y);
    }
   
    public void rutGon(){
        int i=ucln(tuSo,mauSo);
        if(i!=1){
            tuSo/=i;
            mauSo/=i;
        }
    }
    
    public void congPS(Phanso ps2){
        tuSo=((tuSo*ps2.getMauSo())+(mauSo*ps2.getTuSo()));
        mauSo=mauSo*ps2.getMauSo();
        rutGon();
    }
    
    
    public int soSanh(Phanso ps2){
        if((tuSo*ps2.getMauSo())>(mauSo*ps2.getTuSo()))
            return 1;
        else if((tuSo*ps2.getMauSo())<(mauSo*ps2.getTuSo()))
            return -1;
        
        return 0;
    }
    
    public void display(){
        System.out.println(tuSo+"/"+mauSo);
    }
    
    public static void main(String[] args) {
        Phanso ps1 = new Phanso(-2, 3);
        Phanso ps2 = new Phanso(4, 6);

        System.out.print("Phan so 1: ");
        ps1.display();

        System.out.print("Phan so 2: ");
        ps2.display();
        
        ps1.congPS(ps2);
        System.out.print("Cong hai PS:" );
        ps1.display();
    }
        
}
