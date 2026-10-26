public class Main {
    public static void main(String[] args) {
        BangunDatar bangun1 = new Persegi(5);
        BangunDatar bangun2 = new PersegiPanjang(4, 6);
        BangunDatar bangun3 = new Lingkaran(7);

        tampilkanInfo(bangun1);
        tampilkanInfo(bangun2);
        tampilkanInfo(bangun3);
    }

    public static void tampilkanInfo(BangunDatar bd) {
        System.out.println("--------------------------");
        System.out.println("Nama: " + bd.getNama());
        System.out.println("Luas: " + bd.hitungLuas());
        System.out.println("Keliling: " + bd.hitungKeliling());
    }
}
