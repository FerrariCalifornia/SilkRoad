package com.cc.dao;

import com.cc.pojo.UebookRepo;
import com.cc.pojo.UebookRepoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface UebookRepoMapper {
    int countByExample(UebookRepoExample example);

    int deleteByExample(UebookRepoExample example);

    int deleteByPrimaryKey(String id);

    int insert(UebookRepo record);

    int insertSelective(UebookRepo record);

    List<UebookRepo> selectByExampleWithBLOBs(UebookRepoExample example);

    List<UebookRepo> selectByExample(UebookRepoExample example);
    List<UebookRepo> selectAll();

    UebookRepo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") UebookRepo record, @Param("example") UebookRepoExample example);

    int updateByExampleWithBLOBs(@Param("record") UebookRepo record, @Param("example") UebookRepoExample example);

    int updateByExample(@Param("record") UebookRepo record, @Param("example") UebookRepoExample example);

    int updateByPrimaryKeySelective(UebookRepo record);

    int updateByPrimaryKeyWithBLOBs(UebookRepo record);

    int updateByPrimaryKey(UebookRepo record);
}