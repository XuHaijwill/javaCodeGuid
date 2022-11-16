package org.example.test;

import org.example.config.Appconfig;
import org.example.dao.Dao;
import org.junit.Test;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TransactionTest {


    @Test
    public void testTransaction() {
        AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext(Appconfig.class);
        Dao bean = annotationConfigApplicationContext.getBean(Dao.class);
        bean.insert();
    }
}
