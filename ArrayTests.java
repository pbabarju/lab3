import static org.junit.Assert.*;
import org.junit.*;

public class ArrayTests {
	@Test 
	public void testReverseInPlace() {
    int[] input1 = { 5, 6, 7, 8 };
    ArrayExamples.reverseInPlace(input1);
    assertArrayEquals(new int[]{ 8, 7, 6, 5 }, input1);
	}


  @Test
  public void testReversed() {
    int[] input1 = {5, 6, 7, 8 };
    assertArrayEquals(new int[]{ 8, 7, 6, 5}, ArrayExamples.reversed(input1));
  }
}
