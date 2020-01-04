package com.luban.beanFactoryProcessor;

import org.springframework.beans.BeansException;
import org.springframework.beans.factory.annotation.AnnotatedBeanDefinition;
import org.springframework.beans.factory.config.BeanFactoryPostProcessor;
import org.springframework.beans.factory.config.ConfigurableListableBeanFactory;
import org.springframework.stereotype.Component;

/**
 * <p>
 * </p>
 *
 * @author zhimanan
 * @package com.luban.beanFactoryProcessor
 * @date 2019-12-7 21:09
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
@Component
public class MyBeanFactoryProcessor implements BeanFactoryPostProcessor {

	@Override
	public void postProcessBeanFactory(ConfigurableListableBeanFactory beanFactory) throws BeansException {
		//这个beanFactory是bean工厂传给你的,通过这个改造相关的内容，插手bean工厂，然后改他的定义，
		AnnotatedBeanDefinition annotatedBeanDefinition = (AnnotatedBeanDefinition)beanFactory.getBeanDefinition("indexDao");
		annotatedBeanDefinition.setScope("protetype");
	}
}
