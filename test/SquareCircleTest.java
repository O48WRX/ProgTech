import org.junit.jupiter.api.Test;
import org.testng.Assert;

public class SquareCircleTest {
    @Test
    public void testCircleCalculateArea() {
        double actualArea = Circle.calculateArea(5);
        double expectedArea = 3.141592653589793 * 5 * 5;
        Assert.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testCircleCalculatePerimeter() {
        double actualPerimeter = Circle.calculatePerimeter(5);
        double expectedPerimeter = 3.141592653589793 * (2 * 5);
        Assert.assertEquals(expectedPerimeter, actualPerimeter);
    }

    @Test
    public void testSquareCalculateArea() {
        double actualArea = Square.calculateArea(5);
        double expectedArea = 5 * 5;
        Assert.assertEquals(expectedArea, actualArea);
    }

    @Test
    public void testSquareCalculatePerimeter() {
        double actualPerimeter = Square.calculatePerimeter(5);
        double expectedPerimeter = 4 * 5;
        Assert.assertEquals(expectedPerimeter, actualPerimeter);
    }

}
