package main.java.supermarket.service;

import main.java.supermarket.bean.Commodity;

import java.util.List;

/**
 * @author Susuper
 * @version 1.0
 * @date 2019/11/26 2:47
 * @description
 */
public interface CommodityService {
    List<Commodity> findAll();

    Commodity findOne(Integer id);

    boolean insertCommo(Commodity commodity);

    boolean deleteCommo(Integer id);


    boolean updateCommo(Commodity commodity);

    List<Commodity> findByName(String name);
}
