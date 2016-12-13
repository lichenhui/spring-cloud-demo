package cn.lichenhui.spring.cloud.srevice;

import cn.lichenhui.spring.cloud.srevice.fallback.ServiceDemoFallback;
import org.springframework.cloud.netflix.feign.FeignClient;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;

@FeignClient(value = "service-demo", fallback = ServiceDemoFallback.class)
public interface ServiceClient {

	@RequestMapping(method = RequestMethod.GET, value = "/add")
	Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b);
}
