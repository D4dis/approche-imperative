package tp07.fr.algorithmie;

public class FabriquerMur {
    public static boolean fabriquerMur(int nbSmall, int nbBig, int longueur) {
        int bigUsed = Math.min(nbBig, longueur / 5);
        int remainder = longueur - bigUsed * 5;
        return nbSmall >= remainder;
    }

    public static void main(String[] args) {
        System.out.println(fabriquerMur(3, 1, 8));
        System.out.println(fabriquerMur(3, 1, 9));
        System.out.println(fabriquerMur(3, 2, 10));
        System.out.println(fabriquerMur(3, 2, 8));
        System.out.println(fabriquerMur(3, 2, 9));
        System.out.println(fabriquerMur(6, 1, 11));
        System.out.println(fabriquerMur(6, 0, 11));  // false
        System.out.println(fabriquerMur(1, 4, 11));
        System.out.println(fabriquerMur(0, 3, 10));
        System.out.println(fabriquerMur(1, 4, 12));  // false
        System.out.println(fabriquerMur(3, 1, 7));
        System.out.println(fabriquerMur(1, 1, 7));
    }
}
