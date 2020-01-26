package org.morningyet.codehelpergenerator.dao;

import org.apache.ibatis.annotations.Param;
import java.util.List;
import org.morningyet.codehelpergenerator.pojo.Menu;

public interface MenuDao {

    int insert(@Param("pojo") Menu pojo);

    int insertList(@Param("pojos") List< Menu> pojo);

    List<Menu> select(@Param("pojo") Menu pojo);

    int update(@Param("pojo") Menu pojo);

}
