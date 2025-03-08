/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.Buoithuchanh2;

/**
 *
 * @author admin
 */
public class hinhChuNhat {
    private Diem diemTrenTrai;
    private Diem diemDuoiPhai;

    public hinhChuNhat(Diem diemTrenTrai, Diem diemDuoiPhai) {
        if (diemTrenTrai.getHdo() >= diemDuoiPhai.getHdo() || diemTrenTrai.getTdo() <= diemDuoiPhai.getTdo()) {
            throw new IllegalArgumentException("Error!");
        }
        this.diemTrenTrai = diemTrenTrai;
        this.diemDuoiPhai = diemDuoiPhai;
    }

    public double tinhDienTich() {
        double chieuDai = Math.abs(diemDuoiPhai.getHdo() - diemTrenTrai.getHdo());
        double chieuRong = Math.abs(diemDuoiPhai.getTdo() - diemTrenTrai.getTdo());
        return chieuDai * chieuRong;
    }

    public double tinhChuVi() {
        double chieuDai = Math.abs(diemDuoiPhai.getHdo() - diemTrenTrai.getHdo());
        double chieuRong = Math.abs(diemDuoiPhai.getTdo() - diemTrenTrai.getTdo());
        return 2 * (chieuDai + chieuRong);
    }

    public void hienThiHinhChuNhat() {
        System.out.println("Toa do diem tren trai: " + "(" + diemTrenTrai.getHdo() + ", " + diemTrenTrai.getTdo() + ")");
        System.out.println("Toa do diem duoi phai: " + "(" + diemDuoiPhai.getHdo() + ", " + diemDuoiPhai.getTdo() + ")");
        System.out.println("Dien tich: " + tinhDienTich());
        System.out.println("Chu vi: " + tinhChuVi());
    }

    public static void main(String[] args) {
            Diem diemTrenTrai = new Diem(2.0, 5.0);
            Diem diemDuoiPhai = new Diem(6.0, 2.0);

            hinhChuNhat hcn = new hinhChuNhat(diemTrenTrai, diemDuoiPhai);

            hcn.hienThiHinhChuNhat();
    }
}