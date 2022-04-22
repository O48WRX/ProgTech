package com.O48WRX.SasElsoFeladat;

public class Sas {

    private int szárnyFeszTáv;
    private int súly;
    private int kor;

    public int getSzárnyFeszTáv() {
        return szárnyFeszTáv;
    }

    public void setSzárnyFeszTáv(int szárnyFeszTáv) {
        this.szárnyFeszTáv = szárnyFeszTáv;
    }

    public int getSúly() {
        return súly;
    }

    public void setSúly(int súly) {
        this.súly = súly;
    }

    public int getKor() {
        return kor;
    }

    public void setKor(int kor) {
        this.kor = kor;
    }

    @Override
    public String toString() {
        return "Sas{" +
                "szárnyFeszTáv=" + szárnyFeszTáv +
                ", súly=" + súly +
                ", kor=" + kor +
                '}';
    }

    public Sas(int szárnyFeszTáv, int súly, int kor) {
        this.szárnyFeszTáv = szárnyFeszTáv;
        this.súly = súly;
        this.kor = kor;
    }
}
