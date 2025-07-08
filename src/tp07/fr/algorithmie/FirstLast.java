package tp07.fr.algorithmie;

public class FirstLast {
    public static void main(String[] args) {
        int[] array = {2, 4, 2};
        System.out.println("Premier élément = dernier élément : " + (array.length >= 1 && array[0] == array[array.length - 1] ? true : false));
    }
}
