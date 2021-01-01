package com.jithendra.springbootactuator.health;

import java.net.URL;
import java.net.URLConnection;

import org.springframework.boot.actuate.health.Health;
import org.springframework.boot.actuate.health.HealthIndicator;
import org.springframework.stereotype.Component;

@Component
public class InternetHealthMetrics implements HealthIndicator{

	@Override
	public Health health() {
		return checkInternet()==true?Health.up().withDetail("success code", "Active Internet connection").build():Health.down().withDetail("error code", "InActive Internet connection").build();
		
	}
	
	private boolean checkInternet()
	{
		boolean flag=false;
		try
		{
			URL url=new URL("https://www.google.com");
			URLConnection connection=url.openConnection();
			connection.connect();
			flag=true;
		}catch(Exception e)
		{
			flag=false;
		}
		return flag;
	}

}
