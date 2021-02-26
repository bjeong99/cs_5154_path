import java.util.List;
import java.util.ArrayList;

/**
 * Return index of node n at the first positions it appears, -1 if it is not
 * present
 */
public class Path {
  List<Node> l;

  public Path(int size) {
    l = new ArrayList<Node>(size);
  }

  public void addNode(Node n) {
    l.add(n);
  }

  public int indexOf(Node n) {
    for (int i = 0; i < l.size(); i++)
      if (l.get(i).equals(n))
        return i;
    return -1;
  }
}