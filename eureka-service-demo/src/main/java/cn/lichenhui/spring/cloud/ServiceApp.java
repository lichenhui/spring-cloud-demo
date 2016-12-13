package cn.lichenhui.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * service demo
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
public class ServiceApp {

    private static final String EGD_KEY = "java.security.egd";
    private static final String URANDOM = "/dev/urandom";

    public static void main( String[] args ) {
        if (Files.exists(Paths.get(URANDOM))) {
            // make Tomcat startup faster
            System.setProperty(EGD_KEY, "file://" + URANDOM);
        }
        SpringApplication.run(ServiceApp.class, args);
    }
}
