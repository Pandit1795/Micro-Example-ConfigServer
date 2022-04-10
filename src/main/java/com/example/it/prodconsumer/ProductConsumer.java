package com.example.it.prodconsumer;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.cloud.client.ServiceInstance;
import org.springframework.cloud.client.loadbalancer.LoadBalancerClient;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;

@Component
public class ProductConsumer {
	
	@Autowired
	private LoadBalancerClient client;
	
	
	public String getDataFormProduct() {
		//go to eureka to get MS#details(serviceInstance)
		ServiceInstance si=client.choose("PRODUCT-SERVICE");
		
		//read URI(IP/PORT) and make URL by adding path
		String url=si.getUri()+"employee/data";
		
		//use restTemplate and make call
		RestTemplate rt=new RestTemplate();
		
		ResponseEntity<String> response=rt.getForEntity(url,String.class);
		// return thr response
		return response.getBody();
	}
	
	

}
