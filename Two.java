/**
 * Created by Patrick on 12/18/2015.
 */
public class Two {
    public static void main(String[] args){
        int a = 1;
        int i = 2;
        int sum = 2;
        while (i < 4000000){
            int temp = a;
            a = i;
            i = temp + i;
            if(i > 4000000){
                break;
            }
            if(i % 2 == 0) {
                sum+= i;
            }
            System.out.println(i);
        }
        System.out.println(sum);
    }
}
