package com.iisn.construtorArg.BeanClass;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class DataFile {

        private int RegisterNo;
        private String name;

        public DataFile() {
        }

        public DataFile(int registerNo, String name) {
            RegisterNo = registerNo;
            this.name = name;
        }

        public int getRegisterNo() {
            return RegisterNo;
        }

        public void setRegisterNo(int registerNo) {
            RegisterNo = registerNo;
        }

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }
        public void printData1()
        {
            System.out.println("Register Number is "+getRegisterNo()+" Name "+getName());
        }
    }

