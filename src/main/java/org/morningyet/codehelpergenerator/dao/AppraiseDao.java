package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Appraise;

public interface AppraiseDao {

    int insert(@Param("pojo") Appraise pojo);

    int insertList(@Param("pojos") List< Appraise> pojo);

    List<Appraise> select(@Param("pojo") Appraise pojo);

    int update(@Param("pojo") Appraise pojo);

}
