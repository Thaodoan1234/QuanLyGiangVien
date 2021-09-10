package Giangvien;

import java.util.Scanner;

public class GVCoHuu extends QuanLy {
    private int luongthoathuan, sogioquydinh;

    public GVCoHuu() {
    }

    public GVCoHuu(String tengiangvien, String email, String diachi, String sodienthoai, int sogioday, int luongthoathuan, int sogioquydinh) {
        super(tengiangvien, email, diachi, sodienthoai, sogioday);
        this.luongthoathuan = luongthoathuan;
        this.sogioquydinh = sogioquydinh;
    }

    public int getLuongthoathuan() {
        return luongthoathuan;
    }

    public void setLuongthoathuan(int luongthoathuan) {
        this.luongthoathuan = luongthoathuan;
    }

    public int getSogioquydinh() {
        return sogioquydinh;
    }

    public void setSogioquydinh(int sogioquydinh) {
        this.sogioquydinh = sogioquydinh;
    }

    @Override
    public String toString() {
        final StringBuffer sb = new StringBuffer("GVCoHuu{");
        sb.append("tengiangvien: '").append(tengiangvien).append('\'');
        sb.append(", email: '").append(email).append('\'');
        sb.append(", diachi: '").append(diachi).append('\'');
        sb.append(", sodienthoai: '").append(sodienthoai).append('\'');
        sb.append(", luongthoathuan: ").append(luongthoathuan).append('\'');
        sb.append(", sogioquydinh: ").append(sogioquydinh).append('\'');
        sb.append('}');
        return sb.toString();
    }

    @Override
    public void fromConsole(Scanner sc) {
        super.fromConsole(sc);

        System.out.print("- Lương thỏa thuận: ");
        this.luongthoathuan = Integer.parseInt(sc.nextLine());

        System.out.print("- Số giờ dạy tối thiểu trong tháng: ");
        this.sogioquydinh = Integer.parseInt(sc.nextLine());

    }


}
