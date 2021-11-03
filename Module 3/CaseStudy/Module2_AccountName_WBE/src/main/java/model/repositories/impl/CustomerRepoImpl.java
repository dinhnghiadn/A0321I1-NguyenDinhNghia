package model.repositories.impl;

import model.bean.Customer;
import model.repositories.CustomerRepository;

import java.sql.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;

public class CustomerRepoImpl implements CustomerRepository {

    private String jdbcURL = "jdbc:mysql://localhost:3306/case_study_database?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345678";

    private static final String SELECT_ALL_CUSTOMERS = "select * from khachhang";
    private static final String INSERT_CUSTOMERS_SQL = "INSERT INTO khachhang" + "  (idkhachhang, hoten, ngaysinh, gioitinh, socmnd, sdt, email, diachi, idloaikhach) VALUES " +
            " (?, ?, ?, ?, ?, ?, ?, ?, ?);";
    private static final String SELECT_CUSTOMER_BY_ID = "select * from khachhang where idkhachhang =?";
    private static final String UPDATE_CUSTOMERS_SQL = "update khachhang set hoten = ?, ngaysinh = ?, gioitinh = ?, socmnd = ?, sdt = ?, email= ?, diachi =?, idloaikhach = ? where idkhachhang = ?;";
    private static final String DELETE_CUSTOMER = "DELETE FROM khachhang WHERE (`idkhachhang` = ?)";

    public CustomerRepoImpl() {
    }

    //    protected Connection getConnection() {
//        Connection connection = null;
//        try {
//            Class.forName("com.mysql.jdbc.Driver");
//            connection = DriverManager.getConnection(jdbcURL, jdbcUsername, jdbcPassword);
//
//        } catch (SQLException e) {
//            e.printStackTrace();
//        } catch (ClassNotFoundException e) {
//            e.printStackTrace();
//        }
//        return connection;
//    }
    @Override
    public void updateCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(UPDATE_CUSTOMERS_SQL);) {
                statement.setString(1, customer.getName());
                statement.setString(2, customer.getBirthday());
                statement.setString(3, customer.getGender());
                statement.setString(4, customer.getIdCard());
                statement.setString(5, customer.getPhone());
                statement.setString(6, customer.getEmail());
                statement.setString(7, customer.getAddress());
                statement.setInt(8, customer.getTypeId());
                statement.setInt(9, customer.getId());
                System.out.println(statement);
                statement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    @Override
    public void insertCustomer(Customer customer) {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(INSERT_CUSTOMERS_SQL)) {
                preparedStatement.setInt(1, customer.getId());
                preparedStatement.setString(2, customer.getName());
                preparedStatement.setString(3, customer.getBirthday());
                preparedStatement.setString(4, customer.getGender());
                preparedStatement.setString(5, customer.getIdCard());
                preparedStatement.setString(6, customer.getPhone());
                preparedStatement.setString(7, customer.getEmail());
                preparedStatement.setString(8, customer.getAddress());
                preparedStatement.setInt(9, customer.getTypeId());
                System.out.println(preparedStatement);
                preparedStatement.executeUpdate();
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }

    public List<Customer> findAll() {
        List<Customer> customers = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_CUSTOMERS);) {
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("idkhachhang");
                    String name = rs.getString("hoten");
                    String birthday = rs.getString("ngaysinh");
                    String gender = rs.getString("gioitinh");
                    String idCard = rs.getString("socmnd");
                    String phone = rs.getString("sdt");
                    String email = rs.getString("email");
                    String address = rs.getString("diachi");
                    int typeId = rs.getInt("idloaikhach");

                    customers.add(new Customer(id, name, birthday, gender, idCard, phone, email, address, typeId));
                }
            } catch (SQLException e) {
                e.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return customers;
    }


    @Override
    public void deleteCustomer(int id) {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_CUSTOMER);
                preparedStatement.setInt(1, id);
                preparedStatement.executeUpdate();
            } catch (SQLException throwables) {
                throwables.printStackTrace();
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
    }


    @Override
    public Customer findById(int id) {
        Customer customer = null;
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (
                    PreparedStatement preparedStatement = connection.prepareStatement(SELECT_CUSTOMER_BY_ID);) {
                preparedStatement.setInt(1, id);
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    String name = rs.getString("hoten");
                    String birthday = rs.getString("ngaysinh");
                    String gender = rs.getString("gioitinh");
                    String idCard = rs.getString("socmnd");
                    String phone = rs.getString("sdt");
                    String email = rs.getString("email");
                    String address = rs.getString("diachi");
                    int typeId = rs.getInt("idloaikhach");
                    customer = new Customer(id, name, birthday, gender, idCard, phone, email, address, typeId);
                }
            } catch (SQLException e) {
                printSQLException(e);
            } finally {
                try {
                    connection.close();
                } catch (SQLException throwables) {
                    throwables.printStackTrace();
                }
            }
        }
        return customer;
    }

    private void printSQLException(SQLException ex) {
        for (Throwable e : ex) {
            if (e instanceof SQLException) {
                e.printStackTrace(System.err);
                System.err.println("SQLState: " + ((SQLException) e).getSQLState());
                System.err.println("Error Code: " + ((SQLException) e).getErrorCode());
                System.err.println("Message: " + e.getMessage());
                Throwable t = ex.getCause();
                while (t != null) {
                    System.out.println("Cause: " + t);
                    t = t.getCause();
                }
            }
        }
    }

}
