package cn.lichenhui.spring.cloud.service;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

@Service
public class ServiceDemo {

	@Autowired
	private RestTemplate restTemplate;

	@HystrixCommand(fallbackMethod = "demoServiceFallback")
	public int add() {
		return restTemplate.getForEntity("http://service-demo/add?a=2&b=3", Integer.class).getBody();
	}

	private int demoServiceFallback() {
		return 0;
	}
}
