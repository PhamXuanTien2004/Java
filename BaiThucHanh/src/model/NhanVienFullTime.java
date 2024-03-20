package model;

public class NhanVienFullTime extends NhanVien{
    private int ngayLamThem;
    private int loaiChucVu;
    public NhanVienFullTime(String ten){
        this.ten=ten;
    }
    public NhanVienFullTime(String ten, int ngayLamThem){
        this.ten=ten;
        
    }
    public void setLoaiChucVu(int loaiChucVu){
        
    }
    public String loaiNhanVien()
    {
        return "Nhan Vien Full Time";
    }
    public void tinhLuong(){}
}
