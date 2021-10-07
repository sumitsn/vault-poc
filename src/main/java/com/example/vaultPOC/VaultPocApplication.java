package com.example.vaultPOC;

import com.example.vaultPOC.configuration.VaultConfiguration;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
@EnableConfigurationProperties(VaultConfiguration.class)
public class VaultPocApplication {

	private static Logger log = LoggerFactory.getLogger(VaultPocApplication.class);

	public static VaultConfiguration vault ;

	public static void main(String[] args) {


		ConfigurableApplicationContext context = SpringApplication.run(VaultPocApplication.class, args);


		vault = context.getBean(VaultConfiguration.class);
		log.info("password : "+vault.getPass());
//		log.info("user name : "+vault.getUsername());
//		System.out.println(vault.getPass());
//		System.out.println(vault.getUsername());
	}

}
