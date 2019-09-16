package josd;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

import josd.login.service.UsersService;

@SpringBootApplication
public class JosdApiApplication {
		
	public static void main(String[] args) {
		SpringApplication.run(JosdApiApplication.class, args);
	}

}
