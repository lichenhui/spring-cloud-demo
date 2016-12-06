package cn.lichenhui.spring.cloud.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class HelloController {

	@Autowired
	private RestTemplate restTemplate;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		int result = restTemplate.getForEntity("http://service-demo/add?a=2&b=3", Integer.class).getBody();
		return "结果是:" + result;
	}
}
