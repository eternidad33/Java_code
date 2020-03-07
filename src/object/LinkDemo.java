package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/7 20:56
 */
interface ILink<E>{
    public void add(E e);
}
class LinkImpl<E> implements ILink<E>{
    private Node root;
    @Override
    public void add(E e) {
        if(e==null) {   //添加的元素为空
            return;
        }
        Node newNode=new Node(e);
        if (this.root==null){   //如果没有根节点
            this.root=newNode;
        }else{
            this.root.addNode(newNode);
        }
    }
    private class Node{
        private E data;
        private Node nextNode;
        public Node(E data){
            this.data=data;
        }
        public void addNode(Node newNode){
            if(this.nextNode==null){
                this.nextNode=newNode;
            }else {
                this.nextNode.addNode(newNode);
            }
        }
    }
}

public class LinkDemo {
    public static void main(String[] args) {
        ILink<String> person=new LinkImpl<>();
        person.add("hello");
        person.add("java");
        person.add("!");
    }
}
