package compare;

/**
 * 项目名 Java_code
 * <br>包名 compare
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 15:35
 * <br>描述
 */
enum Color{
    RED,BLACK;
}
public class RBBinaryTree<T> {
    private class Node{
        private T data;
        private Node parent;
        private Node left;
        private Node right;
        private Color color;
    }
}
