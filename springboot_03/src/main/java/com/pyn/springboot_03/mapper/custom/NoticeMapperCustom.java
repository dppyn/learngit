package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.custom.NoticeCustom;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.SelectProvider;
import org.springframework.stereotype.Repository;

import java.util.List;
@Mapper
@Repository
/**
 * Created by 言曌 on 2017/9/4.
 */
public interface NoticeMapperCustom {
	
	//获得公告总数
	@SelectProvider(type = DemoSqlProvider.class, method = "countNotice")
	public Integer countNotice(Integer status) throws Exception;
	
	//获得公告列表
	@SelectProvider(type = DemoSqlProvider.class, method = "listNotice")
	public List<NoticeCustom> listNotice( Integer status) throws Exception;


}
