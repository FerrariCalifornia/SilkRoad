package com.cc.dao;

import com.cc.pojo.RegulationRepo;
import com.cc.pojo.RegulationRepoExample;
import com.cc.pojo.RegulationRepoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface RegulationRepoMapper {
    int countByExample(RegulationRepoExample example);

    int deleteByExample(RegulationRepoExample example);

    int deleteByPrimaryKey(String id);

    int insert(RegulationRepoWithBLOBs record);

    int insertSelective(RegulationRepoWithBLOBs record);

    List<RegulationRepoWithBLOBs> selectByExampleWithBLOBs(RegulationRepoExample example);

    List<RegulationRepo> selectByExample(RegulationRepoExample example);
    List<RegulationRepo> selectAll();

    RegulationRepoWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") RegulationRepoWithBLOBs record, @Param("example") RegulationRepoExample example);

    int updateByExampleWithBLOBs(@Param("record") RegulationRepoWithBLOBs record, @Param("example") RegulationRepoExample example);

    int updateByExample(@Param("record") RegulationRepo record, @Param("example") RegulationRepoExample example);

    int updateByPrimaryKeySelective(RegulationRepoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(RegulationRepoWithBLOBs record);

    int updateByPrimaryKey(RegulationRepo record);
}