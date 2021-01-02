package site.mvnr.DemoJS;

import org.springframework.boot.SpringApplication;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RestController;

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
