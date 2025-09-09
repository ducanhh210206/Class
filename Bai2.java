class SinhVien {
    private String maSV;
    private String hoTen;
    private int tuoi;
    
    private static int TongSV = 0;
    
    public SinhVien(String maSV, String hoTen, int tuoi ) {
        this.maSV = maSV;
        this.hoTen = hoTen;
        this.tuoi = tuoi;
        TongSV++;
    }

    public void hienthi() {
        System.out.println("Ma SV: " + maSV);
        System.out.println("Ho ten: " + hoTen);
        System.out.println("Tuoi: " + tuoi);
    }

    public static void hienthiTongSV() {
        System.out.println("Tổng số sinh viên:" + TongSV);
    }
    
}

class Bai2 {
    public static void main(String[] args) {
        SinhVien sv1 = new SinhVien("SV001", "Nguyen Van A", 20);
        SinhVien sv2 = new SinhVien("SV002", "Le Thi B", 21);
        SinhVien sv3 = new SinhVien("SV003", "Tran Van C", 22);
        
        sv1.hienthi();
        System.out.println("-----------------------");
        sv2.hienthi();
        System.out.println("-----------------------");
        sv3.hienthi();
        System.out.println("-----------------------");
        
        SinhVien.hienthiTongSV();
    }
}