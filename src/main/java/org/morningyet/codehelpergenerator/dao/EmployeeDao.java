package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Employee;

public interface EmployeeDao {

    int insert(@Param("pojo") Employee pojo);

    int insertList(@Param("pojos") List< Employee> pojo);

    List<Employee> select(@Param("pojo") Employee pojo);

    int update(@Param("pojo") Employee pojo);

}
