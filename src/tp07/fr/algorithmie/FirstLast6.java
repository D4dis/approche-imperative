package tp07.fr.algorithmie;

public class FirstLast6 {
    public static void main(String[] args) {
        int[] array = {6, 1, 14, 5, 8};
        System.out.println("Le tableau commence par 6 ou se fini par 6 : " + ((array.length > 0 && array[0] == 6 || array[array.length - 1] == 6) ? true : false));
    }
}
