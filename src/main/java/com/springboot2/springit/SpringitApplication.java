package com.springboot2.springit;

import com.springboot2.springit.domain.Comment;
import com.springboot2.springit.domain.Link;
import com.springboot2.springit.repositories.CommentRepository;
import com.springboot2.springit.repositories.LinkRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.data.jpa.repository.config.EnableJpaAuditing;

@SpringBootApplication
@EnableJpaAuditing
public class SpringitApplication {

	private static final Logger log = LoggerFactory.getLogger(SpringitApplication.class);
	public static void main(String[] args) {
		SpringApplication.run(SpringitApplication.class, args);
	}

//	@Bean
	CommandLineRunner runner(LinkRepository linkRepository, CommentRepository commentRepository){
		return args ->{
			Link link = new Link("Getting Started with Spring Boot 2","https://therealdanvega.com/spring-boot-2");
			linkRepository.save(link);

			Comment comment = new Comment("This is Spring Boot 2 link is awesome",link);
			commentRepository.save(comment);
			link.addComment(comment);


			System.out.println("We just inserted a link and a comment");
			System.out.println("=======================================");

		};
	}

}
