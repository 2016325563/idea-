// OwnerService.java文件，用于定义Service接口
package cn.kgc.service;

import cn.kgc.entity.Owner;
import cn.kgc.entity.House;
import org.springframework.stereotype.Component;

import java.util.List;

@Component
public interface OwnerService {
    // 查询所有业主信息的方法
    List<Owner> getAllOwner();

    // 根据业主id查询所有房屋信息的方法
    List<House> getHouseByOwnerId(int ownerId);

    // 根据房屋id删除房屋信息的方法
    boolean deleteHouseByHouseId(int houseId);

    // 根据房屋id更新房屋信息的方法
    boolean updateHouseByHouseId(House house);

    // 插入业主信息的方法
    boolean addOwner(Owner owner);
}
