package com.project.pratice.service;

import com.project.pratice.base.exception.LoanException;
import org.apache.commons.io.FileUtils;
import org.springframework.stereotype.Service;

import java.io.File;

@Service
public class ExceptionService {
    public void runExcept(int i) throws LoanException {
        for (int j = 0; j < 10; j++) {

            try {
                System.out.println(j);
                int m = 1/0;
            } catch (Exception e) {
                throw new LoanException(1,e);
            }
        }
    }
    public void copyFile(){
        try {
            FileUtils.copyFile(new File("C:/Users/L/Pictures/机动车登记证-抵押登记信息.png"),new File("D:/DownLoad/aa.png"));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public void dealException(){
        Integer str = null;

        str.toString();
    }
}
