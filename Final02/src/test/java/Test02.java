import org.junit.Test;

import static org.junit.Assert.assertEquals;

/**
 * Created by nitiwat.n on 04/08/2560.
 */
public class Test02 {
    Final02 final02 = new Final02();

    @Test
    public void test1(){
        int actualResult =final02.final02(1,0,0,0,0);
        int expectedResult =100;
        assertEquals(expectedResult,actualResult);
    }

}
