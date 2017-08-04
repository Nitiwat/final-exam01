/**
 * Created by nitiwat.n on 04/08/2560.
 */
public class Final02 {

    public static double final02(int A,int B,int C,int D,int E) {
        double total=0;
        while (A>0||B>0||C>0||D>0||E>0) {
            if (Check(A,B,C,D,E) == 1) {
                total += (A + B + C + D + E) * 100;
               A--;B--;C--;D--;E--;
            }
            if (Check(A,B,C,D,E) == 2) {
                int count =0;
                total+=2*100*.95;
                if(A>0){A--;count++;}
                if (B>0){B--;count++;}
                if (C>0&&count<2){C--;count++;}
                if (D>0&&count<2){D--;count++;}
                if (E>0&&count<2){E--;count++;}
            }
            if (Check(A,B,C,D,E) == 3) {
                int count=0;
                total += 3*100*.9;
                if(A>0){A--;count++;}
                if (B>0){B--;count++;}
                if (C>0){C--;count++;}
                if (D>0&&count<3){D--;count++;}
                if (E>0&&count<3){E--;count++;}
            }
            if (Check(A,B,C,D,E) == 4) {
                int count=0;
                total += 4*100*.8;
                if(A>0){A--;count++;}
                if (B>0){B--;count++;}
                if (C>0){C--;count++;}
                if (D>0){D--;count++;}
                if (E>0&&count<4){E--;count++;}
            }
            if (Check(A,B,C,D,E) == 5) {
                total +=5 * 100 * .75;
                A--;B--;C--;D--;E--;
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
