
import java.awt.Point;
class TestPoint {
  public static void main (String args[]) {
    Point thePoint = new Point(10,10);
    System.out.println(“X is “ + thePoint.x);
    System.out.println(“Y is “ + thePoint.y);

    System.out.println(“Setting X to 5.”);
    thePoint.x = 5;
    System.out.println(“Setting y to 15.”);
    thePoint.y = 15;

    System.out.println(“X is “ + thePoint.x);
    System.out.println(“Y is “ + thePoint.y);

  }
}
