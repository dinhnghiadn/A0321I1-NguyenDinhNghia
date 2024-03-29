package model.repositories;

import model.bean.User;

import java.sql.SQLException;
import java.util.List;

public interface IUserDAO {
    public void addUserTransaction(User user, int[] permision);
    public void insertUser(User user) throws SQLException;

    public User selectUser(int id);

    public List<User> selectAllUsers();
    public List<User> selectAllUsersOrderName();
    public List<User> findUsersByCountry(String country);

    public boolean deleteUser(int id) throws SQLException;

    public boolean updateUser(User user) throws SQLException;
}