public class DiffieHellman implements Functions {
    int alpha;
    int p;
    int secretKey;

    public DiffieHellman(int alpha, int p){
        this.alpha = alpha;
        this.p = p;

        this.secretKey = Functions.getRandomNumberInRange(1, alpha);
    }

    public int getPublicKey(){
        return (int) (Math.pow(alpha, secretKey) % p);
    }
}
