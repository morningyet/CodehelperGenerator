package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.AdjustSalary;

public interface AdjustSalaryDao {

    int insert(@Param("pojo") AdjustSalary pojo);

    int insertList(@Param("pojos") List< AdjustSalary> pojo);

    List<AdjustSalary> select(@Param("pojo") AdjustSalary pojo);

    int update(@Param("pojo") AdjustSalary pojo);

}
