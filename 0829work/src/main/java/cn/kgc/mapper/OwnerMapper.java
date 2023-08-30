// OwnerMapper.java文件，用于定义mapper接口
package cn.kgc.mapper;

import cn.kgc.entity.Owner;
import cn.kgc.entity.House;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Mapper
public interface OwnerMapper {
    // 查询所有业主信息的方法
    List<Owner> selectAllOwner();

    // 根据业主id查询所有房屋信息的方法
    List<House> selectHouseByOwnerId(@Param("ownerId") int ownerId);

    // 根据房屋id删除房屋信息的方法
    int deleteHouseByHouseId(@Param("houseId") int houseId);

    // 根据房屋id更新房屋信息的方法
    int updateHouseByHouseId(House house);

    // 插入业主信息的方法
    int insertOwner(Owner owner);
}
