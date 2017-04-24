package com.cc.dao;

import com.cc.pojo.CountriesRepo;
import com.cc.pojo.CountriesRepoExample;
import java.util.List;
import org.apache.ibatis.annotations.Param;

public interface CountriesRepoMapper {
    int countByExample(CountriesRepoExample example);

    int deleteByExample(CountriesRepoExample example);

    int deleteByPrimaryKey(String id);

    int insert(CountriesRepo record);

    int insertSelective(CountriesRepo record);

    List<CountriesRepo> selectByExampleWithBLOBs(CountriesRepoExample example);
    List<CountriesRepo> selectAll();

    List<CountriesRepo> selectByExample(CountriesRepoExample example);

    CountriesRepo selectByPrimaryKey(String id);

    int updateByExampleSelective(@Param("record") CountriesRepo record, @Param("example") CountriesRepoExample example);

    int updateByExampleWithBLOBs(@Param("record") CountriesRepo record, @Param("example") CountriesRepoExample example);

    int updateByExample(@Param("record") CountriesRepo record, @Param("example") CountriesRepoExample example);

    int updateByPrimaryKeySelective(CountriesRepo record);

    int updateByPrimaryKeyWithBLOBs(CountriesRepo record);

    int updateByPrimaryKey(CountriesRepo record);
}