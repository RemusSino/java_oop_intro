package ro.rs.c6.oop3;

/**
 * @author Remus Sinorchian
 */
public abstract class Forma {
    String culoare;

    public Forma(String culoare) {
        this.culoare = culoare;
    }

    abstract double calculeazaAria();

    abstract double calculeazaPerimetru();

    @Override
    public String toString() {
        return "Forma{" +
                "culoare='" + culoare + '\'' +
                "aria='" + calculeazaAria() + '\'' +
                "perimetru='" + calculeazaPerimetru() + '\'' +
                '}';
    }
}
