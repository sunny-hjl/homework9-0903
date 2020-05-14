package com.xtgj.j2ee.chapter09.dao.service;

import com.xtgj.j2ee.chapter09.dao.OrderDaoBean;
import com.xtgj.j2ee.chapter09.demo.OrderTest;
import org.graalvm.compiler.lir.CompositeValue;



@Component
public class ServTest {
    @Resource(name = "orderDaoTe")
    private OrderDaoBean orderDao;

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
        ServTest orderTest=(OrderTest) context.getBean{"OrderTest"};
        orderTest.orderDao.textAutowired("no auto");
    }
}
