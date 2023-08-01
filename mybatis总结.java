/*
mybatis总结
        ●	1. MyBatis框架 (Java)
        ●	   - 增删改查
        ●	2. 关系映射
        ●	   - 一对一、多对一
        ●	      - 实体类配置
        ●	      - XML配置
        ●	      - 主键关联
        ●	      - 外键关联
        ●	   - 多表连接查询，查询结果是有多张表
        ●	   - 多对多、一对多
        ●	      - 实体类配置
        ●	      - XML配置
        ●	3. Hibernate：持久化框架
        ●	   - SSH Spring+struct2+hibernate
        ●	   - SSM: spring +springMVC +mybatis
        ●	4. 缓存
        ●	   - 一级缓存
        ●	   - 二级缓存
        ●	   - redis
        ●	5. 集合
        ●	   - List
        ●	   - Map
        ●	   - #{}
        ●	6. SQL语句
        ●	   - select * from x where id in(2,3,4)   ==  select * from xx where id = 2 or id = 3 or id=4
        ●	   - delete from xx where id in (2,3,4)
        ●	   - insert into xx values(1,3,4),(3,4,5),(4,4,6)
        ●	7. 参数类型
        ●	   - resultType:返回值类型
        ●	   - parameterType:参数类型
        ●	   - 对象 #{属性}
        ●	   - String: @Param("指定参数名称")在Mapper接口的参数中使用
        ●	   - Map #{key}
        ●	   - List
        ●	8. MyBatis流程
        ●	   - settings
        ●	   - typeAliases
        ●	   - environments
        ●	   - transactionManager
        ●	   - dataSource
        ●	   - mappers
        ●	   - resource xml路径 mapper/xxx.xml  class: 包名.接口名称 xml要在同级目录
        ●	9. Mapper接口要求
        ●	   - xml中的namespace 要写接口的路径
        ●	   - xml中的id要与接口中的方法名相同
        ●	   - 参数与返回值要兼容
        ●	   - 单个参数还要指定参数名称@Param注解
●	10. 解析流程
        ●	    - 读取核心配置文件mybatis-config.xml  jdbc连接
        ●	    - 得到SqlSessionFactory   进程
        ●	    - 得到SqlSession 线程
        ●	    - 执行SQL语句
        ●	    - 提交事务
        ●	    - 释放资源
*/
