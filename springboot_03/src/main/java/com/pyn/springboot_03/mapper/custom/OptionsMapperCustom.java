package com.pyn.springboot_03.mapper.custom;

import com.pyn.springboot_03.entity.Options;
import com.pyn.springboot_03.mapper.DemoSqlProvider;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;
import org.springframework.stereotype.Repository;

/**
 * Created by 言曌 on 2017/9/7.
 */
@Mapper
@Repository
public interface OptionsMapperCustom {
    @Select(" SELECT * FROM options limit 1")
    public Options getOptions() throws Exception;
}
