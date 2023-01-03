// Khởi tạo class con Manager của class Staff để hiển thị thông tin nhân viên và chức danh
import java.util.Scanner;
public class Manager extends Staff implements ICalculator {
    private String chucDanh;
    Scanner sc = new Scanner (System.in);
    Manager() {

    };
    public Manager(String ten, int maSo, double heSoLuong, int tuoi, String ngayVaoLam, String boPhan, int soNgayNghi, double soGioLamThem, double luong) {
        super(ten, maSo, heSoLuong, tuoi, ngayVaoLam, boPhan, soNgayNghi, luong);
        this.chucDanh = chucDanh;
    }
    @Override
    public void input(){
        super.input();
        System.out.print("\tNhập chức danh: ");
        chucDanh = sc.nextLine();
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
        System.out.println("Chức danh: " + chucDanh);
        System.out.printf("Lương: %.1f\n", luong);
    }
    //Phương thức tính lương
    public double calculateSalary() {
        double luongTrachNhiem = 0;
        if(chucDanh.equalsIgnoreCase("Business Leader")) {
            luongTrachNhiem = 8000000;
        } else if(chucDanh.equalsIgnoreCase("Project Leader")) {
            luongTrachNhiem = 5000000;
        } else if(chucDanh.equalsIgnoreCase("Technical Leader")) {
            luongTrachNhiem = 6000000;
        }
        double luong = super.getHeSoLuong() * 5000000 + luongTrachNhiem;
        return luong;
    }
}
