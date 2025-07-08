package tp07.fr.algorithmie;

public class CalculMoyenne {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        double result = 0;
        for (int i = 0; i < array.length; i++) {
            result += array[i];
        }
        System.out.println("Moyenne du tableau : " + result / array.length);
    }
}
