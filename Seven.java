/**
 * Created by Patrick on 12/19/2015.
 */
import java.util.ArrayList;
public class Seven {
    public static void main(String[] args) {
        ArrayList<Integer> primes = new ArrayList<Integer>();
        for(int i = 2; i < 2147483647; i++){
            int j = 0;
            if(isPrime(i)){
                primes.add(i);
                j++;
            }
            if(primes.size() > 10001){
                break;
            }
        }
        for(int k = 0; k<50; k++){
            System.out.println(primes.get(k));
        }
        System.out.println(primes.get(10001));
    }
    public static boolean isPrime(int n) {
        boolean swag = true;
        for(int i=2;2*i<n;i++) {
            if(n%i==0 || (n%2 == 0 && n > 2) || n ==4)
                swag = false;
        }
        return swag;
    }
}
