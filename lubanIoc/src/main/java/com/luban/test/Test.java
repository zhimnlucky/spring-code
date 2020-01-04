package com.luban.test;

import com.luban.app.Appconfig;
import com.luban.beanFactoryProcessor.MyBeanFactoryProcessor;
import com.luban.dao.IndexDao;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.AnnotationConfigUtils;

/**
 * <p>
 * </p>
 *
 * @author zhimanan
 * @package com.luban.test
 * @date 2019-12-6 21:23
 * @copyright: Copyright (c) 2019
 * @version: V1.0.0
 */
public class Test {

	public static void main(String[] args){
		//这个类称之为spring的环境
		AnnotationConfigApplicationContext annotationConfigApplicationContext = new AnnotationConfigApplicationContext();

		//这边既可以加载配置类，也可以加载加了@componet之类的类
		annotationConfigApplicationContext.register(Appconfig.class);
		annotationConfigApplicationContext.addBeanFactoryPostProcessor(new MyBeanFactoryProcessor());

		annotationConfigApplicationContext.refresh();

		IndexDao bean = annotationConfigApplicationContext.getBean(IndexDao.class);
		System.out.println();
	}
}
