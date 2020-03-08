package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/7 20:56
 */
interface ILink<E> {
    public void add(E e);

    public int size();

    public boolean isEmpty();

    public Object[] toArray();

    public E get(int index);

    public void set(int index, E value);

    public boolean contains(E data);
}

class LinkImpl<E> implements ILink<E> {
    private Node root;


    private int count;
    private int foot;
    private Object[] returnData;

    @Override
    public void add(E e) {
        if (e == null) {   //添加的元素为空
            return;
        }
        Node newNode = new Node(e);
        if (this.root == null) {   //如果没有根节点
            this.root = newNode;
        } else {
            this.root.addNode(newNode);
        }
        this.count++;
    }

    @Override
    public int size() {
        return this.count;
    }

    @Override
    public boolean isEmpty() {
//        return this.root==null;
        return this.count == 0;
    }

    @Override
    public Object[] toArray() {
        if (this.isEmpty()) {
            return null;
        }
        this.foot = 0;
        this.returnData = new Object[this.count];
        this.root.toArrayNode();
        return this.returnData;
    }

    @Override
    public E get(int index) {
        if (index > this.count) {
            return null;
        }
        this.foot = 0;
        return this.root.getNode(index);
    }

    @Override
    public void set(int index, E value) {
        if (index > this.count) {
            return;
        }
        this.foot = 0;
        this.root.setNode(index, value);
    }

    @Override
    public boolean contains(E data) {
        if (data == null) {
            return false;
        }
        return this.root.containsNode(data);
    }

    private class Node {
        private E data;
        private Node nextNode;

        public Node(E data) {
            this.data = data;
        }

        public void addNode(Node newNode) {
            if (this.nextNode == null) {
                this.nextNode = newNode;
            } else {
                this.nextNode.addNode(newNode);
            }
        }

        public void toArrayNode() {
            LinkImpl.this.returnData[LinkImpl.this.foot++] = this.data;
            if (this.nextNode != null) {
                this.nextNode.toArrayNode();
            }
        }

        public E getNode(int index) {
            if (LinkImpl.this.foot++ == index) {
                return this.data;
            } else {
                return this.nextNode.getNode(index);
            }
        }

        public void setNode(int index, E value) {
            if (LinkImpl.this.foot++ == index) {
                this.data = value;
            } else {
                this.nextNode.setNode(index, value);
            }
        }

        public boolean containsNode(E data) {
            if (this.data.equals(data)) {
                return true;
            } else {
                if (this.nextNode == null) {
                    return false;
                } else {
                    return this.nextNode.containsNode(data);
                }
            }

        }
    }
}

public class LinkDemo {
    public static void main(String[] args) {
        ILink<String> person = new LinkImpl<>();
        System.out.println("【增加之前】" + person.size() + ",是否为空：" + person.isEmpty());
        person.add("hello");
        person.add("java");
        person.add("!");
        System.out.println("【增加之后】" + person.size() + ",是否为空：" + person.isEmpty());
        for (Object obj : person.toArray()) {
            System.out.println(obj);
        }
        System.out.println("--------------------------------");
        System.out.println(person.get(0));
        System.out.println(person.get(1));
        System.out.println(person.get(2));
        person.set(1, "Python");
        System.out.println(person.get(1));
        System.out.println(person.contains("hello"));
        System.out.println(person.contains("java"));
    }
}
