package site.mvnr.DemoJS;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@RestController
public class DemoJsApplication {

    @GetMapping("/")
	public String home (){

		return "Welcome To JS...!";
	}

	public static void main(String[] args) {
		SpringApplication.run(DemoJsApplication.class, args);
	}

}
