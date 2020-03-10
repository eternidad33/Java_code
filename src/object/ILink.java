package object;

/**
 * @author Vigilr
 * @project Java_code
 * @package object
 * @time 2020/3/8 18:02
 */
public interface ILink<E> {
    /**
     * @Description:
     * @Param: [e]
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/10
     */
    public void add(E e);

    /**
     * @Description:
     * @Param: []
     * @return: int
     * @Author: vigilr
     * @Date: 2020/3/10
     */
    public int size();

    public boolean isEmpty();

    public Object[] toArray();

    /**
     * @Description:
     * @Param: [index]
     * @return: E
     * @Author: vigilr
     * @Date: 2020/3/10
     */
    public E get(int index);

    /**
     * @Description:
     * @Param: [index, value]
     * @return: void
     * @Author: vigilr
     * @Date: 2020/3/10
     */
    public void set(int index, E value);

    public boolean contains(E data);

    public void remove(E data);

    public void clean();
}
