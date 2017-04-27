package com.cc.dao;

import com.cc.pojo.PebookRepo;
import com.cc.pojo.PebookRepoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface PebookRepoMapper {
    int countByExample(PebookRepoExample example);

    int deleteByExample(PebookRepoExample example);

    int deleteByPrimaryKey(String id);

    int insert(PebookRepo record);

    int insertSelective(PebookRepo record);

    List<PebookRepo> selectByExampleWithBLOBs(PebookRepoExample example);

    List<PebookRepo> selectByExample(PebookRepoExample example);
    List<PebookRepo> selectAll();

    PebookRepo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") PebookRepo record, @Param("example") PebookRepoExample example);

    int updateByExampleWithBLOBs(@Param("record") PebookRepo record, @Param("example") PebookRepoExample example);

    int updateByExample(@Param("record") PebookRepo record, @Param("example") PebookRepoExample example);

    int updateByPrimaryKeySelective(PebookRepo record);

    int updateByPrimaryKeyWithBLOBs(PebookRepo record);

    int updateByPrimaryKey(PebookRepo record);
}