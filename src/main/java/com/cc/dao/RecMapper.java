package com.cc.dao;

import com.cc.pojo.Rec;
import com.cc.pojo.RecExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RecMapper {
    int countByExample(RecExample example);

    int deleteByExample(RecExample example);

    int deleteByPrimaryKey(Integer id);

    int insert(Rec record);

    int insertSelective(Rec record);

    List<Rec> selectByExample(RecExample example);

    Rec selectByPrimaryKey(Integer id);

    int updateByExampleSelective(@Param("record") Rec record, @Param("example") RecExample example);

    int updateByExample(@Param("record") Rec record, @Param("example") RecExample example);

    int updateByPrimaryKeySelective(Rec record);

    int updateByPrimaryKey(Rec record);
}