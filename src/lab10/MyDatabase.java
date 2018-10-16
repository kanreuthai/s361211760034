package lab10;

import java.sql.*;

public class MyDatabase {
    public static void main(String[] args) {
        //connectDB();
        MyDatabase myConnect = new MyDatabase();
        myConnect.selectAll();

    }

    private void selectAll(){
        String sql = "select * from user";
        try {
            Connection conn = this.connect();
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery(sql);
            //loop for result set
            while (rs.next()) {
                System.out.println(rs.getInt("ID")+"\t"+
                        rs.getString("name")+"\t"+
                        rs.getString("lastname"));

            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    private Connection connect(){
        Connection conn = null;
        try {

            String url = "jdbc:sqlite:D:\\361211760034\\src\\lab10\\myData.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Database is Connected.");
        } catch (SQLException e){
            e.printStackTrace();
        }
        return  conn;

    }//connect


    private static void connectDB() {

        Connection  conn = null;
        try {

            String url = "jdbc:sqlite:D:\\361211760034\\src\\lab10\\myData.db";
            conn = DriverManager.getConnection(url);
            System.out.println("Database is Connected.");
        } catch (SQLException ex) {
            ex.printStackTrace();
            System.out.println("Can not connecting to Database.");
        }finally {
            try {
                if (conn != null)
                    conn.close();
            } catch (SQLException ex){
                ex.printStackTrace();
            }
        }
    }//

}//class
