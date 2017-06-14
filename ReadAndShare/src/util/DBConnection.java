package util;

import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;

import com.mysql.jdbc.Connection;
import com.mysql.jdbc.PreparedStatement;

public class DBConnection {
	private static Connection conn = null;   
	  
    // connect to MySQL  
    public static void connSQL() {  
        String url = "jdbc:mysql://localhost:3306/readandshare?characterEncoding=UTF-8";  
        String username = "root";  
        String password = "951120"; // 加载驱动程序以连接<a href="http://lib.csdn.net/base/mysql" class='replace_word' title="MySQL知识库" target='_blank' style='color:#df3434; font-weight:bold;'>数据库</a>   
        try {   
            Class.forName("com.mysql.jdbc.Driver" );   
            conn = (Connection) DriverManager.getConnection( url,username, password );
            System.out.println("连接数据库成功");  
        }  
        //捕获加载驱动程序异常  
         catch ( ClassNotFoundException cnfex ) {  
             System.err.println(  
             "装载 JDBC/ODBC 驱动程序失败。" );  
             cnfex.printStackTrace();   
         }   
         //捕获连接数据库异常  
         catch ( SQLException sqlex ) {  
             System.err.println( "无法连接数据库" );  
             sqlex.printStackTrace();   
         }  
    }  
  
    // disconnect to MySQL  
    public static void deconnSQL() {  
        try {  
            if (conn != null)  
                conn.close();  
            System.out.println("关闭数据库成功");  
        } catch (Exception e) {  
            System.out.println("关闭数据库问题 ：");  
            e.printStackTrace();  
        }  
    }  
  
    // execute selection language  
    public static ResultSet selectSQL(String sql) {  
        ResultSet rs = null;  
        try {  
        	PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);  
            rs = statement.executeQuery(sql);
            System.out.println("查询数据库成功");  
        } catch (SQLException e) {  
            e.printStackTrace();  
        }  
        return rs;  
    }  
  
    // execute insertion language  
    public static boolean insertSQL(String sql) {  
        try {  
        	PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);  
            statement.executeUpdate();
            System.out.println("插入数据库成功");  
            return true;  
        } catch (SQLException e) {  
            System.out.println("插入数据库时出错：");  
            e.printStackTrace();  
        } catch (Exception e) {  
            System.out.println("插入时出错：");  
            e.printStackTrace();  
        }  
        return false;  
    }  
    //execute delete language  
    public static boolean deleteSQL(String sql) {  
        try {  
        	PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);  
            statement.executeUpdate();
            System.out.println("删除数据库成功");  
            return true;  
        } catch (SQLException e) {  
            System.out.println("删除数据库时出错：");  
            e.printStackTrace();  
        } catch (Exception e) {  
            System.out.println("删除时出错：");  
            e.printStackTrace();  
        }  
        return false;  
    }  
    //execute update language  
    public static boolean updateSQL(String sql) {  
        try {  
        	PreparedStatement statement = (PreparedStatement) conn.prepareStatement(sql);  
            statement.executeUpdate();
            System.out.println("更新数据库成功");
            return true;  
        } catch (SQLException e) {  
            System.out.println("更新数据库时出错：");  
            e.printStackTrace();  
        } catch (Exception e) {  
            System.out.println("更新时出错：");  
            e.printStackTrace();  
        }  
        return false;  
    }  
}	
