package mapper;

import entity.Hospital;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface hospitalMapper {
    //选择所有的
    @Select("SELECT * from hospital")
    public List<Hospital> selAllHop();

    //插入
    // 注意：这里的 SQL 语句使用了数据库支持的自增长机制（如 MySQL 的 AUTO_INCREMENT）
    @Insert("INSERT INTO hospital (hopName, hopAdress, hopPho) VALUES (#{hopName}, #{hopAddress}, #{hopPho})")
    @Options(useGeneratedKeys = true, keyProperty = "hopId")
    public Integer insHop(Hospital hospital1);


    //删除通过id
    @Delete("delete  from hospital WHERE hospital.hopId=#{hopId}")
    public Integer delById(@Param("hopId") Integer hopId);


    //修改通过id
    @Update("UPDATE hospital SET hopName=#{hopName},hopAdress=#{hopAdress} WHERE hopId=#{hopId}")
    public Integer upById(Hospital hospital2);


}
