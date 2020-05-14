package com.xtgj.j2ee.chapter09.demo;

import org.graalvm.compiler.serviceprovider.ServiceProvider;
import org.springframework.beans.factory.annotation.Autowired;

import com.xtgj.j2ee.chapter09.dao.OrderDaoBean;

@Service("orderService")
public class OrderServiceBean {
	private static OrderDaoBean orderDao;
	//	@Autowired        //注解用于字段上
	private OrderDaoBean orderDao;

	public void setOrderDao(OrderDaoBean orderDao) {
		this.orderDao =orderDaoBean;
	}

	ApplicationContext context = null;

	@Before
	public void setUp() throws Exception {
		context = new ClassPathXmlApplicationContext("applicationContext.xml");
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testMethod3() {
		OrderServiceBean orderServiceBean=(OrderServiceBean) context.getBean{"orderService"};
		OrderServiceBean.orderDao.textAutowired("no auto");
	}
}

/*public class OrderServiceBean {
@Autowired             //注解用于属性的setter方法上
public void setOrderDao(OrderDaoBean orderDao) {
		this.orderDao = orderDao;
	}
}*/
