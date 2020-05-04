package calculation;

    import static org.junit.jupiter.api.Assertions.*;

    import org.junit.jupiter.api.Test;

public class AddClassTest {

  @Test
  public void add() {
    AddClass addInstance = new AddClass();
    assertEquals(addInstance.add(10, 10), 23);
  }

}
