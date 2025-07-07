package fr.tableaux;

public class ExerciceDeclarationTab {
    public static void main(String[] args) {
        int[] tab = {8, -7, 12, -2, 14, 17, 9};
        System.out.println("Element index 0 : " + tab[0]);
        System.out.println("Longueur du tableau : " + tab.length);
        System.out.println("Element dernier index : " + tab[tab.length - 1]);
        System.out.println("Element index 10 : " + tab[10]); // ca echoue car il n'y a pas d'element a l'index 10, le dernier element se trouve a l'index 6
    }
}
