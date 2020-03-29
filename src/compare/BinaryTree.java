package compare;

/**
 * 项目名 Java_code
 * <br>包名 compare
 * <br>作者 Vigilr
 * <br>创建时间 2020/3/29 11:08
 * <br>描述
 */
public class BinaryTree<T extends Comparable<T>> {
    private class Node {
        private Comparable<T> data; //存放Comparable，用于比较大小
        private Node parent;    //保存父节点
        private Node left;    //保存左子树
        private Node right;    //保存右子树

        public Node(Comparable<T> data) {//构造方法用于数据的存储
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (newNode.data.compareTo((T) this.data) <= 0) {//新节点的数据小于当前节点，保存在左子树
                if (this.left == null) {//左子树为空，直接添加
                    this.left = newNode;
                    newNode.parent = this;
                } else {
                    this.left.addNode(newNode);
                }
            } else {
                if (this.right == null) {
                    this.right = newNode;
                    newNode.parent = this;
                } else {
                    this.right.addNode(newNode);
                }
            }
        }

        public void toArrayNode() {
            if (this.left != null) {//有左子树，递归调用
                this.left.toArrayNode();
            }
            BinaryTree.this.returnData[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode();
            }
        }
    }

    private Node root;//保存根节点
    private int count;//保存节点个数
    private Object[] returnData;//返回的数据
    private int foot=0;

    /**
     * 增加数据
     * @param: [data]
     * @return: void
     */
    public void add(Comparable<T> data) {
        if (data == null) {
            throw new NullPointerException("不能存放空数据");
        }
        Node newNode = new Node(data);//保存节点
        if (this.root == null) {
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    /**
     * 返回对象数组
     * @param: []
     * @return: java.lang.Object[]
     */
    public Object[] toArray() {
        if (this.count == 0) {
            return null;
        }
        this.returnData=new Object[this.count];
        this.foot = 0;
        this.root.toArrayNode();
        return this.returnData;
    }
}
