package Giangvien;

import java.util.Scanner;

public class GVThinhGiang extends QuanLy {
    private String noilamviec;

    public GVThinhGiang() {
    }

    public GVThinhGiang(String tengiangvien, String email, String diachi, String sodienthoai, int sogioday, String noilamviec) {
        super(tengiangvien, email, diachi, sodienthoai, sogioday);
        this.noilamviec = noilamviec;
    }

    public String getNoilamviec() {
        return noilamviec;
    }

    public void setNoilamviec(String noilamviec) {
        this.noilamviec = noilamviec;
    }


    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GVThinhGiang{");

        sb.append("tengiangvien: '").append(tengiangvien).append('\'');
        sb.append(", email: '").append(email).append('\'');
        sb.append(", diachi: '").append(diachi).append('\'');
        sb.append(", sodienthoai: '").append(sodienthoai).append('\'');
        sb.append(", noilamviec: '").append(noilamviec).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("- Nơi làm việc: ");
        this.noilamviec = sc.nextLine();

    }
}
