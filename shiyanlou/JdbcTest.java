import java.sql.*;
public class JdbcTest{
    static final String JDBC_DRIVER="com.mysql.jdbc.Driver";
    static final String DB_URL="jdbc:mysql://localhost/EXAMPLE";
    static final String USER = "root";
    static final String PASS = "";
    public static void main(String []args){
        Connection conn=null;
        PreparedStatement stmt=null;
        try{
            Class.forName("com.mysql.jdbc.Driver");
            System.out.println("Connecting to database.......");
            conn=DriverManager.getConnection(DB_URL,USER,PASS);
            System.out.println("Creating statement.....");
            String sql = "UPDATE Students set age=? WHERE id=?";
            stmt = conn.prepareStatement(sql);

            stmt.setInt(1,22);
            stmt.setInt(2,1);

            int rows=stmt.executeUpdate();
            System.out.println("被影响的行数"+rows);

            sql="Select id,name,age from Students";
            ResultSet rs=stmt.executeQuery(sql);

            while(rs.next()){
                int id=rs.getInt("id");
                int age=rs.getInt("age");
                String name=rs.getString("Name");

                System.out.print("ID: " + id);
                System.out.print(", Age: " + age);
                System.out.print(", Name: " + name);
                System.out.println();
            }

            rs.close();
            stmt.close();
            conn.close();

        }catch(SQLException se){
           se.printStackTrace();
        }catch(Exception e){
           e.printStackTrace();
        }finally{
        try{
            if(stmt!=null)
                stmt.close();
        }catch(SQLException se2){
        }
        try{
            if(conn!=null)
                conn.close();
        }catch(SQLException se){
              se.printStackTrace();
            }
        }
        System.out.println("Goodbye!");
    }
}
