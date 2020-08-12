package com.xf.test;

import com.xf.config.AppConfig;
import com.xf.dao.IndexDao;
import com.xf.dao.IndexDao2;
import com.xf.dao.Tset2Constuct;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

/**
 * @program spring
 * @description:
 * @author: xiaoFeng
 * @create: 2020/07/08 19:45
 */
public class Test {

  public static void main(String[] args) {
    // Tset2Constuct tset2Constuct = new Tset2Constuct();
    AnnotationConfigApplicationContext annotationConfigApplicationContext =
        new AnnotationConfigApplicationContext();
    // annotationConfigApplicationContext.register(IndexDao.class);
    annotationConfigApplicationContext.register(AppConfig.class);
    annotationConfigApplicationContext.refresh();
    annotationConfigApplicationContext.getBeanFactory();
    IndexDao2 bean = annotationConfigApplicationContext.getBean(IndexDao2.class);
    bean.query();
  }
}
