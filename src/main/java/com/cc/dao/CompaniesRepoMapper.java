package com.cc.dao;

import com.cc.pojo.CompaniesRepo;
import com.cc.pojo.CompaniesRepoExample;
import com.cc.pojo.CompaniesRepoWithBLOBs;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CompaniesRepoMapper {
    int countByExample(CompaniesRepoExample example);

    int deleteByExample(CompaniesRepoExample example);

    int deleteByPrimaryKey(String id);

    int insert(CompaniesRepoWithBLOBs record);

    int insertSelective(CompaniesRepoWithBLOBs record);

    List<CompaniesRepoWithBLOBs> selectByExampleWithBLOBs(CompaniesRepoExample example);

    List<CompaniesRepo> selectByExample(CompaniesRepoExample example);
    List<CompaniesRepo> selectAll();

    CompaniesRepoWithBLOBs selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CompaniesRepoWithBLOBs record, @Param("example") CompaniesRepoExample example);

    int updateByExampleWithBLOBs(@Param("record") CompaniesRepoWithBLOBs record, @Param("example") CompaniesRepoExample example);

    int updateByExample(@Param("record") CompaniesRepo record, @Param("example") CompaniesRepoExample example);

    int updateByPrimaryKeySelective(CompaniesRepoWithBLOBs record);

    int updateByPrimaryKeyWithBLOBs(CompaniesRepoWithBLOBs record);

    int updateByPrimaryKey(CompaniesRepo record);
}