package cn.lichenhui.spring.cloud.controller;

import cn.lichenhui.spring.cloud.srevice.ServiceClient;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloController {

	@Autowired
	private ServiceClient serviceClient;

	@RequestMapping(value = "/add", method = RequestMethod.GET)
	public String add() {
		return "结果是:" + serviceClient.add(2, 4);
	}
}
