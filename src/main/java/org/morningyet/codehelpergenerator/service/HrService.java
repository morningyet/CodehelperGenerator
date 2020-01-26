package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Hr;
import org.morningyet.codehelpergenerator.dao.HrDao;

@Service
public class HrService {

    @Resource
    private HrDao hrDao;

    public int insert(Hr pojo){
        return hrDao.insert(pojo);
    }

    public int insertList(List< Hr> pojos){
        return hrDao.insertList(pojos);
    }

    public List<Hr> select(Hr pojo){
        return hrDao.select(pojo);
    }

    public int update(Hr pojo){
        return hrDao.update(pojo);
    }

}
