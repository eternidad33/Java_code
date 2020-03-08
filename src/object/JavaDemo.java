package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020-03-01 12:35 pm
 */
class Node<E> {
    private E data;
    private Node nextNode;

    public Node(E data) {
        this.data = data;
    }

    public E getData() {
        return data;
    }

    public void setData(E data) {
        this.data = data;
    }

    public Node getNextNode() {
        return nextNode;
    }

    public void setNextNode(Node nextNode) {
        this.nextNode = nextNode;
    }
}

public class JavaDemo {
    public static void main(String[] args) {
        Node<String> n1 = new Node<>("表头");
        Node<String> n2 = new Node<>("表1");
        Node<String> n3 = new Node<>("表2");
        Node<String> n4 = new Node<>("表3");
        Node<String> n5 = new Node<>("表尾");
        n1.setNextNode(n2);
        n2.setNextNode(n3);
        n3.setNextNode(n4);
        n4.setNextNode(n5);
        print(n1);
    }

    public static void print(Node<?> n) {
        if (n != null) {
            System.out.println(n.getData());
            print(n.getNextNode());
        }

    }
}