package com.tegar.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
@RequestMapping("/api/rest/v1/province")
public class ProvinceController {

	@Autowired
	private RestTemplate restTemplate;
	
	@Value("${api.key}")
	private String apiKey;
	
	@GetMapping("/")
	public ResponseEntity<String> getProvince() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("key", apiKey);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> response = 
				restTemplate.exchange("https://api.rajaongkir.com/starter/province", HttpMethod.GET, entity, String.class);
		return response;
	}
}