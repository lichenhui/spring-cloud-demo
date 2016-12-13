package cn.lichenhui.spring.cloud.controller;

import cn.lichenhui.spring.cloud.service.HelloService;
import cn.lichenhui.spring.cloud.service.ServiceFeign;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private HelloService helloService;

	@Autowired
	private ServiceFeign serviceFeign;

	@RequestMapping(value = "hello")
	public String hello(@RequestParam String name) {
		return helloService.sayHello(name);
	}

	@RequestMapping(value = "hello2")
	public String hello2(@RequestParam String name) {
		return serviceFeign.sayHello(name);
	}
}
