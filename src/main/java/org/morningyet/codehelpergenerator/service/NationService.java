package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Nation;
import org.morningyet.codehelpergenerator.dao.NationDao;

@Service
public class NationService {

    @Resource
    private NationDao nationDao;

    public int insert(Nation pojo){
        return nationDao.insert(pojo);
    }

    public int insertList(List< Nation> pojos){
        return nationDao.insertList(pojos);
    }

    public List<Nation> select(Nation pojo){
        return nationDao.select(pojo);
    }

    public int update(Nation pojo){
        return nationDao.update(pojo);
    }

}
