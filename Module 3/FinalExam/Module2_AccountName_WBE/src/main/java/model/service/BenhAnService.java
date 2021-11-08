package model.service;

import model.bean.BenhAn;

import java.sql.SQLException;
import java.util.List;
import java.util.Map;

public interface BenhAnService {
    List<BenhAn> findAll();
    BenhAn findById(int id);
    void save(BenhAn benhAn) throws SQLException;
    void delete(int id) throws SQLException;
    Map<String,String> create(BenhAn benhAn) throws SQLException;
}
