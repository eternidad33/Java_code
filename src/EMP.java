/**
 * @author Vigilr
 * @project Java_code
 * @package PACKAGE_NAME
 * @time 2020-02-25 11:45 pm
 */
public class EMP {
    private long id;
    private String name;
    private String dept;
    private double salary;

    public EMP(long id, String name, String dept, double salary) {
        this.id = id;
        this.name = name;
        this.dept = dept;
        this.salary = salary;
    }

    public EMP(long id, String name, String dept){
        this(id,name,dept,0.0);
    }

    public EMP(long id, String name) {
        this(id,name,null,0.0);
    }

    public EMP(long id) {
        this(id,null,null,0.0);
    }

    public EMP() {
        this(0,null,null,0.0);
    }
}
