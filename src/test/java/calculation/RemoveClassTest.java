package calculation;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class RemoveClassTest {

  @Test
  public void remove() {
    RemoveClass removeClass = new RemoveClass();
    assertEquals(removeClass.remove(10, 10), 0);
  }

}
