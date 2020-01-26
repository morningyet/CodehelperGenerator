package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Appraise;
import org.morningyet.codehelpergenerator.dao.AppraiseDao;

@Service
public class AppraiseService {

    @Resource
    private AppraiseDao appraiseDao;

    public int insert(Appraise pojo){
        return appraiseDao.insert(pojo);
    }

    public int insertList(List< Appraise> pojos){
        return appraiseDao.insertList(pojos);
    }

    public List<Appraise> select(Appraise pojo){
        return appraiseDao.select(pojo);
    }

    public int update(Appraise pojo){
        return appraiseDao.update(pojo);
    }

}
