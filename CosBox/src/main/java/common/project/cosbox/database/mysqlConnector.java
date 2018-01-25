package common.project.cosbox.database;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;


public class mysqlConnector {
	public static void main(String[] args) {
        Connection connection = null;
        Statement st = null;
        try {
            Class.forName("com.mysql.jdbc.Driver");
            connection = DriverManager.getConnection("jdbc:mysql://localhost:3306/cosbox" , "root", "cosbox");
            st = connection.createStatement();
 
            String sql;
            sql = "select * FROM member;";
 
            ResultSet rs = st.executeQuery(sql);
 
            while (rs.next()) {
                String sqlRecipeProcess = rs.getString("memberID");
                System.out.println("test :"+sqlRecipeProcess);
            }
 
            rs.close();
            st.close();
            connection.close();
        } catch (SQLException se1) {
            se1.printStackTrace();
        } catch (Exception ex) {
            ex.printStackTrace();
        } finally {
            try {
                if (st != null)
                    st.close();
            } catch (SQLException se2) {
            }
            try {
                if (connection != null)
                    connection.close();
            } catch (SQLException se) {
                se.printStackTrace();
            }
        }    
    }
}
