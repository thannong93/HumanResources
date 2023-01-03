// Khởi tạo class Staff là class cha để input và xuất ra thông tin nhân viên
import java.util.Scanner;
abstract class Staff {
    String ten;
    int maSo;
    double heSoLuong;
    int tuoi;
    String ngayVaoLam;
    String boPhan;
    int soNgayNghi;
    double luong;
    Scanner sc=new Scanner (System.in);
    Staff() {

    };
    public Staff(String ten, int maSo, double heSoLuong, int tuoi, String ngayVaoLam, String boPhan, int soNgayNghi, double luong) {
        this.ten = ten;
        this.maSo = maSo;
        this.heSoLuong = heSoLuong;
        this.tuoi = tuoi;
        this.ngayVaoLam = ngayVaoLam;
        this.boPhan = boPhan;
        this.soNgayNghi = soNgayNghi;
        this.luong = luong;
    }
    public void input(){
        System.out.print("\tNhập mã nhân viên: ");
        maSo = Integer.parseInt(sc.nextLine());
        System.out.print("\tNhập tên nhân viên: ");
        ten = sc.nextLine();
        System.out.print("\tNhập tuổi nhân viên: ");
        tuoi = Integer.parseInt(sc.nextLine());
        System.out.print("\tNhập hệ số lương (từ 1 - 5 ): ");
        heSoLuong = Double.parseDouble(sc.nextLine());
        System.out.print("\tNhập ngày vào làm (format : ddmmyy): ");
        ngayVaoLam = sc.nextLine();
        System.out.print("\tNhập bộ phận làm việc(Sale/ Project / Technical): ");
        boPhan = sc.nextLine();
        System.out.print("\tNhập số ngày nghỉ: ");
        soNgayNghi = Integer.parseInt(sc.nextLine());
    }
    public abstract void displayInformation();
    public String getTen(){
        return ten;
    }
    public void setTen(String ten) {
        this.ten = ten;
    }
    public int getMaSo(){
        return maSo;
    }
    public void setMaSo(int maSo) {
        this.maSo = maSo;
    }
    public double getHeSoLuong(){
        return heSoLuong;
    }
    public void setHeSoLuong(double heSoLuong) {
        this.heSoLuong = heSoLuong;
    }
    public int getTuoi(){
        return tuoi;
    }
    public void setTuoi(int tuoi) {
        this.tuoi = tuoi;
    }
    public String getNgayVaoLam(){
        return ngayVaoLam;
    }
    public void setNgayVaoLam(String ngayVaoLam) {
        this.ngayVaoLam = ngayVaoLam;
    }
    public String getBoPhan() {
        return boPhan;
    }
    public void setBoPhan(String boPhan) {
        this.boPhan = boPhan;
    }
    public int getSoNgayNghi(){
        return soNgayNghi;
    }
    public void setSoNgayNghi(int soNgayNghi) {
        this.soNgayNghi = soNgayNghi;
    }
    public double getLuong(){
        return luong;
    }
    public void setLuong(Double luong) {
        this.luong = luong;
    }
}
