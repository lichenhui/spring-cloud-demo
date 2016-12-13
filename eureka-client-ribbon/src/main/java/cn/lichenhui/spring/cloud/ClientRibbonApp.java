package cn.lichenhui.spring.cloud;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

import java.nio.file.Files;
import java.nio.file.Paths;

/**
 * service consumer use Ribbon
 *
 */
@SpringBootApplication
@EnableDiscoveryClient
@EnableCircuitBreaker
public class ClientRibbonApp {

    private static final String EGD_KEY = "java.security.egd";
    private static final String URANDOM = "/dev/urandom";

    public static void main( String[] args ) {
        if (Files.exists(Paths.get(URANDOM))) {
            // make Tomcat startup faster
            System.setProperty(EGD_KEY, "file://" + URANDOM);
        }
        SpringApplication.run(ClientRibbonApp.class, args);
    }
}
