package cn.kgc.user.service.impl;

import cn.kgc.user.entity.User;
import cn.kgc.user.mapper.UserMapper;
import cn.kgc.user.service.IUserService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.stereotype.Service;

/**
 * <p>
 *  服务实现类
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements IUserService {

}
