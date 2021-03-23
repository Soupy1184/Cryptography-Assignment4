import java.util.ArrayList;
import java.util.List;

public interface Functions {
    
    public static String intToBinaryString(int n){
        String string = Integer.toBinaryString(n);

        return string;
    }

    //square and multiply algorithm
    public static int squareMultiply(int base, int exponent){
        int result = base;
        String binaryExponent = intToBinaryString(exponent);

        for (int i = 1; i < binaryExponent.length(); i++){
            if (binaryExponent.charAt(i) == '1'){
                result = (int) (Math.pow(result, 2) * base);
            }
            else{
                result = (int) (Math.pow(result, 2));
            }
        }

        return result;
    }
    
    // changes a phrase into an array of integers - working
    public static int[] alphabetToIntArray(String string) {
        string = string.toLowerCase();
        char[] stringArray = string.toCharArray();
        String alphabet = "abcdefghijklmnopqrstuvwxyz .,?()";
        char[] aplhaArray = alphabet.toCharArray();
        int[] array = new int[stringArray.length];

        for (int i = 0; i < stringArray.length; i++) {
            for (int j = 0; j < aplhaArray.length; j++) {
                if (stringArray[i] == aplhaArray[j]) {
                    array[i] = j;
                }
            }
        }

        return array;
    }

    //
    public static List<String> intArrayToBinaryString5(int[] array) {
        List<String> string = new ArrayList<String>();
        int count;

        for (int i = 0; i < array.length; i++) {
            count = Integer.toBinaryString(array[i]).length();
            switch (count) {
                case 1:
                    string.add("0000" + Integer.toBinaryString(array[i]));
                    break;
                case 2:
                    string.add("000" + Integer.toBinaryString(array[i]));
                    break;
                case 3:
                    string.add("00" + Integer.toBinaryString(array[i]));
                    break;
                case 4:
                    string.add("0" + Integer.toBinaryString(array[i]));
                    break;
                case 5:
                    string.add(Integer.toBinaryString(array[i]));
                    break;
                default:
                    System.out.println("Error in element " + array[i]);
            }
        }

        return string;
    }

    //USED FOR INTEGER PARSING
    public static List<String> intArrayToBinaryString4(int[] array) {
        List<String> string = new ArrayList<String>();
        int count;
        for (int i = 0; i < array.length; i++) {
            count = Integer.toBinaryString(array[i]).length();
            switch (count) {
                case 1:
                    string.add("000" + Integer.toBinaryString(array[i]));
                    break;
                case 2:
                    string.add("00" + Integer.toBinaryString(array[i]));
                    break;
                case 3:
                    string.add("0" + Integer.toBinaryString(array[i]));
                    break;
                case 4:
                    string.add(Integer.toBinaryString(array[i]));
                    break;
                default:
                    System.out.println("Error in element " + array[i]);
            }
        }
        return string;
    }

    //Inverse int array to alphabet
    public static String intArrayToAlphabet(int[] array){
        String string = "";
        String alphabet = "abcdefghijklmnopqrstuvwxyz .,?()";

        for (int i = 0; i < array.length; i++){
            string += alphabet.charAt(array[i]);
        }

        return string;
    }

    // changes a binary string to integer array
    public static int[] binaryStringToIntArray(List<String> string) {
        int[] array = new int[string.size()];

        for (int i = 0; i < array.length; i++) {
            array[i] = Integer.parseInt(string.get(i), 2);
        }

        return array;
    }

    // xor two strings
    public static String XOR(String B, String K) {
        String product = "";
        for (int i = 0; i < B.length(); i++) {
            if (B.charAt(i) == K.charAt(i)) {
                product += "0";
            } else {
                product += "1";
            }
        }
        return product;
    }

    public static List<String> stringToParts(String string, int n){
        List<String> parts = new ArrayList<String>();
        int len = string.length();
        for (int i=0; i<len; i+=n){
            parts.add(string.substring(i, Math.min(len, i + n)));
        }
        return parts;
    }

    public static String stringListToString(List<String> list){
        String string = "";
        for (int i = 0; i < list.size(); i++){
            string += list.get(i);
        }
        return string;
    }

    //gets a random number in a range
    public static int getRandomNumberInRange(int min, int max) {
        int result = (int) ((Math.random() * ((max - min) + 1)) + min);
        return result;
    }
}
