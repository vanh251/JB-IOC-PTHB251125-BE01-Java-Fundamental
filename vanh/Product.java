package vanh;

public class Product{
    String maSp, tenSp, moTa;
    int tonKho;
    float gia;
    TrangThai trangThai;

    public Product(String maSp, String tenSp, String moTa, int tonKho, float gia, TrangThai trangThai) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.tonKho = tonKho;
        this.gia = gia;
        this.trangThai = trangThai;
    }

    public void displayInfo(){
        System.out.printf("%s, %s, %s, %d, %.1f, %s", maSp, tenSp, moTa, tonKho, gia, trangThai);
    }

    public void inputData(String maSp, String tenSp, String moTa, int tonKho, float gia, TrangThai trangThai) {
        this.maSp = maSp;
        this.tenSp = tenSp;
        this.moTa = moTa;
        this.tonKho = tonKho;
        this.gia = gia;
        this.trangThai = trangThai;
    }
}
