/**
 * 
 */
package com.lentel.bitcoin.trans.monitor;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;

/**
 * @author lentel
 *
 */

@SpringBootApplication
@MapperScan("com.lentel.bitcoin.trans.db.dao")
@ComponentScan({ "com.lentel.bitcoin.trans.db.service", "com.lentel.bitcoin.trans.db.service.impl",
		"com.lentel.bitcoin.trans.monitor.*" })
//@EnableAutoConfiguration(exclude={DataSourceAutoConfiguration.class})
public class MonitorApplication {

	public static void main(String[] args) {
		SpringApplication.run(MonitorApplication.class, args);
	}
}
