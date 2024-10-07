package lk.ijse.webRTC_with_SpringBoot;

import lk.ijse.webRTC_with_SpringBoot.Service.UserService;
import lk.ijse.webRTC_with_SpringBoot.User.User;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class WebRtcWithSpringBootApplication {

	public static void main(String[] args) {
		SpringApplication.run(WebRtcWithSpringBootApplication.class, args);
	}
	@Bean
	public CommandLineRunner commandLineRunner(
			UserService service
	) {
		return args -> {
			service.register(User.builder()
					.username("Ali")
					.email("ali@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("John")
					.email("john@mail.com")
					.password("aaa")
					.build());

			service.register(User.builder()
					.username("Anny")
					.email("anna@mail.com")
					.password("aaa")
					.build());
		};
	}

}
