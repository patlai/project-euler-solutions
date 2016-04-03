/**
 * Created by Patrick on 12/18/2015.
 */
public class Five {
    public static void main(String[] args) {
        int yourmom = 2147483647;
        double i = 2520.0;
        while(i < yourmom){
            boolean penis = false;
            double temp = i;
            for(int j = 20; j>0; j--){

                if(i%j == 0){
                    penis = true;
                } else {
                    penis = false;
                    break;
                }
            }
            if(penis){
                System.out.printf("%.0f\n", i);
                break;
            } else {
                i = temp + 2520;
            }
        }
    }
}
