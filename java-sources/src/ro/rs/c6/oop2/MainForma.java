package ro.rs.c6.oop2;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class MainForma {
    public static void main(String[] args) {
        Forma cerc = new FormaCerc("rosu", new Punct2D(1, 1), 2);

        Punct2D[] puncte = new Punct2D[]{
                new Punct2D(1, 1), new Punct2D(1, 2), new
                Punct2D(2, 2), new Punct2D(2, 1)
        };

        Forma patrat = new FormaPatrat("verde", puncte);

        System.out.println(cerc);
        System.out.println(patrat);
    }
}
