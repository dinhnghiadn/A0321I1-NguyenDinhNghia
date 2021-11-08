package model.repositories.impl;

import model.bean.BenhAn;
import model.repositories.BenhAnRepository;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class BenhAnRepositoryImpl implements BenhAnRepository {
    private String jdbcURL = "jdbc:mysql://localhost:3306/final_exam?useSSL=false";
    private String jdbcUsername = "root";
    private String jdbcPassword = "12345678";

    private static final String SELECT_ALL_BENHBAN = "select * from benhan inner join benhnhan where benhan.idbenhnhan = benhnhan.idbenhnhan";
    private static final String SELECT_BENHAN_BY_ID = "select * from benhan inner join benhnhan where benhan.idbenhnhan = benhnhan.idbenhnhan and id = ?";
    private static final String UPDATE_BENHAN_SQL = "update benhan set nhapvien = ?, xuatvien= ?, `lydo` = ? where id = ?";
    private static final String DELETE_BENHAN = "delete from benhan where (`id` = ?)";
    public BenhAnRepositoryImpl() {
    }

    @Override
    public List<BenhAn> findAll() {
        List<BenhAn> benhAns = new ArrayList<>();
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (PreparedStatement preparedStatement = connection.prepareStatement(SELECT_ALL_BENHBAN);) {
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();
                while (rs.next()) {
                    int id = rs.getInt("id");
                    int idBenhNhan = rs.getInt("idbenhnhan");
                    String nhapVien = rs.getString("nhapvien");
                    String xuatVien = rs.getString("xuatvien");
                    String lydo = rs.getString("lydo");
                    String tenBenhNhan = rs.getString("hoten");
                    benhAns.add(new BenhAn(id, idBenhNhan,tenBenhNhan,nhapVien,xuatVien,lydo));
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
        return benhAns;
    }

    @Override
    public BenhAn findById(int id) {
        BenhAn benhAn = null;
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (
                    PreparedStatement preparedStatement = connection.prepareStatement(SELECT_BENHAN_BY_ID);) {
                preparedStatement.setInt(1, id);
                System.out.println(preparedStatement);
                ResultSet rs = preparedStatement.executeQuery();

                while (rs.next()) {
                    String tenBenhNhan = rs.getString("hoten");
                    String nhapVien = rs.getString("nhapvien");
                    String xuatVien = rs.getString("xuatvien");
                    String lyDo = rs.getString("lydo");
                    int idBenhNhan = rs.getInt("idbenhnhan");
                    benhAn = new BenhAn(id, idBenhNhan, tenBenhNhan,nhapVien,xuatVien,lyDo);
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
        return benhAn;
    }

    @Override
    public void deleteBenhAn(int id) {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try {
                PreparedStatement preparedStatement = connection.prepareStatement(DELETE_BENHAN);
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


    @Override
    public void updateBenhAn(BenhAn benhAn) throws SQLException {
        Connection connection = DBConnection.getConnection();
        if (connection != null) {
            try (PreparedStatement statement = connection.prepareStatement(UPDATE_BENHAN_SQL);) {
                statement.setString(1, benhAn.getNhapVien());
                statement.setString(2, benhAn.getXuatVien());
                statement.setString(3, benhAn.getLyDo());
                statement.setInt(4, benhAn.getId());
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
    public void insertBenhAn(BenhAn benhAn) throws SQLException {

    }
}
