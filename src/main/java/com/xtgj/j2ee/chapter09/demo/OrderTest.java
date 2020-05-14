package com.xtgj.j2ee.chapter09.demo;

import com.xtgj.j2ee.chapter09.dao.OrderDaoBean;

@Controller
public class OrderTest {
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
        OrderTest orderTest=(OrderTest) context.getBean{"OrderTest"};
        OrderTest.orderDao.textAutowired("no auto");
    }


}
