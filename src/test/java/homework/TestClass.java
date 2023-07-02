package homework;

import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class TestClass {
    @DataProvider(name = "dataProvider")
    public Object[][] dataProvider(){
        return new Object[][]{
                {2,3,5},
                {5, 7, 12},
        };
    }
    @Test(groups = "addition", dataProvider = "dataProvider")
    public void testOne(int a, int b, int expectedResult) {
      int sum = a + b;
        Assert.assertTrue(sum == expectedResult);
    }

    @Test(groups = "subtraction", dataProvider = "dataProvider")
    public void testTwo(int a, int b, int expectedResults) {
        int sum = a - b;
        Assert.assertFalse(sum < expectedResults);
    }

    @Test(groups = "multiplication", dataProvider = "dataProvider")
    public void testThree(int a, int b, int expectedResults) {
        int sum = a * b;
        Assert.assertFalse(sum == expectedResults);
    }

    @Test(groups = "division", dataProvider = "dataProvider")
    public void testFour(int a, int b, int expectedResults) {
        int sum = a / b;
        Assert.assertFalse(sum == expectedResults);
    }

    @Test(groups = "modularDivision", dataProvider = "dataProvider")
    public void testFive(int a,int b, int expectedResults) {
        int sum = a % b;
        Assert.assertFalse(sum > expectedResults);
    }
}
