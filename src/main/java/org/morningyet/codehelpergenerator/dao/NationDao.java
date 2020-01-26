package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Nation;

public interface NationDao {

    int insert(@Param("pojo") Nation pojo);

    int insertList(@Param("pojos") List< Nation> pojo);

    List<Nation> select(@Param("pojo") Nation pojo);

    int update(@Param("pojo") Nation pojo);

}
