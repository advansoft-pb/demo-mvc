package pl.advansoft.master;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.thymeleaf.ThymeleafProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class MasterSpringMvc4Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext ctx = SpringApplication.run(MasterSpringMvc4Application.class, args);
		Stream.of(ctx.getBeanDefinitionNames()).forEach(System.out::println);
		System.out.println("count: " + ctx.getBeanDefinitionCount());

		ThymeleafProperties thymeleafProperties = ctx.getBean(ThymeleafProperties.class);
		System.out.println(thymeleafProperties);
		System.out.println(thymeleafProperties.getPrefix());
		System.out.println(thymeleafProperties.getSuffix());

		String[] names = ctx.getBeanNamesForType(ThymeleafProperties.class);
		List<String> list = Arrays.asList(names);
		System.out.println(list);
	}
}
