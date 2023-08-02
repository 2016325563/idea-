package cn.kgc.dao;

/*实例化一个dao层的方法*/


import org.springframework.stereotype.Repository;

@Repository
public class StudentDao {
    public void login() {

        System.out.println("调用了登录");
    }
}
