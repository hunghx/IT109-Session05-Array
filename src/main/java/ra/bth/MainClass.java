package ra.bth;

import java.util.Scanner;

public class MainClass {
    public static void main(String[] args) {
        final int MAX_STUDENTS = 100;
        int size = 0;
        String[] students = new String[MAX_STUDENTS];
        // fixx cứng data
        students[0] = "Hà Như";
        students[1] = "Văn A";
        students[2] = "Văn B";
        size = 3;

        // tạo menu thực hiện các thao tác CRUD cơ bản trên mảng 1 chiều
        // quản lý tên các học sinh trong lơp

        Scanner sc = new Scanner(System.in);
        // tạo menu thực hiên các thao tác CRUD cơ bản trên mảng 1 chiều
        // quan lý tên các học sinh trong lơp
        while (true) {
            System.out.println("+---------------------Menu---------------------+");
            System.out.println("|1. Hiển thị danh sách học sinh                |");
            System.out.println("|2. Thêm mới học sinh                          |");
            System.out.println("|3. Chỉnh sửa tên học sinh                     |");
            System.out.println("|4. Xóa học sinh                               |");
            System.out.println("|5. Thoát                                      |");
            System.out.println("+----------------------------------------------+");
            System.out.println("-->> Nhập vào lựa chọn của bạn : ");
            byte choice = Byte.parseByte(sc.nextLine());
            switch (choice) {
                case 1:
                    // hiển thị danh sách học sinh
                    showListStudent(students, size);
                    break;
                case 2:
                    // thêm mới học sinh
                    boolean isAdd = addStudent(students, size);
                    if (isAdd){
                        size++;
                    }
                    break;
                case 3:
                    // chỉnh sửa tên học sinh
                    editStudent(students, size);
                    break;
                case 4:
                    // xóa học sinh
                    boolean isDeleted =  deleteStudent(students, size);
                    if (isDeleted){
                        size--;
                    }
                    break;
                case 5:
                    // thoát
                    sc.close();
                    return;
                default:
                    System.out.println("Lựa chọn không hơp lệ! Vui lòng chọn lại.");
            }
        }

    }
    // hiển thi
    public static void showListStudent(String[] array, int size){
        if (size == 0){
            System.out.println("Danh sách học sinh trống!");
            return;
        }
        System.out.println("+---------------------Danh sách học sinh---------------------+");
        for (int i = 0; i <  size; i++) {
            System.out.printf("%d. %s\n",i+1, array[i]);
        }
        System.out.println("+------------------------------------------------------------+");
    }
    // thêm mới học sinh
    public static boolean  addStudent(String[] array, int size){
        Scanner sc = new Scanner(System.in);
        System.out.println(size);
        if (size == array.length){
            System.out.println("Danh sách học sinh đã đầy!");
            return false;
        }
        System.out.println("Nhập tên sinh viên");
        array[size] = sc.nextLine();
        System.out.println("Thêm học sinh thành công!");
        return true;
    }
    // chỉnh sửa thông tin
    public static void editStudent(String[] array,int size){
        Scanner sc = new Scanner(System.in);
        if (size == 0){
            System.out.println("Danh sách học sinh trống!");
            return;
        }
        // in ra danh sách để người dùng chọn
        showListStudent(array,size);
        System.out.println("Nhập vị trí cần chỉnh sửa");
        int indexEdit = Integer.parseInt(sc.nextLine());
        // in ra thông tin cũ
        System.out.printf("->> Bạn ang chỉnh sửa thông tin của học sinh: %s\n", array[indexEdit-1]);
        // cho phép nhập thông tin mới
        System.out.println("Nhập tên mới cho sinh viên : ");
        array[indexEdit-1] = sc.nextLine();
        System.out.println("Chỉnh sửa thông tin học sinh thành công!");
    }
    // xóa sinh viên
    public static boolean deleteStudent(String[] array, int size){
        Scanner sc = new Scanner(System.in);

        if (size == 0){
            System.out.println("Danh sách học sinh trống!");
            return false;
        }
        // in ra danh sách để người dùng chọn
        showListStudent(array,size);
        System.out.println("Nhập vị trí cần xóa");
        int indexDelete = Integer.parseInt(sc.nextLine());
        // xóa phần tử ở vị trí indexDelete - 1
        for (int i = indexDelete-1; i<size-1; i++){
            array[i]= array[i+1];
        }
        System.out.println("Xóa học sinh thành công!");
        return true;
    }


}
