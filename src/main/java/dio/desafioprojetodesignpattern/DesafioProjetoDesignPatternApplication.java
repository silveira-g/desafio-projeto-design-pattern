package dio.desafioprojetodesignpattern;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@EnableFeignClients
public class DesafioProjetoDesignPatternApplication {

	public static void main(String[] args) {
		SpringApplication.run(DesafioProjetoDesignPatternApplication.class, args);
	}

}
