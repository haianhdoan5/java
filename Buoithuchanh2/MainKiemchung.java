/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Buoithuchanh2;

/** 
 *
 * @author admin
 */
public class MainKiemchung {
    public static void main(String[] args) {
      
        Diem diem1 = new Diem(2.0, 3.0);
        Diem diem2 = new Diem(5.0, 7.0);

        System.out.print("Diem 1: ");
        diem1.hienThiDiem();
        System.out.print("Diem 2: ");
        diem2.hienThiDiem();

        double khoangCach = diem1.tinhKhoangCach(diem2);
        System.out.println("Khoang cach giua diem 1 va 2: " + khoangCach);

        DoanThang AB = new DoanThang(diem1, diem2);
        DoanThang CD = new DoanThang(new Diem(3.0, 4.0), new Diem(6.0, 8.0));

        System.out.print("Doan thang AB: ");
        AB.hienThiDoanThang();
        System.out.print("Doan thang CD: ");
        CD.hienThiDoanThang();

        boolean songSong = AB.checkSongSong(CD);
        System.out.println("Check song song A  " + songSong);
    }
    
    
}
