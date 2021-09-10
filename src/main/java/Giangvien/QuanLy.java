package Giangvien;

import java.util.Scanner;

public class QuanLy {

    //dùng protected để các lớp con có thể truy suất dữ liệu từ nó
        protected String tengiangvien, email, diachi, sodienthoai;
        private int sogioday;

        public QuanLy() {
        }

        public QuanLy(String tengiangvien, String email, String diachi, String sodienthoai, int sogioday) {
            this.tengiangvien = tengiangvien;
            this.email = email;
            this.diachi = diachi;
            this.sodienthoai = sodienthoai;
            this.sogioday = sogioday;
        }

        public String getTengiangvien() {
            return tengiangvien;
        }

        public void setTengiangvien(String tengiangvien) {
            this.tengiangvien = tengiangvien;
        }

        public String getEmail() {
            return email;
        }

        public void setEmail(String email) {
            this.email = email;
        }

        public String getDiachi() {
            return diachi;
        }

        public void setDiachi(String diachi) {
            this.diachi = diachi;
        }

        public String getSodienthoai() {
            return sodienthoai;
        }

        public void setSodienthoai(String sodienthoai) {
            this.sodienthoai = sodienthoai;
        }

        public int getSogioday() {
            return sogioday;
        }

        public void setSogioday(int sogioday) {
            this.sogioday = sogioday;
        }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("QuanLy{");
        sb.append("tengiangvien: '").append(tengiangvien).append('\'');
        sb.append(", email: '").append(email).append('\'');
        sb.append(", diachi: '").append(diachi).append('\'');
        sb.append(", sodienthoai: '").append(sodienthoai).append('\'');
        sb.append(", sogioday: ").append(sogioday);
        sb.append('}');
        return sb.toString();
    }

    //vì cả 2 loại giảng viên đều dùng chung hàm fromConsole() để nhập thông tin nên tạo hàm 1 lần ở lớp cha
    public void fromConsole(Scanner sc) {

        System.out.print("- Tên giảng viên: ");
       this.tengiangvien = sc.nextLine();

        System.out.print("- Email: ");
       this.email = sc.nextLine();

        System.out.print("- Điện thoại: ");
        this.sodienthoai = sc.nextLine();

        System.out.print("- Địa chỉ: ");
        this.diachi = sc.nextLine();

        System.out.print("- Số giờ dạy trong tháng: ");
        this.sogioday = Integer.parseInt(sc.nextLine());

    }





}
