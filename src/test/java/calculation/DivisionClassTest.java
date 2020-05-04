package calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class DivisionClassTest {

  @Test
  public void add() {
    DivisionClass divisionInstance = new DivisionClass();
    assertEquals(divisionInstance.division(10, 10), 1);
  }

}

