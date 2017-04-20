package ro.rs.c6.oop2;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class FormaPatrulater extends Forma {
    Punct2D[] puncte;
    private int nrPuncte = 0;

    public FormaPatrulater(String culoare) {
        super(culoare);
        this.puncte = new Punct2D[4];
    }

    public Punct2D[] getPuncte() {
        return puncte;
    }

    public FormaPatrulater adaugaPunct(Punct2D punct) {
        if (this.nrPuncte == 4) {
            System.out.println("Patrulaterul are deja 4 puncte");
        }
        puncte[nrPuncte] = punct;
        nrPuncte++;
        return this;
    }
}
