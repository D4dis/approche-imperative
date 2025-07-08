package tp07.fr.algorithmie;

import java.util.Arrays;

public class AffichageInverse {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        for (int i = 0; i < array.length; i++) {
            System.out.println("Ensemble des éléments : " + array[i]);
        }
        for (int i = array.length - 1; i >= 0; i--) {
            System.out.println("Ensemble des éléments dans l'ordre inverse : " + array[i]);
        }
        int[] arrayCopy = array.clone();
        System.out.println("Copie du tableau array : " + Arrays.toString(arrayCopy));
    }
}
