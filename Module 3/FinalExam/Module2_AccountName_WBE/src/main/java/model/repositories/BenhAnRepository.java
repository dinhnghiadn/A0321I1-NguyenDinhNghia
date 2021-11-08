package model.repositories;

import model.bean.BenhAn;

import java.sql.SQLException;
import java.util.List;

public interface BenhAnRepository {
    List<BenhAn> findAll();
    BenhAn findById(int id);
    void deleteBenhAn(int id);
    void updateBenhAn (BenhAn benhAn) throws SQLException;
    void insertBenhAn(BenhAn benhAn) throws SQLException;
}
