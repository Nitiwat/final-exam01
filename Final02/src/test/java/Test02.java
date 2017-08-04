import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nitiwat.n on 04/08/2560.
 */
public class Test02 {
    Final02 final02 = new Final02();

    @Test
    public void test1(){
        double actualResult =final02.final02(1,0,0,0,0);
        double expectedResult =100;
        assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void test2(){
        double actualResult =final02.final02(1,1,0,0,0);
        double expectedResult =190;
        assertEquals(expectedResult,actualResult,0);
    }

}
