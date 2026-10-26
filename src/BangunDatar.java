public abstract class BangunDatar {
    protected String nama;

    public BangunDatar(String nama) {
        this.nama = nama;
    }

    public String getNama() {
        return nama;
    }

    // Metode abstract — WAJIB dibuat oleh kelas anak
    public abstract double hitungLuas();
    public abstract double hitungKeliling();
}