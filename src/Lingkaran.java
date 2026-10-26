public class Lingkaran extends BangunDatar {
    private double jariJari;
    private final double PHI = 3.14;

    public Lingkaran(double jariJari) {
        super("Lingkaran");
        this.jariJari = jariJari;
    }

    @Override
    public double hitungLuas() {
        return PHI * jariJari * jariJari;
    }

    @Override
    public double hitungKeliling() {
        return 2 * PHI * jariJari;
    }
}