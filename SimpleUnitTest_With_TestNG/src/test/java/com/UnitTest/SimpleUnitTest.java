package com.UnitTest;

import org.junit.Assert;
import org.junit.Test;

class SimpleClass{
    public int sum(int[] numbers){
        int sum= 0;
        for(int i=0;i<numbers.length;i++){
            sum= sum+numbers[i];
        }
        return sum;
    }
}


public class SimpleUnitTest {
    @Test
    public void testFor1Elements() {
        SimpleClass simpleClass =new SimpleClass();
        int actualResult = simpleClass.sum(new int[] {12});
        int expectedResult = 12;

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void test2ForElement() {
        SimpleClass simpleClass = new SimpleClass();
        int actualResult = simpleClass.sum(new int[]{12,10});
        int expectedResult = 22;

        Assert.assertEquals(expectedResult, actualResult);
    }
    @Test
    public void testFor3Element() {
        SimpleClass simpleClass = new SimpleClass();
        int actualResult = simpleClass.sum(new int[]{12,10,100});
        int expectedResult = 122;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFor4Element() {
        SimpleClass simpleClass = new SimpleClass();
        int actualResult = simpleClass.sum(new int[]{12,10,100,200});
        int expectedResult = 322;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFor5Element() {
        SimpleClass simpleClass = new SimpleClass();
        int actualResult = simpleClass.sum(new int[]{12,10,100,200,300});
        int expectedResult = 622;

        Assert.assertEquals(expectedResult, actualResult);
    }

    @Test
    public void testFor6Element() {
        SimpleClass simpleClass = new SimpleClass();
        int actualResult = simpleClass.sum(new int[]{12,10,100,200,300,400});
        int expectedResult = 1000;

        Assert.assertEquals(expectedResult, actualResult);
    }


}


