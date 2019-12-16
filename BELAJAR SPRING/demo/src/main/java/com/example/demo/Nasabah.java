package com.example.demo;

public class Nasabah {
    private String nama;
    private String alamat;
    private String password;
    private Integer umur;
    private String token;
    private Double saldo= 0.0;
    private Boolean aktif= Boolean.FALSE;

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getAlamat() {
        return alamat;
    }

    public void setAlamat(String alamat) {
        this.alamat = alamat;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Integer getUmur() {
        return umur;
    }

    public void setUmur(Integer umur) {
        this.umur = umur;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void setSaldo(Double saldo) {
        this.saldo = saldo;
    }

    public Boolean getAktif() {
        return aktif;
    }

    public void setAktif(Boolean aktif) {
        this.aktif = aktif;
    }
    public  void resetPassword(){
        this.password ="123456789";
    }
    public void promo() {
        this.saldo = 100000.0 + getSaldo();
    }
}

