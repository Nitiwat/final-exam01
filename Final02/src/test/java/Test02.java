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

    @Test
    public void test3(){
        double actualResult =final02.final02(1,1,1,0,1);
        double expectedResult =320;
        assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void test4(){
        double actualResult =final02.final02(2,1,1,0,1);
        double expectedResult =420;
        assertEquals(expectedResult,actualResult,0);
    }
    @Test
    public void test5(){
        double actualResult =final02.final02(1,1,1,1,1);
        double expectedResult =375;
        assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void test6(){
        double actualResult =final02.final02(2,1,1,1,1);
        double expectedResult =475;
        assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void test7(){
        double actualResult =final02.final02(2,2,2,1,1);
        double expectedResult =640;
        assertEquals(expectedResult,actualResult,0);
    }

    @Test
    public void test8(){
        double actualResult =final02.final02(4,4,4,2,2);
        double expectedResult =1280;
        assertEquals(expectedResult,actualResult,0);
    }

}
