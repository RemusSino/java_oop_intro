package ro.rs.c6.oop3.collections;

import java.util.*;

/**
 * @author Remus Sinorchian
 */
public class Demo {
    public static void liste() {
        List<String> cuvinte = new ArrayList<>();
        cuvinte.add("Ana");
        cuvinte.add("are");
        cuvinte.add("mere");
        for (String cuvant : cuvinte) {
            System.out.print(cuvant + " ");
        }
    }

    public static void seturi() {
        Set<String> cuvinte = new LinkedHashSet<>();
        cuvinte.add("Ana");
        cuvinte.add("Ana");
        cuvinte.add("are");
        cuvinte.add("mere");
        for (String s : cuvinte) {
            System.out.println(s + " ");
        }
    }

    public static void mapuri() {
        Map<String, String> angajatiProiecte = new HashMap<>();
        angajatiProiecte.put("Ion Popescu", "Proiect ID1");
        angajatiProiecte.put("George Popa", "Proiect ID2");

        for (Map.Entry e : angajatiProiecte.entrySet()) {
            System.out.println(e.getKey() + " lucreaza la " + e.getValue());
        }
    }


    public static void main(String[] args) {
        liste();
        seturi();
        mapuri();
    }
}
