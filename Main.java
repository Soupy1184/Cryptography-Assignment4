import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        String plaintext = "hello zach, its nice to work with you.";
        
        DiffieHellman alice = new DiffieHellman(11, 2399);
        System.out.println("Send this number to your partner: ");
        System.out.println(alice.getPublicKey());

        //key exchange
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter public key from partner: ");

        String inputKey = sc.nextLine();
        int key = Integer.parseInt(inputKey);
        
        //authenticate common key
        alice.authenticate(key);

        //uncomment this to see common key value for sake of assignment
        // System.out.println("Common Key: " + alice.commonKey);

        //encryp using common key
        Encryption encryption = new Encryption(alice.commonKey, plaintext);
        System.out.println(encryption.getCiphertext());

        //decrypt section using common key
        System.out.println("Enter ciphertext from partner to decrypt: ");
        String ciphertext = sc.nextLine();
        
        Decryption decryption = new Decryption(alice.commonKey, ciphertext);
        System.out.println(decryption.getPlaintext());
        
        sc.close();
    }
}