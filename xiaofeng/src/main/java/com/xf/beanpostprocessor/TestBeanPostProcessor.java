package com.xf.beanpostprocessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.config.BeanPostProcessor;
import org.springframework.core.PriorityOrdered;
import org.springframework.stereotype.Component;

/**
 * @program spring
 * @description:
 * @author: xiaoFeng
 * @create: 2020/07/09 15:46
 */
@Component
public class TestBeanPostProcessor implements BeanPostProcessor, PriorityOrdered {

  @Override
  public Object postProcessBeforeInitialization(Object bean, String beanName)
      throws BeansException {
    if (beanName.equals("indexDao")) {
      System.out.println("postProcessBeforeInitialization");
    }
    return bean;
  }

  @Override
  public Object postProcessAfterInitialization(Object bean, String beanName) throws BeansException {
    if (beanName.equals("indexDao")) {
      System.out.println("postProcessAfterInitialization");
    }
    return bean;
  }

	@Override
	public int getOrder() {
		return 0;
	}
}
