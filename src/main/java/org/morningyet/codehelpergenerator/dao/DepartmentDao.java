package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Department;

public interface DepartmentDao {

    int insert(@Param("pojo") Department pojo);

    int insertList(@Param("pojos") List< Department> pojo);

    List<Department> select(@Param("pojo") Department pojo);

    int update(@Param("pojo") Department pojo);

}
