package com.cc.dao;

import com.cc.pojo.UansrRepo;
import com.cc.pojo.UansrRepoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UansrRepoMapper {
    int countByExample(UansrRepoExample example);

    int deleteByExample(UansrRepoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UansrRepo record);

    int insertSelective(UansrRepo record);

    List<UansrRepo> selectByExample(UansrRepoExample example);
    List<UansrRepo> selectAll();

    UansrRepo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UansrRepo record, @Param("example") UansrRepoExample example);

    int updateByExample(@Param("record") UansrRepo record, @Param("example") UansrRepoExample example);

    int updateByPrimaryKeySelective(UansrRepo record);

    int updateByPrimaryKey(UansrRepo record);
}