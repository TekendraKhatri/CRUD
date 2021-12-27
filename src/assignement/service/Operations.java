package assignement.service;

import assignement.db.Connection;
import assignement.entity.Employee;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class Operations {
    Connection connection = new Connection();

    public void insert(Employee e) throws SQLException, ClassNotFoundException {
        System.out.println("Inserting");
        java.sql.Connection con = connection.getConnection();
        Statement statement = con.createStatement();
        String insert = "INSERT INTO Employee (ID, LastName, FirstName, Age , Address, Phone, Email , Designation, Salary) " +
                "VALUES ('" + e.getId() + "', '" + e.getLastName() + "', '" + e.getFirstName() + "', '" + e.getAge() + "', '" + e.getAddress() + "'," +
                " '" + e.getPhone() + "', '" + e.getEmail() + "' , '" + e.getDesignation() + "' , '" + e.getSalary() + "')";
        statement.executeUpdate(insert);
        con.close();
        System.out.println("Inserted employ" + e);
    }

    public void readAll() throws SQLException, ClassNotFoundException {
        java.sql.Connection con = connection.getConnection();
        System.out.println("read");
        String read = "SELECT * FROM Employee";
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(read);
        System.out.println("Employe details :");
        while (resultSet.next()) {
            System.out.println("ID -" + resultSet.getInt("ID"));
            System.out.println("LastName -" + resultSet.getString("lastName"));
            System.out.println("FirstName -" + resultSet.getString("firstName"));
            System.out.println("Age -" + resultSet.getInt("age"));
            System.out.println("Address -" + resultSet.getString("address"));
            System.out.println("Phone -" + resultSet.getString("phone"));
            System.out.println("email- " + resultSet.getString("email"));
            System.out.println("Designation-" + resultSet.getString("designation"));
            System.out.println("Salary -" + resultSet.getInt("salary"));
            System.out.println(" -----------------------------------------------");
        }
        con.close();
    }

    public void readOne(int id) throws SQLException, ClassNotFoundException {
        java.sql.Connection con = connection.getConnection();
        System.out.println("read One");
        String read = "SELECT * FROM Employee where ID =" + id;
        Statement statement = con.createStatement();
        ResultSet resultSet = statement.executeQuery(read);
        System.out.println("Employe details :");
        while (resultSet.next()) {
            System.out.println("ID -" + resultSet.getInt("ID"));
            System.out.println("LastName -" + resultSet.getString("lastName"));
            System.out.println("FirstName -" + resultSet.getString("firstName"));
            System.out.println("Age -" + resultSet.getInt("age"));
            System.out.println("Address -" + resultSet.getString("address"));
            System.out.println("Phone -" + resultSet.getString("phone"));
            System.out.println("email- " + resultSet.getString("email"));
            System.out.println("Designation-" + resultSet.getString("designation"));
            System.out.println("Salary -" + resultSet.getInt("salary"));
        }
        con.close();
    }

    public void update() throws SQLException, ClassNotFoundException {
        java.sql.Connection con = connection.getConnection();
        Statement statement = con.createStatement();
        String updateSalary = "UPDATE Employee set salary = 10000 where salary<5000";
        statement.executeUpdate(updateSalary);
        con.close();
        System.out.println("Record updated");
    }

    public void delete(int id) throws SQLException, ClassNotFoundException {
        System.out.println(" delete");
        java.sql.Connection con = connection.getConnection();
        Statement statement = con.createStatement();
        String delete = "DELETE FROM Employee where ID =" + id;
        statement.executeUpdate(delete);
        con.close();
        System.out.println("Employe record deleted for id :" + id);
    }
}
