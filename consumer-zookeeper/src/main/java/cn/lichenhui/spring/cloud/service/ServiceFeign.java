package cn.lichenhui.spring.cloud.service;

import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-zookeeper")
public interface ServiceFeign {

	@RequestMapping(value = "hello")
	String sayHello(@RequestParam String name);
}
