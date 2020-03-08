package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/8 18:02
 */
public interface ILink<E> {
    public void add(E e);

    public int size();

    public boolean isEmpty();

    public Object[] toArray();

    public E get(int index);

    public void set(int index, E value);

    public boolean contains(E data);

    public void remove(E data);

    public void clean();
}
