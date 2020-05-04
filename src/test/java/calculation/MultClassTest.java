package calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class MultClassTest {

  @Test
  public void mult() {
    MultClass multInstance = new MultClass();
    assertEquals(multInstance.mult(10, 10), 100);
  }

}