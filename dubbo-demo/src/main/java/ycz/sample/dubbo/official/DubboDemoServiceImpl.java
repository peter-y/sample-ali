package ycz.sample.dubbo.official;

/**
 * 生产者 提供了 服务的基础实现
 */
public class DubboDemoServiceImpl implements DubboDemoService {

    @Override
    public String sayHello(String name) {
        System.out.println("name = [" + name + "]");
        return "Hello " + name;
    }
}
