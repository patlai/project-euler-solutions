/**
 * Created by Patrick on 12/18/2015.
 */
public class Three {
    public static void main(String[] args) {
        double x = 600851475143.0;
        for(double y = 0; y < x; y++){
            if(x % y == 0 && isPrime(y) == true){
                System.out.println(y);
            }
        }
    }
    public static boolean isPrime(double n) {
        for(double i=2;2*i<n;i++) {
            if(n%i==0)
                return false;
        }
        return true;
    }
}
