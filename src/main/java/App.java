import Giangvien.GVCoHuu;
import Giangvien.GVThinhGiang;
import Giangvien.QuanLy;

import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Số giảng viên: ");
        int n = Integer.parseInt(sc.nextLine());

        QuanLy[] list = new QuanLy[n];
        for (int i=0; i<n; i++) {
            System.out.format("Giảng viên thứ %d\n",i+1);
            System.out.print("Loại giảng viên: ");
            int type =  Integer.parseInt(sc.nextLine());

            //hàm fromConsole() dùng để nhập thông tin giảng viên
            if (type == 0) {
                list[i] = new GVCoHuu();
            }
            else  {
                list[i] = new GVThinhGiang();
            }

            list[i].fromConsole(sc);
        }

        //in tất cả danh sách
        for (QuanLy gv : list) {
            System.out.println(gv);
        }

        //in 1 loại GVCoHuu
        for(QuanLy gv : list) {
            if (gv instanceof GVCoHuu) {
                System.out.println(gv);
            }
        }

        //in 1 loại GvThinhGiang
        for(QuanLy gv : list) {
            if (gv instanceof GVThinhGiang) {
                System.out.println(gv);
            }
        }

    }
}
