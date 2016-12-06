package cn.lichenhui.spring.cloud.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.discovery.DiscoveryClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	private static final Logger log = LoggerFactory.getLogger(HelloController.class);

	@Autowired
	private DiscoveryClient discoveryClient;

	@RequestMapping(value = "add", method = RequestMethod.GET)
	public int add(@RequestParam int a, @RequestParam int b) {
		ServiceInstance instance = discoveryClient.getLocalServiceInstance();
		int result = a + b;
		log.info("/add, host:{}, service id:{}, result: {}", instance.getHost(), instance.getServiceId(), result);
		return result;
	}
}
