/**
 * Created by Patrick on 12/18/2015.
 */
import java.util.ArrayList;
public class Four {
    public static void main(String[] args) {
        Integer i = 100;
        Integer j = 100;
        ArrayList<Integer> numbers = new ArrayList<Integer>();
        while (j < 1000) {
            while (i < 1000) {
                Integer product = i * j;
                String p = product.toString();
                boolean swag = true;
                for (int q = 0; q < 0.5 * p.length(); q++) {
                    if (p.charAt(p.length() - (q + 1)) == p.charAt(q)) {
                        swag = true;
                    } else {
                        swag = false;
                        break;
                    }
                }
                if (swag) {
                    numbers.add(product);
                    //System.out.println(p);
                }

                i++;
            }
            j++;
            i=10;
        }
        int max = 0;
        for(int k = 0; k < numbers.size(); k++){
            if(numbers.get(k) > max ){
                max = numbers.get(k);
            }
        }
        System.out.println(max);
    }
}
