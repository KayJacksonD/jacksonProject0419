package com.it.jackson0419.dao;

import com.it.jackson0419.vo.Role;
import org.apache.ibatis.annotations.Param;

public interface IPermissionDao {

    void addRoles(@Param("vo") Role vo);

}
