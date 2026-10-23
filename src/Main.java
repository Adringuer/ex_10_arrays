import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner Lectura = new Scanner(System.in);
        int[] a = new int[5];
        int[] b = new int[5];
        int[] resultat = new int[5];

        // Llegir els 5 enters de l'array a
        for (int i = 0; i < a.length; i++) {
            System.out.print("Introdueix a[" + i + "]: ");
            a[i] = Lectura.nextInt();
        }

        // Llegir els 5 enters de l'array b
        for (int i = 0; i < b.length; i++) {
            System.out.print("Introdueix b[" + i + "]: ");
            b[i] = Lectura.nextInt();
        }

        // Sumar casella a casella amb el mateix índex
        for (int i = 0; i < resultat.length; i++) {
            resultat[i] = a[i] + b[i];
        }

        // Mostrar els tres arrays
        System.out.println("a: " + formata(a));
        System.out.println("b: " + formata(b));
        System.out.println("resultat: " + formata(resultat));

        Lectura.close();
    }

    // Retorna l'array en format [x, y, z]
    private static String formata(int[] v) {
        String s = "[";
        for (int i = 0; i < v.length; i++) {
            s += v[i];
            if (i < v.length - 1) {
                s += ", ";
            }
        }
        return s + "]";
    }
}
