package pl.advansoft.master;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MasterSpringMvc4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MasterSpringMvc4Application.class, args);
		System.out.println("count: " + ctx.getBeanDefinitionCount());
	}
}
