package com.it.jackson0419.dao;

import com.it.jackson0419.vo.User;
import org.apache.ibatis.annotations.Select;

public interface testDao {
    @Select("SELECT t.* FROM test2 t WHERE t.id = #{id}")
    User findById(int id);


}
