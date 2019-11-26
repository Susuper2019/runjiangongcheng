package main.java.supermarket.service.impl;

import main.java.supermarket.bean.Commodity;
import main.java.supermarket.dao.CommodityDao;
import main.java.supermarket.service.CommodityService;
import org.springframework.beans.factory.annotation.Autowired;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 2:47
 * @description
 */
public class CommodityServiceImpl implements CommodityService {

    @Autowired
    public CommodityDao commodityDao;
    @Override
    public List<Commodity> findAll() {
        return commodityDao.findAll();
    }

    @Override
    public Commodity findOne(Integer id) {
        return commodityDao.findOne(id);
    }

    @Override
    public boolean insertCommo(Commodity commodity) {
        return commodityDao.insertCommo(commodity);
    }

    @Override
    public boolean deleteCommo(Integer id) {
        return commodityDao.deleteCommo(id);
    }

    @Override
    public boolean updateCommo(Commodity commodity) {
        return commodityDao.updateCommo(commodity);
    }

    @Override
    public List<Commodity> findByName(String name) {
        return commodityDao.findByName(name);
    }
}
