import java.util.ArrayList;
import java.util.List;

public class Encryption implements Functions {
    int key;
    String plaintext;
    String ciphertext;

    public Encryption(int key, String plaintext){
        this.key = key;
        this.plaintext = plaintext;

        encrypt();
    }

    private void encrypt(){
        int[] array = Functions.alphabetToIntArray(plaintext);
        List <String> list = Functions.intArrayToBinaryString5(array);
        String binaryString = Functions.stringListToString(list);

        String binaryKeyString = Functions.intToBinaryString(key);

        list = Functions.stringToParts(binaryString, binaryKeyString.length());

        List <String> listXOR = new ArrayList<String>();

        for (int i = 0; i < list.size(); i++){
            listXOR.add(Functions.XOR(list.get(i), binaryKeyString)); 
        }

        binaryString = Functions.stringListToString(listXOR);
        list = Functions.stringToParts(binaryString, 5);
        array = Functions.binaryStringToIntArray(list);
        this.ciphertext = Functions.intArrayToAlphabet(array);
    }

    public String getCiphertext(){
        return ciphertext;
    }
}
