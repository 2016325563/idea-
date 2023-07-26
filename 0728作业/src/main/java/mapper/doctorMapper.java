package mapper;

import entity.Hospital;
import org.apache.ibatis.annotations.*;

import java.util.List;

public interface doctorMapper {
    //选择所有的
    @Select("SELECT * from hospital")
    public List<Hospital> selAllHop();

    //插入
    @Insert("INSERT INTO hospital VALUES(#{hopId},#{hopName},#{hopAdress},#{hopPho})")
    public Integer insHop(Hospital hospital);

    //删除通过id
    @Delete("delete  from hospital WHERE hospital.hopId=#{hopId}")
    public Integer delById(@Param("hopId") Integer hopId);


    //修改通过id
    @Update("UPDATE hospital SET hospital.hopName=#{hopName}," +
            "hospital.hopAdress=#{hopAdress} WHERE hospital.hopId=#{hopId}")
    public Integer upById(@Param("hopId") Integer hopId);


}
