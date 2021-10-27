package demo.controller;


import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * test 控制层
 *
 * @author jack
 * @data 2021/8/9 10:52 上午
 */
@RestController
public class TestController {


  @Value("${server.port}")
  private String port;


  @GetMapping("hello")
  public String hello() {
    return "hello springBoot:" + port;
  }


}
