package ycz.sample.dubbo.official;

import java.io.IOException;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Provider {

    public static void main(String[] args) throws IOException {
        ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext(
            "dubbo/official/provider-config.xml");
        context.start();
        System.out.println("服务启动");
        //读取 消息
        System.in.read();
    }
}
