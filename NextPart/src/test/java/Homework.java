import org.testng.Assert;
import org.testng.annotations.DataProvider;
import org.testng.annotations.Test;

public class Homework {

    @DataProvider(name = "numbersRequired")
    public Object[][] generateAdditionNumbers() {
        return new Object[][] {{10, 15, 25}};
    }
    @Test(groups = "addition", dataProvider = "numbersRequired")
    public void sum(int x, int y, int expectedResult) {
        int sumResult = x + y;
        Assert.assertEquals(sumResult, expectedResult,
                String.format("Incorrect sum result for (%s) + (%s)", x, y));
    }

    @Test(groups = "subtraction", dataProvider = "numbersRequired")
    public void subtraction(int firstNum, int secondNum, int thirdNum) {
        double result = firstNum - secondNum;
    }

    @Test(groups = "multiplication", dataProvider = "numbersRequired")
    public void multiplication(double firstNum, double secondNum, double thirdNum) {
        double result = firstNum * secondNum;
    }

    @Test(groups = "division", dataProvider = "numbersRequired")
    public void division(double firstNum, double secondNum, double thirdNum) {
        double result = firstNum / secondNum;
    }

    @Test(groups = "modulo", dataProvider = "numbersRequired")
    public void modulo(double firstNum, double secondNum) {
        double result = firstNum % secondNum;
    }
}
