package ycz.sample.dubbo.official;

import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Consumer {

    public static void main(String[] args) {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "dubbo/official/consumer-config.xml");
        context.start();
        DubboDemoService duboDomeService = (DubboDemoService) context.getBean("duboDomeService");
        String result = duboDomeService.sayHello("chongzhen");
        System.out.println("result = " + result);
    }
}
