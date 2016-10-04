
package ordenamiento;

/**
 *
 * @Ana Carolina Padrón Sandoval
 */
public class SellDouble {

    public static void ShellsortDouble(double[] a) {
        int siguiente = a.length / 2;
        while (siguiente >= 1) {
            for (int guardado = siguiente; guardado < a.length; guardado++) {
                double temporal = a[guardado];
                int j = guardado - siguiente;
                while (j >= 0 && a[j] > temporal) {
                    a[j + siguiente] = a[j];
                    j -= siguiente;
                }
                a[j + siguiente] = temporal;
            }
            siguiente /= 2;
        }
    }

    public static void imprimirB(double[] a) {
        String salida = "";
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 10) {
                salida += " " + a[i] + " ";
            } else {
                salida += a[i] + " ";
            }
        }
        System.out.println(salida);
    }

    public static void main(String[] args) {
        double b[] = {10.23, 23.10, 55.10, 55.001, 24.15, 24.5, 24.01, 18.0, 13.3, 10.23};
        System.out.println("Shell Double");
        ShellsortDouble(b);
        imprimirB(b);
    }

}
