package model.service.impl;

import model.bean.BenhAn;
import model.repositories.BenhAnRepository;
import model.repositories.impl.BenhAnRepositoryImpl;
import model.service.BenhAnService;
import model.service.common.Validator;

import java.sql.SQLException;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class BenhAnServiceImpl implements BenhAnService {
    BenhAnRepository benhAnRepository = new BenhAnRepositoryImpl();

    @Override
    public List<BenhAn> findAll() {
        return benhAnRepository.findAll();
    }

    @Override
    public BenhAn findById(int id) {
        return benhAnRepository.findById(id);
    }

    @Override
    public void save(BenhAn benhAn) throws SQLException {
            benhAnRepository.updateBenhAn(benhAn);


    }

    @Override
    public void delete(int id) throws SQLException {
        benhAnRepository.deleteBenhAn(id);
    }

    @Override
    public Map<String, String> create(BenhAn customer) throws SQLException {
        return null;
    }
}
