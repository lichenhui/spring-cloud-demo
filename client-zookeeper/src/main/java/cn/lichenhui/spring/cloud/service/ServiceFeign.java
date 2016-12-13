package cn.lichenhui.spring.cloud.service;

import cn.lichenhui.spring.cloud.service.fallback.FeignFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-zookeeper", fallback = FeignFallback.class)
public interface ServiceFeign {

	@RequestMapping(value = "/hello")
	String sayHello(@RequestParam(name = "name") String name);
}
