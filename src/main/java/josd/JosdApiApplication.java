package josd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class JosdApiApplication extends SpringBootServletInitializer{
		
	public static void main(String[] args) {
		SpringApplication.run(JosdApiApplication.class, args);
	}
	
	@Override
	protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {

        return builder.sources(JosdApiApplication.class);

    }
}
