package tt.stylcq;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

/**
 * 爱旅行注册中心启动类
 * @author Stylcq
 * @version 1.0.0
 * @since 1.0.0
 */
@EnableEurekaServer
@SpringBootApplication
public class ItripEurekaServerStarter {
	public static void main(String[] args) {
		SpringApplication.run(ItripEurekaServerStarter.class,args);
	}
}
