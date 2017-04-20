package ro.rs.c3;

/**
 * @author Remus Sinorchian; created on 4/17/2017
 */
public class BasicSyntax {
    public void operatoriAritmetici() {
        int a = 9;
        int b = 4;
        System.out.println("Suma: " + (a + b));
        System.out.println("Diferenta: " + (a - b));
        System.out.println("Produsul: " + (a * b));
        System.out.println("Catul: " + (a / b));
        System.out.println("Restul: " + (a % b));
    }

    public void conditionali() {
        int a = 3;
        int b = 4;
        if (a > b) {
            System.out.println("a>b");
        }

        if (a < b) {
            System.out.println("a<b");
        }

        if (a % 2 == 0 || b % 2 == 0) {
            System.out.println("Even number");
        }

        if (a % 2 != 0 || b % 2 == 0) {
            System.out.println("Odd number");
        }
    }

    public void forLoop() {
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);
        for (int i : array) {
            sum = sum + i;
        }
        System.out.println("Sum is: " + sum);
    }

    public static void whileLoop() {
        int i = 0;
        int[] array = {0, 1, 2, 3, 4, 5, 6};
        int sum = 0;
        while (i < array.length) {
            sum = sum + array[i];
            i = i + 1;
        }
        System.out.println("Sum is: " + sum);
    }

    public static void main(String[] args) {
        BasicSyntax obiect = new BasicSyntax();
        obiect.operatoriAritmetici();
        obiect.conditionali();
        obiect.forLoop();
        whileLoop();
    }
}
