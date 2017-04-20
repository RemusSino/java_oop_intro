package ro.rs.c5;

import ro.rs.c6.oop2.Punct2D;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class Main {
    public static void main(String[] args) {
        Punct2D centru = new Punct2D(2, 2);
        Cerc cerc = new Cerc(2, 2, 3);
        System.out.println(cerc.calculeazaAria());
    }
}
