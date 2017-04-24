package ro.rs.c6.oop3;

/**
 * @author Remus Sinorchian
 */
public class Patrat extends Forma implements Translatabil {
    public Patrat(String culoare) {
        super(culoare);
    }

    @Override
    public void translateazaX(int x) {

    }

    @Override
    public void translateazaY(int y) {

    }

    @Override
    double calculeazaAria() {
        return 0;
    }

    @Override
    double calculeazaPerimetru() {
        return 0;
    }
}
