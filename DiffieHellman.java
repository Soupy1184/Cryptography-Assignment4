import java.math.BigInteger;

public class DiffieHellman implements Functions {
    int alpha;
    int p;
    int secretKey;
    int commonKey;

    public DiffieHellman(int alpha, int p){
        this.alpha = alpha;
        this.p = p;

        this.secretKey = Functions.getRandomNumberInRange(1, alpha-1);
    }

    public String getPublicKey(){
        BigInteger bd1, bd2, exponent, result;

        bd1 = BigInteger.valueOf(alpha);
        bd2 = BigInteger.valueOf(p);
        exponent = BigInteger.valueOf(secretKey);

        result = bd1.modPow(exponent, bd2);

        return result.toString(10);
    }

    public void authenticate(int key) {
        BigInteger bd1, bd2, exponent;

        bd1 = BigInteger.valueOf(key);
        bd2 = BigInteger.valueOf(p);
        exponent = BigInteger.valueOf(secretKey);

        this.commonKey = bd1.modPow(exponent, bd2).intValue();
    }
}
