public class Main implements Functions {
    public static void main(String[] args){
        DiffieHellman alice = new DiffieHellman(11, 2399);

        System.out.println(alice.getPublicKey());

        System.out.println(Functions.squareMultiply(3, 3));
    }
}