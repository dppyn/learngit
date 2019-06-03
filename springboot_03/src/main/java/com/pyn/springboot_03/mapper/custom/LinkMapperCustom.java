package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.custom.LinkCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * Created by 言曌 on 2017/9/4.
 */
@Mapper
@Repository
public interface LinkMapperCustom {
	
	//获得链接总数
	@SelectProvider(type = DemoSqlProvider.class, method = "countLink")
	public Integer countLink(Integer status) throws Exception;
	
	//获得链接列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listLink")
	public List<LinkCustom> listLink( Integer status) throws Exception;
	

}
