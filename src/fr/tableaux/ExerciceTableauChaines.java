package fr.tableaux;

import java.lang.reflect.Array;
import java.util.Arrays;

public class ExerciceTableauChaines {
    public static void main(String[] args) {
        String[] villes = {"Montpellier", "Paris", "Toulouse", "Marseille", "Nantes"};
        System.out.println("Toutes les villes du tableau : " + Arrays.toString(villes));
        System.out.println("Longueur de villes : " + villes.length);
        villes[3] = "Reims";
        System.out.println("Toutes les villes du tableau (apres modif) : " + Arrays.toString(villes));
    }
}
