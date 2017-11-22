import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class DiscIntersectionTest {

    private Intersection intersection;

    @Before
    public void setup(){
        intersection = new Intersection();
    }

    @Test
    public void testSingleElementArrayReturnsZero(){
        performTest(new int[]{1}, 0);
    }

    @Test
    public void testAnArrayOfTwoZeroesReturnsZero(){
        performTest(new int[]{0,0}, 0);
    }

    @Test
    public void testAnArrayOfZeroAndOneReturnsOnes(){
        performTest(new int[]{0,1}, 1);
    }

    private void performTest(int[] testData, int expectedResult){
        int actualResult = intersection.calculate(testData);
        Assert.assertEquals(expectedResult, actualResult);
    }

}
