import static org.junit.Assert.*;
import org.junit.Test;

public class PathTest {

  // Test path [1, 2, 5]
  @Test
  public void testPath0() {
    Path path = new Path(0);
    Node n = new Node(100);
    assertEquals(path.indexOf(n), -1);
  }

  // Test path [1, 2, 3, 2, 5]
  @Test
  public void testPath1() {
    Path path = new Path(1);
    Node n1 = new Node(2);
    Node n2 = new Node(100);
    path.addNode(n1);
    assertEquals(path.indexOf(n2), -1);
  }

  // Test path [1, 2, 3, 2, 3, 4]
  @Test
  public void testPath2() {
    Path path = new Path(2);
    Node n1 = new Node(2);
    Node n2 = new Node(3);
    path.addNode(n1);
    path.addNode(n2);
    assertEquals(path.indexOf(n2), 1);
  }
}