package tp07.fr.algorithmie;

public class CaracteresConsecutifs {
    public static void main(String[] args) {
        String string = "aaabbc";
        String result = "";
        int count = 1;
        for (int i = 0; i < string.length(); i++) {
            char currentChar = string.charAt(i);
            System.out.println(currentChar);
            if (i < string.length() - 1 && currentChar == string.charAt(i + 1)) {
                count++;
            } else {
                result += string.charAt(i);
                result += count;
                count = 1;
            }
        }
        System.out.println(result);
    }
}