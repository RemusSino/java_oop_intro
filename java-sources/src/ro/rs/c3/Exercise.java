package ro.rs.c3;

/**
 * @author Remus Sinorchian; created on 4/20/2017
 */
public class Exercise {
    public static String reverse(String s) {
        char[] reversed = new char[s.length()];
        char[] letters = s.toCharArray();
        for (int i = letters.length - 1; i >= 0; i--) {
            reversed[letters.length - i - 1] = letters[i];
        }

        return String.valueOf(reversed);
    }

    public static void main(String[] args) {
        String initial = args[0];
        String reversed = reverse(initial);
        System.out.println(reversed);
    }
}
