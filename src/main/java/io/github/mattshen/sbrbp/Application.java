package io.github.mattshen.sbrbp;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.support.SpringBootServletInitializer;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.core.env.Environment;
import org.springframework.security.config.annotation.method.configuration.EnableGlobalMethodSecurity;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableAuthorizationServer;
import org.springframework.security.oauth2.config.annotation.web.configuration.EnableResourceServer;
import org.springframework.web.WebApplicationInitializer;

@SpringBootApplication
@ComponentScan({
	"io.github.mattshen.sbrbp.services",
	"io.github.mattshen.sbrbp.controller",
	"io.github.mattshen.sbrbp.config"
})
@EnableResourceServer
@EnableGlobalMethodSecurity(prePostEnabled = true)
public class Application extends SpringBootServletInitializer implements WebApplicationInitializer {
	
	private static final Logger	LOG	= Logger.getLogger(Application.class);
	
	@Autowired
	private Environment env;

	public static void main(String[] args) {
		SpringApplication.run(Application.class, args);
	}

}