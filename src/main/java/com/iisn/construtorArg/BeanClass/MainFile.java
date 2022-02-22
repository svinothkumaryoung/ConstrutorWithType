package com.iisn.construtorArg.BeanClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class MainFile {
    public static void main(String[] args) {
        ApplicationContext ac=new ClassPathXmlApplicationContext("xmlfile.xml");
        DataFile pc=(DataFile) ac.getBean("obj2");
        pc.printData1();
    }
}
