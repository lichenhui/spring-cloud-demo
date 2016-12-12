package cn.lichenhui.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient
public class ServiceZookeeperApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZookeeperApplication.class, args);
	}
}
