package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Menu;
import org.morningyet.codehelpergenerator.dao.MenuDao;

@Service
public class MenuService {

    @Resource
    private MenuDao menuDao;

    public int insert(Menu pojo){
        return menuDao.insert(pojo);
    }

    public int insertList(List< Menu> pojos){
        return menuDao.insertList(pojos);
    }

    public List<Menu> select(Menu pojo){
        return menuDao.select(pojo);
    }

    public int update(Menu pojo){
        return menuDao.update(pojo);
    }

}
