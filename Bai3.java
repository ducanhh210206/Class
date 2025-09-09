import java.util.*;

class TaiKhoan {
    private String soTK;
    private String chuTK;
    private double soDu;

    private static double lsNam = 0.05;

    public TaiKhoan(String soTK, String chuTK, double soDu) {
        this.soTK = soTK;
        this.chuTK = chuTK;
        this.soDu = soDu;
    }

    public void napTien(double soTien) {
        if (soTien > 0) {
            soDu += soTien;
            System.out.println("Nạp thành công " + soTien + " vào tài khoản " + soTK);
        } else {
            System.out.println("Số tiền nạp không hợp lệ!");
        }
    }

    public void rutTien(double soTien) {
        if (soTien > 0 && soTien <= soDu) {
            soDu -= soTien;
            System.out.println("Rút thành công " + soTien + " từ tài khoản " + soTK);
        } else {
            System.out.println("Rút tiền thất bại!");
        }
    }

    public void tinhLaiThang() {
        double laiThang = soDu * (lsNam / 12);
        soDu += laiThang;
        System.out.println("Tài khoản " + soTK + " được cộng lãi: " + laiThang);
    }

    public void hienThi() {
        System.out.println("Số TK: " + soTK + ", Chủ TK: " + chuTK + ", Số dư: " + soDu);
    }

    public double getSoDu() {
        return soDu;
    }

    public String getSoTK() {
        return soTK;
    }

    public static void thayDoiLaiSuat(double ls) {
        if (ls > 0) {
            lsNam = ls;
            System.out.println("Lãi suất năm đã được thay đổi thành: " + (lsNam * 100) + "%");
        }
    }

    public static void hienThiLaiSuat() {
        System.out.println("Lãi suất năm hiện tại: " + (lsNam * 100) + "%");
    }
}

class Bai3 {
    public static void main(String[] args) {
        List<TaiKhoan> danhSach = new ArrayList<>();
        danhSach.add(new TaiKhoan("1001", "Nguyen Van A", 5000));
        danhSach.add(new TaiKhoan("1002", "Tran Thi B", 3000));
        danhSach.add(new TaiKhoan("1003", "Le Van C", 7000));

        danhSach.get(0).napTien(5000);
        danhSach.get(1).rutTien(2500);
        danhSach.get(2).tinhLaiThang();

        TaiKhoan.thayDoiLaiSuat(0.06);

        System.out.println("\nDanh sách tài khoản sau khi xử lý:");
        for (TaiKhoan tk : danhSach) {
            tk.hienThi();
        }
    }
}
