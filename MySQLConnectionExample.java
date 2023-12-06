import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import java.sql.Statement;

public class MySQLConnectionExample extends {
    // JDBC URL, username, and password of MySQL server
    private static final String JDBC_URL = "jdbc:mysql://localhost:3306/java_practice";
    private static final String USER = "root";
    private static final String PASSWORD = "root";

    public static void main(String[] args) {
        try {
            // Load the MySQL JDBC driver
            Class.forName("com.mysql.cj.jdbc.Driver");

            // Establish a connection
            try (Connection connection = DriverManager.getConnection(JDBC_URL, USER, PASSWORD)) {
                System.out.println("Connected to the database!");

                // Create the 'student' table (if it doesn't exist)
                createStudentTable(connection);

                // Insert a new student
                int newStudentId = insertStudent(connection, "John Doe", 20);
                System.out.println("Inserted student with ID: " + newStudentId);

                // Update the student's age
                updateStudentAge(connection, newStudentId, 21);

                // Select and display all students
                selectAllStudents(connection);

                // Delete the student
                deleteStudent(connection, newStudentId);

                // Select and display all students after deletion
                selectAllStudents(connection);
            }

        } catch (ClassNotFoundException | SQLException e) {
            e.printStackTrace();
        }
    }

    private static void createStudentTable(Connection connection) throws SQLException {
        String createTableSQL = "CREATE TABLE IF NOT EXISTS student (id INT PRIMARY KEY AUTO_INCREMENT, name VARCHAR(50), age INT);";
        try (Statement statement = connection.createStatement()) {
            statement.execute(createTableSQL);
        }
    }

    private static int insertStudent(Connection connection, String name, int age) throws SQLException {
        String insertSQL = "INSERT INTO student (name, age) VALUES (?, ?);";
        try (PreparedStatement preparedStatement = connection.prepareStatement(insertSQL, Statement.RETURN_GENERATED_KEYS)) {
            preparedStatement.setString(1, name);
            preparedStatement.setInt(2, age);
            preparedStatement.executeUpdate();

            try (ResultSet generatedKeys = preparedStatement.getGeneratedKeys()) {
                if (generatedKeys.next()) {
                    return generatedKeys.getInt(1); // Return the auto-generated ID
                } else {
                    throw new SQLException("Insert failed, no ID obtained.");
                }
            }
        }
    }

    private static void updateStudentAge(Connection connection, int studentId, int newAge) throws SQLException {
        String updateSQL = "UPDATE student SET age = ? WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(updateSQL)) {
            preparedStatement.setInt(1, newAge);
            preparedStatement.setInt(2, studentId);
            preparedStatement.executeUpdate();
        }
    }

    private static void deleteStudent(Connection connection, int studentId) throws SQLException {
        String deleteSQL = "DELETE FROM student WHERE id = ?";
        try (PreparedStatement preparedStatement = connection.prepareStatement(deleteSQL)) {
            preparedStatement.setInt(1, studentId);
            preparedStatement.executeUpdate();
        }
    }

    private static void selectAllStudents(Connection connection) throws SQLException {
        String selectSQL = "SELECT * FROM student";
        try (Statement statement = connection.createStatement();
             ResultSet resultSet = statement.executeQuery(selectSQL)) {

            System.out.println("Student Data:");
            while (resultSet.next()) {
                int id = resultSet.getInt("id");
                String name = resultSet.getString("name");
                int age = resultSet.getInt("age");
                System.out.println("ID: " + id + ", Name: " + name + ", Age: " + age);
            }
            System.out.println();
        }
    }
}