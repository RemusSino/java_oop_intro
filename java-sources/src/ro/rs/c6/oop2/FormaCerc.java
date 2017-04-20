package ro.rs.c6.oop2;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class FormaCerc extends Forma {
    private Punct2D centru;
    private int raza;

    public FormaCerc(String culoare, Punct2D centru, int raza) {
        super(culoare);
        this.centru = centru;
        this.raza = raza;
    }

    public int calculeazaDiametru() {
        int diametru = raza * 2;
        return diametru;
    }

    public double calculeazaAria() {
//        double arie = Math.PI * raza * raza;
        double arie = Math.PI * Math.pow(raza, 2);
        return arie;
    }

    public String getCuloare() {
        if (this.culoare == null || this.culoare == "")
            return "Cercul nu are o culoare setata";
        return this.culoare;
    }

    public void modificaCerc(String culoare) {
        this.culoare = culoare;
    }

    public void modificaCerc(Punct2D centru) {
        this.centru = centru;
    }

    public void modificaCert(Punct2D centru, int raza) {
        this.centru = centru;
        this.raza = raza;
    }

    @Override
    public String toString() {
        return "FormaCerc{" +
                "centru=" + centru +
                ", raza=" + raza +
                '}';
    }
}
