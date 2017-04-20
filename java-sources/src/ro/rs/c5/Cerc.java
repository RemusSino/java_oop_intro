package ro.rs.c5;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class Cerc {
    int x;
    int y;
    int raza;

    public Cerc(int x, int y, int raza) {
        this.x = x;
        this.y = y;
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
}
