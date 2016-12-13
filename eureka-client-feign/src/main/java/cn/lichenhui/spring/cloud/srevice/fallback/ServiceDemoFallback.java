package cn.lichenhui.spring.cloud.srevice.fallback;


import cn.lichenhui.spring.cloud.srevice.ServiceClient;
import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestParam;

@Component
public class ServiceDemoFallback implements ServiceClient {

	@Override
	public Integer add(@RequestParam(value = "a") Integer a, @RequestParam(value = "b") Integer b) {
		return 0;
	}
}
