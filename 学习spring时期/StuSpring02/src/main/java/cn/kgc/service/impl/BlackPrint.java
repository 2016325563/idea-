package cn.kgc.service.impl;

import cn.kgc.service.Print;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;

/*表示业务逻辑的层次
 *
 * 实现的效果和组件是一样的
 * */
@Service
public class BlackPrint implements Print {
    public void print() {
        System.out.println("打印黑白的答应机");
    }
}
