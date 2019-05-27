package sg.edu.nus.gitdemo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GitdemoApplication {

	public static void main(String[] args) {
		SpringApplication.run(GitdemoApplication.class, args);
	}

	//Hello, Testing...1, 2, 3...
	
	public static void method( ) {
		System.out.println("This is a random mesage");
	}
	
	public static void testError() {
		System.out.println("How to use git hub");
	}
}


