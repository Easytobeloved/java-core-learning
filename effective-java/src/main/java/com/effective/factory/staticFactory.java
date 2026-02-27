package com.effective.factory;

import javax.xml.crypto.Data;
import java.time.Instant;
import java.util.Date;

/**
 * 静态工厂方法的优势
 * 1.有名字，外部在使用的时候清晰地知道该如何调用，而构造器的表达就不是那么的清楚
 * 2.不必再每次调用他们的时候都创建一个新对象
 * 3.它们可以返回原返回类型的任何子类型的对象
 * 4.，所返回的对象的类可以随着每次调用而发生变化，这取决于静态工厂方法的参数值
 * 5.方法返回的对象所属的类，在编写包含该静态工厂方法的类时可以不存在
 * 静态工厂方法的缺点
 * 1.，类如果不含公有的或者受保护的构造器，就不能被子类化。
 * 2.程序员很难发现它们（静态工厂方法不想构造器那样在API文档中明确标识出来）
 */
public class staticFactory {
    public static void main(String[] args) {
        // from一一类型转换方法，它只有单个参数，返回该类型的一个相对应的实例，例如：
        Date d = Date.from(Instant.now());
        System.out.println(d.toString());
    }



}
