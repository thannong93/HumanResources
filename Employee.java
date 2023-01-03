// Khởi tạo class con Employee của class Staff để hiển thị thông tin nhân viên và tính lương
import java.util.Scanner;

public class Employee extends Staff {
    private double soGioLamThem;
    Scanner sc = new Scanner (System.in);
    Employee() {

    };
    public Employee(String ten, int maSo, double heSoLuong, int tuoi, String ngayVaoLam, String boPhan, int soNgayNghi, double soGioLamThem, double luong) {
        super(ten, maSo, heSoLuong, tuoi, ngayVaoLam, boPhan, soNgayNghi, luong);
        this.soGioLamThem = soGioLamThem;
    }
    @Override
    public void input(){
        super.input();
        System.out.print("\tNhập số giờ làm thêm: ");
        soGioLamThem = sc.nextInt();
        luong = calculateSalary();
    }
    //Phương thức hiển thị thông tin nhân viên
    @Override
    public void displayInformation() {
        System.out.println("Tên nhân viên: " + super.getTen());
        System.out.println("Mã số nhân viên: " + super.getMaSo());
        System.out.println("Hệ số lương: " + super.getHeSoLuong());
        System.out.println("Tuổi: " + super.getTuoi());
        System.out.println("Ngày vào làm: " + super.getNgayVaoLam());
        System.out.println("Bộ phận làm việc: " + super.getBoPhan());
        System.out.println("Số ngày nghỉ: " + super.getSoNgayNghi());
        System.out.println("Số giờ làm thêm: " + soGioLamThem);
        System.out.printf("Lương: %.1f\n", luong);
    }
    //Phương thức tính lương
    public double calculateSalary() {
        double luong = super.getHeSoLuong() * 3000000 + soGioLamThem * 200000;
        return luong;
    }
}
