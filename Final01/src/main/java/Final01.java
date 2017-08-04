/**
 * Created by nitiwat.n on 04/08/2560.
 */
public class Final01 {
    public static long final1(long input) {
        if (input / 10 < 1) {
            return input;
        } else {
            String x = String.valueOf(input);
            return Loop(x,input);
        }
    }
    public static Long Loop(String x,long input){
        for (int i = 0; i < x.length()-1; i++) {
            while (x.charAt(i) > x.charAt(i + 1)) {
                input--;
                x = String.valueOf(input);
                if (input/10<1){
                    return input;
                }
                Loop(x, input);
            }
        }
        return input;
    }

}