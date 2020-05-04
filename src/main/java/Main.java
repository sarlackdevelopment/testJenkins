import calculation.AddClass;
import calculation.DivisionClass;
import calculation.MultClass;
import calculation.RemoveClass;

public class Main {
  public static void main(String[] args) {

    int a = 100;
    int b = 50;

    AddClass addInstance = new AddClass();
    RemoveClass removeInstance = new RemoveClass();
    MultClass multInstance = new MultClass();
    DivisionClass divisionInstance = new DivisionClass();

    System.out.println(addInstance.add(a, b));
    System.out.println(removeInstance.remove(a, b));
    System.out.println(multInstance.mult(a, b));
    System.out.println(divisionInstance.division(a, b));

  }
}
