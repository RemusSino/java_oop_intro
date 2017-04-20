package ro.rs.c6.oop2;


/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class MainCerc {
    public static void main(String[] args) {
        Punct2D centru = new Punct2D(2, 2);
        Cerc cerc = new Cerc(centru, 3);

        System.out.printf("Cercul cu centrul in (%d,%d) are diametrul %d \n", centru.getX(), centru
                .getY(), cerc.calculeazaDiametru());
        System.out.println("Aria cercului: " + cerc.calculeazaAria());

        cerc.PI = Math.PI;
        System.out.println(Cerc.PI);
    }
}
