import java.util.Scanner;

//Khởi tại class Department để hiển thị bộ phận
public class Department {
    private String maBoPhan;
    private String tenBoPhan;
    private int soLuongNhanVien;
    Scanner sc = new Scanner(System.in);
    public Department(String maBoPhan, String tenBoPhan) {
        this.maBoPhan = maBoPhan;
        this.tenBoPhan = tenBoPhan;
    }
    public String getMaBoPhan() {
        return maBoPhan;
    }
    public void setMaBoPhan(String maBoPhan) {
        this.maBoPhan = maBoPhan;
    }
    public String getTenBoPhan() {
        return tenBoPhan;
    }
    public void setTenBoPhan(String tenBoPhan) {
        this.tenBoPhan = tenBoPhan;
    }

    public int getSoLuongNhanVien() {
        return soLuongNhanVien;
    }
    public void setSoLuongNhanVien(int soLuongNhanVien) {
        this.soLuongNhanVien = soLuongNhanVien;
    }
    public void input() {
        System.out.print("Nhập mã bộ phận(1/ 2 /3): ") ;
        maBoPhan = sc.nextLine();
        System.out.print("Nhập tên bộ phận(Sale/ Project / Technical: ");
        tenBoPhan = sc.nextLine();
    }
    //Phương thức hiển thị bộ phận
    @Override
    public String toString() {
        return
                "Mã bộ phận: " + maBoPhan +
                        ", Tên bộ phận: " + tenBoPhan +
                        ", Số lượng nhân viên: " + soLuongNhanVien;
    }
}
