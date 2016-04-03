/**
 * Created by Patrick on 12/19/2015.
 */
public class Six {
    public static void main(String[] args) {
        int squares = 0;
        int sum = 0;
        for(int i = 1; i <= 100; i++){
            squares += Math.pow(i,2);
            sum += i;
        }
        double sumSquared = Math.pow(sum, 2);
        double blazeIt = sumSquared - squares;
        System.out.printf("%.0f\n",blazeIt);
    }
}
