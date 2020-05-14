package com.xtgj.j2ee.chapter09.dao;

@Repository("orderDao")
public class OrderDaoBean {

    public void textAutowired(String str){
        System.out.println(str);
    }

}
