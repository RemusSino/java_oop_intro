package ro.rs.c6.oop2;

import java.util.Arrays;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class FormaPatrat extends FormaPatrulater {

    public FormaPatrat(String culoare, Punct2D[] puncte) {
        super(culoare);
        for (Punct2D punct : puncte) {
            this.adaugaPunct(punct);
        }
    }

    public int calculeazaLatura() {
        int latura = puncte[0].getX() - puncte[1].getX();
        if (latura == 0)
            latura = puncte[0].getY() - puncte[1].getY();

        return Math.abs(latura);
    }

    @Override
    public String toString() {
        return "FormaPatrat{" +
                "puncte=" + Arrays.toString(puncte) +
                ", latura=" + calculeazaLatura() + '}';
    }
}
