/**
 * Created by nitiwat.n on 04/08/2560.
 */
public class Final02 {

    public static double final02(int A,int B,int C,int D,int E) {
        double total=0;
        while (A>0||B>0||C>0||D>0||E>0) {
            if (Check(A,B,C,D,E) == 1) {
                total += (A + B + C + D + E) * 100;

            }
            if (Check(A,B,C,D,E) == 2) {
                total += (A + B + C + D + E) * 100 * .95;
            }
            if (Check(A,B,C,D,E) == 3) {
                total += (A + B + C + D + E) * 100 * 9;
            }
            if (Check(A,B,C,D,E) == 4) {
                total += (A + B + C + D + E) * 100 * 8;
            }
            if (Check(A,B,C,D,E) == 5) {
                total += (A + B + C + D + E) * 100 * 75;
            }
        }
             return total;

    }

    public static int Check(int A,int B,int C,int D,int E) {
        int count = 0;
        if (A > 0)
            count++;
        if (B > 0)
            count++;
        if (C > 0)
            count++;
        if (D > 0)
            count++;
        if (E > 0)
            count++;
        return count;
    }


}
