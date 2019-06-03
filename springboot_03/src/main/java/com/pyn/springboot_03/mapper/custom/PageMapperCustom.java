package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.custom.PageCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
/**
 * Created by 言曌 on 2017/9/7.
 */

public interface PageMapperCustom {
	//获得页面列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listPage")
	public List<PageCustom> listPage( Integer status) throws Exception;

	//根据key获得页面
	@SelectProvider(type = DemoSqlProvider.class, method = "getPageByKey")
	public PageCustom getPageByKey( Integer status,  String key) throws Exception;
}
