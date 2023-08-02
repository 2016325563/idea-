package cn.kgc.service.impl;

import cn.kgc.service.Print;
import org.springframework.stereotype.Component;

@Component
public class ColorPrint implements Print {
    public void print() {
        System.err.println("打印彩色的答应机");
    }
}
