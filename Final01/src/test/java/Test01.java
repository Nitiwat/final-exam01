/**
 * Created by nitiwat.n on 04/08/2560.
 */
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class Test01 {
    Final01 final01 = new Final01();

    @Test
    public void test1(){
        Long actualResult =final01.final1(8);
        Long expectedResult =8l;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test2(){
        Long actualResult =final01.final1(10);
        Long expectedResult =9l;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test3(){
        Long actualResult =final01.final1(20);
        Long expectedResult =19l;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test4(){
        Long actualResult =final01.final1(132);
        Long expectedResult =129l;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test5(){
        Long actualResult =final01.final1(161);
        Long expectedResult =159l;
        assertEquals(expectedResult,actualResult);
    }

    @Test
    public void test6(){
        Long actualResult =final01.final1(11110);
        Long expectedResult =9999l;
        assertEquals(expectedResult,actualResult);
    }
    @Test
    public void test7(){
        Long actualResult =final01.final1(653161544328834085l);
        Long expectedResult =599999999999999999l;
        assertEquals(expectedResult,actualResult);
    }
}