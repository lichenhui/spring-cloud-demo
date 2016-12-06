package cn.lichenhui.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * Eureka server
 *
 */

@SpringBootApplication
@EnableEurekaServer
public class EurekaServer {
	private static final String EGD_KEY = "java.security.egd";
	private static final String URANDOM = "/dev/urandom";

	public static void main( String[] args ) {
		if (Files.exists(Paths.get(URANDOM))) {
			// make Tomcat startup faster
			System.setProperty(EGD_KEY, "file://" + URANDOM);
		}
		SpringApplication.run(EurekaServer.class, args);
	}
}
