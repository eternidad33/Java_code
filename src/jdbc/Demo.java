package jdbc;

import java.sql.*;

/**
 * 项目名 Java_code
 * <br>包名 jdbc
 * <br>创建时间 2020/4/9 17:48
 * <br>描述
 *
 * @author Vigilr
 */
public class Demo {
    //JDBC驱动
    static final String JBDC_DRIVER = "com.mysql.jdbc.Driver";
    //数据库地址
    static final String DB_URL = "jdbc:mysql://localhost:3308/test";

    //设置用户名密码
    static final String USER = "root";
    static final String PASS = "123456";

    public static void main(String[] args) throws SQLException {
        Connection conn = null;
        Statement stmt = null;
        try {
            Class.forName(JBDC_DRIVER);
            conn = DriverManager.getConnection(DB_URL, USER, PASS);

            // 执行查询
            System.out.println(" 实例化Statement对象...");
            stmt = conn.createStatement();
            String sql;
            sql = "SELECT id, name, url FROM websites";
            ResultSet rs = stmt.executeQuery(sql);

            // 展开结果集数据库
            while (rs.next()) {
                // 通过字段检索
                int id = rs.getInt("id");
                String name = rs.getString("name");
                String url = rs.getString("url");

                // 输出数据
                System.out.print("ID: " + id);
                System.out.print(", 站点名称: " + name);
                System.out.print(", 站点 URL: " + url);
                System.out.print("\n");
            }
            // 完成后关闭
            rs.close();
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            // 关闭资源
            stmt.close();
            conn.close();
        }
        System.out.println("Goodbye!");
    }
}
