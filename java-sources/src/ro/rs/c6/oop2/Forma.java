package ro.rs.c6.oop2;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class Forma {
    public String culoare;

    public Forma(String culoare) {
        this.culoare = culoare;
    }

    @Override
    public String toString() {
        return "Forma{" +
                "culoare='" + culoare + '\'' +
                '}';
    }
}
