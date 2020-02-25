package dao;

import dto.DrInfoB;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

@Mapper
@Repository
public interface DrInfoBDAO {
    int deleteByPrimaryKey(String drCode);

    int insert(DrInfoB record);

    int insertSelective(DrInfoB record);

    DrInfoB selectByPrimaryKey(String drCode);

    int updateByPrimaryKeySelective(DrInfoB record);

    int updateByPrimaryKey(DrInfoB record);
}