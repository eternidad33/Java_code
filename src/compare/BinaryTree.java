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
            //新节点的数据小于当前节点，保存在左子树
            if (newNode.data.compareTo((T) this.data) <= 0) {
                //左子树为空，直接添加
                if (this.left == null) {
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
            //有左子树，递归调用
            if (this.left != null) {
                this.left.toArrayNode();
            }
            BinaryTree.this.returnData[BinaryTree.this.foot++] = this.data;
            if (this.right != null) {
                this.right.toArrayNode();
            }
        }

        //判断当前节点是否是父节点的左节点
        public boolean isLeft() {
            if (this.parent != null) {
                if (this.parent.left == this) {
                    return true;
                } else {
                    return false;
                }
            } else {
                return false;
            }
        }

        public boolean containsNode(Comparable<T> data) {
            if (data.compareTo((T) this.data) == 0) {
                return true;
            } else if (data.compareTo((T) this.data) < 0) {
                if (this.left != null) {
                    return this.left.containsNode(data);
                } else {
                    return false;
                }
            } else {
                if (this.right != null) {
                    return this.right.containsNode(data);
                } else {
                    return false;
                }
            }
        }

        public Node getRemoveNode(Comparable<T> data) {
            if (data.compareTo((T) this.data) == 0) {
                return this;
            } else if (data.compareTo((T) this.data) < 0) {
                if (this.left != null) {
                    return this.left.getRemoveNode(data);
                } else {
                    return null;
                }
            } else {
                if (this.right != null) {
                    return this.right.getRemoveNode(data);
                } else {
                    return null;
                }
            }
        }
    }

    private Node root;//保存根节点
    private int count;//保存节点个数
    private Object[] returnData;//返回的数据
    private int foot = 0;

    /**
     * 增加数据
     *
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
     *
     * @param: []
     * @return: java.lang.Object[]
     */
    public Object[] toArray() {
        if (this.count == 0) {
            return null;
        }
        this.returnData = new Object[this.count];
        this.foot = 0;
        this.root.toArrayNode();
        return this.returnData;
    }

    public boolean contains(Comparable<T> data) {
        return this.root.containsNode(data);
    }

    public void remove(Comparable<T> data) {
        if (this.root == null) {
            return;
        } else {
            if (this.root.data.compareTo((T) data) == 0) {
                //删除根节点
                Node moveNode = this.root.right;
                while (moveNode.left != null) {
                    moveNode = moveNode.left;
                }
                moveNode.left = this.root.left;
                moveNode.right = this.root.right;
                moveNode.parent.left = null;
                this.root = moveNode;
            } else {
                Node removeNode = this.root.getRemoveNode(data);
                if (removeNode != null) {
                    //删除叶子节点
                    if (removeNode.left == null && removeNode.right == null) {
                        if (removeNode.isLeft()) {
                            removeNode.parent.left = null;
                        } else {
                            removeNode.parent.right = null;
                        }
                        removeNode.parent = null;
                        //只有左子树
                    } else if (removeNode.left != null && removeNode.right == null) {
                        if (removeNode.isLeft()) {
                            removeNode.parent.left = removeNode.left;
                        } else {
                            removeNode.parent.right = removeNode.left;
                        }
                        removeNode.left.parent = removeNode.parent;
                        //只有右子树
                    } else if (removeNode.left == null && removeNode.right != null) {
                        if (removeNode.isLeft()) {
                            removeNode.parent.left = removeNode.right;
                        } else {
                            removeNode.parent.right = removeNode.right;
                        }
                        removeNode.right.parent = removeNode.parent;
                        //两边都有节点
                    } else {
                        Node moveNode = removeNode.right;
                        while (moveNode.left != null) {
                            moveNode = moveNode.left;
                        }
                        //右子树最左边节点断开连接
                        removeNode.parent.left = moveNode;
                        moveNode.parent.left = null;
                        moveNode.parent = removeNode.parent;
                        moveNode.right = removeNode.right;
                        moveNode.left = removeNode.left;
                    }
                }
            }
            this.count--;
        }
    }
}
