package cn.kgc.user.mapper;

import cn.kgc.user.entity.User;
import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

/**
 * <p>
 * Mapper 接口
 * </p>
 *
 * @author 小杨
 * @since 2023-08-31
 */
@Mapper
public interface UserMapper extends BaseMapper<User> {
    /**
     * 注册新用户
     *
     * @param user 用户信息
     */
    void insertUser(User user);

    /**
     * 根据用户名和密码查询用户
     *
     * @param username 用户名
     * @return 匹配的用户信息
     */
    User getUserByUsername(@Param("username") String username);

}
