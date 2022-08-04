package Project.DonationManagementSystem;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class DonationManagementSystemApplication {

	public static void main(String[] args) {
		SpringApplication.run(DonationManagementSystemApplication.class, args);
	}
	
	
//	@Bean
//	public WebMvcConfigurer config() {
//		return new WebMvcConfigurer() {
//			public void addCorsMappings(CorsRegistry reg) {
//				reg.addMapping("/*").allowedOrigins("*");
//			}
//		};
//	}

}
