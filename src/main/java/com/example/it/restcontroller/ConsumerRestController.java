package com.example.it.restcontroller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.it.prodconsumer.ProductConsumer;

@RestController
@RequestMapping("/order")
public class ConsumerRestController {
	@Autowired
	private ProductConsumer consumer;
	
@GetMapping("/data")

public ResponseEntity<String> fetchDta(){
	
	String data=consumer.getDataFormProduct();
	return new ResponseEntity<String>("FROM ORDER!!!"+data, HttpStatus.OK);
	
}
	
	
}
