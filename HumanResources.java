import java.util.Collections;
import java.util.Comparator;
import java.util.Scanner;
import java.util.ArrayList;

public class HumanResources {
// Phương thức main tạo danh sách NV và danh sách bộ phận(Đã add tên và mã bộ phận)
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        ArrayList<Staff> danhSachNhanVien = new ArrayList<Staff>();
        ArrayList<Department> danhSachBoPhan  = new ArrayList<Department>();
        danhSachBoPhan.add(new Department("1","Sale"));
        danhSachBoPhan.add(new Department("2","Project"));
        danhSachBoPhan.add(new Department("3","Technical"));
        int chon = 0;
        do {
            System.out.println("------------- MENU -------------");
            System.out.println(
                            "1. Thêm nhân viên mới vào công ty\n" +
                            "2. Hiển thị danh sách nhân viên hiện có trong công ty\n" +
                            "3. Hiển thị các nhân viên theo từng bộ phận\n" +
                             "4. Hiển thị các bộ phận trong công ty\n" +
                            "5. Tìm kiếm thông tin nhân viên theo tên hoặc mã nhân viên\n" +
                            "6. Hiển thị bảng lương của nhân viên toàn công ty\n" +
                            "7. Hiển thị bảng lương của nhân viên theo thứ tự");
            chon = Integer.parseInt(sc.nextLine());
            // Hiển thị thông tin nhân viên đã nhập
            if (chon == 2) {
                System.out.println("Danh sách nhân viên");
                for(int i =0; i < danhSachNhanVien.size(); i++) {
                    danhSachNhanVien.get(i).displayInformation();
                    System.out.println("------------------");
                }
                //Tính số lượng nhân viên và in ra thông tin trong danh sách bộ phận
            } else if (chon == 4) {
                for(int i = 0;i < danhSachBoPhan.size(); i++)
                {  for(int j=0;j<danhSachNhanVien.size();j++)
                {
                    if(danhSachBoPhan.get(i).getTenBoPhan().equals(danhSachNhanVien.get(j).getBoPhan())){
                        danhSachBoPhan.get(i).setSoLuongNhanVien(danhSachBoPhan.get(i).getSoLuongNhanVien()+1);
                    }
                }
                    System.out.println(danhSachBoPhan.get(i).toString());
                }
                //Hiển thị các bộ phận trong công ty
            } else if (chon == 3) {
                int count = 0;
                for(int i = 0;i < danhSachBoPhan.size(); i++)
                    for(int j=0;j<danhSachNhanVien.size();j++)
                    {
                        if(danhSachBoPhan.get(i).getTenBoPhan().equals(danhSachNhanVien.get(j).getBoPhan())){
                            System.out.println("\nNhân viên trong bộ phận: "+danhSachBoPhan.get(i).getTenBoPhan());
                            danhSachNhanVien.get(j).displayInformation();
                        }
                    }
                // Thêm nhân viên mà quản lí vào arraylist
            } else if (chon == 1) {
                System.out.println( "1. Thêm nhân viên thông thường\n" +
                                    "2. Thêm nhân viên quản lí");
                int chon1;
                chon1 = Integer.parseInt(sc.nextLine());
                if (chon1 == 1) {
                    Employee human1 = new Employee();
                    human1.input();
                    System.out.println("Nhân viên mới:");
                    human1.displayInformation();
                    danhSachNhanVien.add(human1);
                }
                if (chon1 == 2) {
                    Manager human2 = new Manager();
                    human2.input();
                    System.out.println("Quản lí mới:");
                    human2.displayInformation();
                    danhSachNhanVien.add(human2);
                }
                //Tìm kiếm theo tên và mã nhân viên
            } else if (chon == 5) {
                System.out.println( "1. Tìm kiếm theo tên nhân viên\n" +
                                    "2. Tìm kiếm theo mã nhân viên");
                int chon5;
                chon5 = Integer.parseInt(sc.nextLine());
                if (chon5 == 1) {
                    System.out.println("Nhập tên nv cần tìm: ");
                    String timTen = sc.nextLine();
                    for(int i = 0;i < danhSachNhanVien.size(); i++) {
                        if(danhSachNhanVien.get(i).getTen().equals(timTen)) {
                            danhSachNhanVien.get(i).displayInformation();
                        }
                    }
                }
                if (chon5 == 2) {
                    System.out.println("Nhập mã số nv cần tìm: ");
                    int timMaSo = sc.nextInt();
                    for(int i = 0;i < danhSachNhanVien.size(); i++) {
                        if(danhSachNhanVien.get(i).getMaSo() == timMaSo) {
                            danhSachNhanVien.get(i).displayInformation();
                        }
                    }
                }
                //Hiển thị lương của nhân viên
            } else if (chon == 6) {
                for(int i =0; i < danhSachNhanVien.size(); i++) {
                    danhSachNhanVien.get(i).displayInformation();
                    System.out.println("------------------");
                }
                //Danh sách nv có lương tăng dần và giảm dần
            } else if (chon == 7) {
                System.out.println( "1. Danh sách nv có lương tăng dần\n" +
                                    "2. Danh sách nv có lương giảm dần");
                int chon7;
                chon7 = Integer.parseInt(sc.nextLine());
                    if(chon7 == 1) {
                        System.out.println("Danh sách nv có lương tăng dần");
                        Collections.sort(danhSachNhanVien, new Comparator<Staff>() {
                            @Override
                            public int compare(Staff o1, Staff o2) {
                                return o1.getLuong() < o2.getLuong()?-1:1;
                            }
                        });
                }
                if(chon7 == 2) {
                    System.out.println("Danh sách nv có lương giảm dần");
                    Collections.sort(danhSachNhanVien, new Comparator<Staff>() {
                        @Override
                        public int compare(Staff o1, Staff o2) {
                            return o1.getLuong() >= o2.getLuong()?-1:1;
                        }
                    });
                }
                for(int i = 0;i < danhSachNhanVien.size(); i++) {
                    danhSachNhanVien.get(i).displayInformation();
                    System.out.println("------------------");
                }
            }
        } while (chon != 0);
    }
}
