package tp07.fr.algorithmie;

public class NombreParfait {
    public static void main(String[] args) {
        int number = 6;
        int sumDividers = 0;
        for (int i = 1; i <= number / 2; i++) {
            if (number % i == 0) {
                sumDividers += i;
            }
        }
        System.out.println(sumDividers == number ? number + " est parfait" : number + " n'est pas parfait");
    }
}
