import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

class StudentDAO {

    String url =
            "jdbc:mysql://localhost:3306/studentdb";

    String username = "root";
    String password = "root";

    public void insertStudent(
            int id,
            String name
    ) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            String sql =
                    "INSERT INTO students VALUES (?, ?)";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setInt(1, id);
            ps.setString(2, name);

            ps.executeUpdate();

            con.close();

            System.out.println(
                    "Student Inserted"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }

    public void updateStudent(
            int id,
            String name
    ) {

        try {

            Connection con =
                    DriverManager.getConnection(
                            url,
                            username,
                            password
                    );

            String sql =
                    "UPDATE students SET name=? WHERE id=?";

            PreparedStatement ps =
                    con.prepareStatement(sql);

            ps.setString(1, name);
            ps.setInt(2, id);

            ps.executeUpdate();

            con.close();

            System.out.println(
                    "Student Updated"
            );

        } catch (Exception e) {

            e.printStackTrace();
        }
    }
}

public class Exercise32 {

    public static void main(String[] args) {

        StudentDAO dao = new StudentDAO();

        dao.insertStudent(101, "Ravi");

        dao.updateStudent(101, "Ravi Kumar");
    }
}