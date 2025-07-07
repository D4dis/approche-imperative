package fr.boucles;

import java.util.Arrays;

public class ExerciceTableauEntier {
    public static void main(String[] args){
        int[] tab = new int[10];
        for (int i = 0; i < tab.length; i++){
            tab[i] = i + 1;
        }
        System.out.println("Premier element : " + (tab[0]));
        System.out.println("Longueur du tableau : " + (tab.length));
        System.out.println("Dernier element : " + (tab[tab.length - 1]));
        tab[4] = 8;
        System.out.println(Arrays.toString(tab));
    }
}
