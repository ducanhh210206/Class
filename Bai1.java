class HinhChuNhat {
    private double Dai;
    private double Rong;

    public HinhChuNhat(double dai, double rong) {
        this.Dai = dai;
        this.Rong = rong;
    }

    public double TinhChuVi() {
        return (Dai + Rong) * 2;
    }

    public double TinhDienTich() {
        return Dai * Rong;
    }

    public void hienthi() {
        System.out.println("Chieu dai: " + Dai);
        System.out.println("Chieu rong: " + Rong);
        System.out.println("Chu vi: " + TinhChuVi());
        System.out.println("Dien tich: " + TinhDienTich());
        System.out.println("-----------------------");
    }
}

class Bai1 {
    public static void main(String[] args) {
        HinhChuNhat hcn1 = new HinhChuNhat(5, 3);
        HinhChuNhat hcn2 = new HinhChuNhat(7, 5);
        HinhChuNhat hcn3 = new HinhChuNhat(6, 2);
        
        hcn1.hienthi();
        hcn2.hienthi();
        hcn3.hienthi();
    }
}