package org.example.test;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.example.config.Appconfig;
import org.example.dao.Dao;
import org.example.dao.IndexDao;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Test {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
//        annotationConfigApplicationContext.start();
//        //1....
//        IndexDao bean = annotationConfigApplicationContext.getBean(IndexDao.class);
//        bean.query();


        Dao bean = annotationConfigApplicationContext.getBean(Dao.class);
        bean.query();

//        Log log = LogFactory.getLog("XX");
    }
}
