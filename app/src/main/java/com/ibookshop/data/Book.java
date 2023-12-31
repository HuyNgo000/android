package com.ibookshop.data;

import java.io.Serializable;

public class Book implements Serializable {
    private String TenSach;
    private String TenTacGia;
    private int Hinh;
    private int SoTrang;
    private String ngayPhatHanh;
    private int phantramDoc;
    private String Mota;
    private String TheLoai;
    private String Ngonngu;

    public Book(String tenSach, String tenTacGia, int hinh) {
        TenSach = tenSach;
        TenTacGia = tenTacGia;
        Hinh = hinh;
    }
    public Book(String tenSach, String tenTacGia, int hinh, int soTrang, String ngayPhatHanh, int phantramDoc) {
        TenSach = tenSach;
        TenTacGia = tenTacGia;
        Hinh = hinh;
        SoTrang = soTrang;
        this.ngayPhatHanh = ngayPhatHanh;
        this.phantramDoc = phantramDoc;
    }

    public int getSoTrang() {
        return SoTrang;
    }

    public void setSoTrang(int soTrang) {
        SoTrang = soTrang;
    }

    public String getNgayPhatHanh() {
        return ngayPhatHanh;
    }

    public void setNgayPhatHanh(String ngayPhatHanh) {
        this.ngayPhatHanh = ngayPhatHanh;
    }

    public int getPhantramDoc() {
        return phantramDoc;
    }

    public void setPhantramDoc(int phantramDoc) {
        this.phantramDoc = phantramDoc;
    }

    public String getTenSach() {
        return TenSach;
    }

    public void setTenSach(String tenSach) {
        TenSach = tenSach;
    }

    public String getTenTacGia() {
        return TenTacGia;
    }

    public void setTenTacGia(String tenTacGia) {
        TenTacGia = tenTacGia;
    }

    public int getHinh() {
        return Hinh;
    }

    public void setHinh(int hinh) {
        Hinh = hinh;
    }
}
