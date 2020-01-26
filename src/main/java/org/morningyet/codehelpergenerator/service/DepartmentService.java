package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Department;
import org.morningyet.codehelpergenerator.dao.DepartmentDao;

@Service
public class DepartmentService {

    @Resource
    private DepartmentDao departmentDao;

    public int insert(Department pojo){
        return departmentDao.insert(pojo);
    }

    public int insertList(List< Department> pojos){
        return departmentDao.insertList(pojos);
    }

    public List<Department> select(Department pojo){
        return departmentDao.select(pojo);
    }

    public int update(Department pojo){
        return departmentDao.update(pojo);
    }

}
