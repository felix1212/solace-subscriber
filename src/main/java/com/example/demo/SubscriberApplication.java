/*
 *  Change log:
 *  0.0.1 - Initial working one
 */

package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.jms.annotation.EnableJms;

@SpringBootApplication
@EnableJms
public class SubscriberApplication {

	public static void main(String[] args) {
		SpringApplication.run(SubscriberApplication.class, args);
	}

}
