package org.morningyet.codehelpergenerator.service;

import org.springframework.stereotype.Service;
import javax.annotation.Resource;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Employee;
import org.morningyet.codehelpergenerator.dao.EmployeeDao;

@Service
public class EmployeeService {

    @Resource
    private EmployeeDao employeeDao;

    public int insert(Employee pojo){
        return employeeDao.insert(pojo);
    }

    public int insertList(List< Employee> pojos){
        return employeeDao.insertList(pojos);
    }

    public List<Employee> select(Employee pojo){
        return employeeDao.select(pojo);
    }

    public int update(Employee pojo){
        return employeeDao.update(pojo);
    }

}
