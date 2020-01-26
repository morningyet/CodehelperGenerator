package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Hr;

public interface HrDao {

    int insert(@Param("pojo") Hr pojo);

    int insertList(@Param("pojos") List< Hr> pojo);

    List<Hr> select(@Param("pojo") Hr pojo);

    int update(@Param("pojo") Hr pojo);

}
