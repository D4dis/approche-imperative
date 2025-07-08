package tp07.fr.algorithmie;

public class SommeDeTableauxDiff {
    public static void main(String[] args) {
        int[] array = {1, 15, -3, 0, 8, 7, 4, -2, 28, 7, -1, 17, 2, 3, 0, 14, -4};
        int[] array2 = {-1, 12, 17, 14, 5, -9, 0, 18};
        int maxLength = Math.max(array.length, array2.length);
        int result = 0;
        for(int i = 0; i < maxLength; i++){
            if(array.length <= i){
                result += array2[i];
            } else if (array2.length <= i) {
                result += array[i];
            } else {
                result += array[i] + array2[i];
            }
        }
        System.out.println("Somme des 2 tableaux : " + result);
    }
}
