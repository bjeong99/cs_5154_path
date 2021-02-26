public class Node {
  int num;

  public Node(int n) {
    num = n;
  }

  public boolean equals(Node n1, Node n2) {
    return n1.num == n2.num;
  }
}
