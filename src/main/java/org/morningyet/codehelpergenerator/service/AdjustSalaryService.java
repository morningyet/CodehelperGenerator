package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.AdjustSalary;
import org.morningyet.codehelpergenerator.dao.AdjustSalaryDao;

@Service
public class AdjustSalaryService {

    @Resource
    private AdjustSalaryDao adjustSalaryDao;

    public int insert(AdjustSalary pojo){
        return adjustSalaryDao.insert(pojo);
    }

    public int insertList(List< AdjustSalary> pojos){
        return adjustSalaryDao.insertList(pojos);
    }

    public List<AdjustSalary> select(AdjustSalary pojo){
        return adjustSalaryDao.select(pojo);
    }

    public int update(AdjustSalary pojo){
        return adjustSalaryDao.update(pojo);
    }

}
