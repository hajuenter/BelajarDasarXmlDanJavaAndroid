package com.example.belajardasarxml;

public class Mahasiswa {
    private String nim;
    private String nama;
    private String jenis_kealamin;

    public Mahasiswa(String nim, String nama, String jenis_kealamin) {
        this.nim = nim;
        this.nama = nama;
        this.jenis_kealamin = jenis_kealamin;
    }

    public String getNim() {
        return nim;
    }

    public void setNim(String nim) {
        this.nim = nim;
    }

    public String getNama() {
        return nama;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public String getJenis_kealamin() {
        return jenis_kealamin;
    }

    public void setJenis_kealamin(String jenis_kealamin) {
        this.jenis_kealamin = jenis_kealamin;
    }
}
