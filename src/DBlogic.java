import java.sql.*;

public class DBlogic {

    String DB = "jdbc:mysql://localhost:3306/07_crud";
    String USER = "root";
    String PASS = "biskviits";

    // insert
    public void insert() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "INSERT INTO users (email, name) VALUES ('test@test.lv', 'Test')";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir ievadīti");


        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    // delete
    public void delete() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "DELETE FROM users WHERE id = 2";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir izdzēsti");


        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    // update
    public void update() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();

            String sql = "UPDATE users SET email = 'hei@hei.lv' WHERE id = 3";

            stmt.executeUpdate(sql);

            System.out.println("Dati ir atjaunoti");


        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

    // select
    public void select() {

        try {

            Connection conn = DriverManager.getConnection(DB, USER, PASS);
            Statement stmt = conn.createStatement();
            ResultSet rs = stmt.executeQuery("SELECT id, email, name FROM users");

            while(rs.next()) {

                System.out.println("id: " + rs.getInt("id"));
                System.out.println("e-mail: " + rs.getString("email"));
                System.out.println("name: " + rs.getString("name"));
                System.out.println(" ");

            }


        } catch(SQLException e) {
            e.printStackTrace();
        }

    }

}
