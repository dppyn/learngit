package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.custom.MenuCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
public interface MenuMapperCustom {
    //获得菜单列表
    @SelectProvider(type = DemoSqlProvider.class, method = "listMenu")
    public List<MenuCustom> listMenu( Integer status) throws Exception;
}
