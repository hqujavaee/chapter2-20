package cn.edu.hqu.javaee.domain.Dessert.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

import cn.edu.hqu.javaee.domain.Dessert.Consumer;
import cn.edu.hqu.javaee.domain.Dessert.Dessert;

@Component
@PropertySource("classpath:application.properties" )
public class Child implements Consumer {
	//采用属性占位符注入
	@Value("${info.name}") String name;
	@Value("${info.location}")String location;
	@Autowired
	private Dessert dessert;

	@Override
	public void consume() {
		// TODO Auto-generated method stub
		System.out.print("采用属性占位符注入："+name+"在"+location);
		dessert.eat();
	}
}
