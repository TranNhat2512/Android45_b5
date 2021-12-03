package com.android45.android45_b5;

public class Food {
    String tenSp;
    String giaTien;
    String soLuong;

    public Food(String tenSp, String giaTien, String soLuong) {
        this.tenSp = tenSp;
        this.giaTien = giaTien;
        this.soLuong = soLuong;
    }

    public String getTenSp() {
        return tenSp;
    }

    public void setTenSp(String tenSp) {
        this.tenSp = tenSp;
    }

    public String getGiaTien() {
        return giaTien;
    }

    public void setGiaTien(String giaTien) {
        this.giaTien = giaTien;
    }

    public String getSoLuong() {
        return soLuong;
    }

    public void setSoLuong(String soLuong) {
        this.soLuong = soLuong;
    }
}
