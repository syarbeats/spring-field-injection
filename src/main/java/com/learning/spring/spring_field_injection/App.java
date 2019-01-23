package com.learning.spring.spring_field_injection;

import org.springframework.context.support.GenericXmlApplicationContext;

public class App 
{
    public static void main( String[] args )
    {
        GenericXmlApplicationContext ctx = new GenericXmlApplicationContext();
        ctx.load("classpath:spring/app-config.xml");
        ctx.refresh();
        
        Singer singerBean = ctx.getBean(Singer.class);
        singerBean.sing();
        ctx.close();
    }
}
