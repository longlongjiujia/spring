package com.zyl;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * package com.zyl
 * User: zhangyanlong
 * Email: zhangyanlong@jd.com
 * Date: 2020/1/13
 * Time: 17:11
 * Description:
 */
public class InitTest {


    public static void main(String[] args) {
        ApplicationContext context = new ClassPathXmlApplicationContext("services.xml");

    }
}
