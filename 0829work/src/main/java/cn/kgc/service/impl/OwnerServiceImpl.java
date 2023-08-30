// OwnerServiceImpl.java文件，用于定义Service实现类
package cn.kgc.service.impl;

import cn.kgc.mapper.OwnerMapper;
import cn.kgc.entity.Owner;
import cn.kgc.entity.House;
import cn.kgc.service.OwnerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class OwnerServiceImpl implements OwnerService {

    // 注入mapper接口对象
    @Autowired
    private OwnerMapper ownerMapper;

    public void setOwnerMapper(OwnerMapper ownerMapper) {
        this.ownerMapper = ownerMapper;
    }

    // 查询所有业主信息的方法
    @Override
    public List<Owner> getAllOwner() {
        return ownerMapper.selectAllOwner();
    }

    // 根据业主id查询所有房屋信息的方法
    @Override
    public List<House> getHouseByOwnerId(int ownerId) {
        return ownerMapper.selectHouseByOwnerId(ownerId);
    }

    // 根据房屋id删除房屋信息的方法
    @Override
    public boolean deleteHouseByHouseId(int houseId) {
        int result = ownerMapper.deleteHouseByHouseId(houseId);
        return result > 0;
    }

    // 根据房屋id更新房屋信息的方法
    @Override
    public boolean updateHouseByHouseId(House house) {
        int result = ownerMapper.updateHouseByHouseId(house);
        return result > 0;
    }

    // 插入业主信息的方法
    @Override
    public boolean addOwner(Owner owner) {
        int result = ownerMapper.insertOwner(owner);
        return result > 0;
    }
}
