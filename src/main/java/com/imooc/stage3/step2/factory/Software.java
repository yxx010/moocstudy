package com.imooc.stage3.step2.factory;

import com.imooc.stage3.step2.factory.i18n.I18N;
import com.imooc.stage3.step2.factory.i18n.I18NFactory;

/**
 * 工厂模式，隐藏创建类的过程；直接面对工厂，让工厂选择适合的类
 */
public class Software {
    public static void main(String[] args) {
        I18N i18N= I18NFactory.getI18NObject("china");
    }
}
