/**
 * Created by nitiwat.n on 04/08/2560.
 */
public class Final02 {

    public static int final02(int A,int B,int C,int D,int E){
        if (Check(A, B, C, D, E)==1){
            return (A+B+C+D+E)*100;
        }
        return 0;

    }

    public static int Check(int A,int B,int C,int D,int E){
        int count=0;
        if (A>0)
            count++;
        if (B>0)
            count++;
        if (C>0)
            count++;
        if (D>0)
            count++;
        if (E>0)
            count++;
        return count;
    }



}
