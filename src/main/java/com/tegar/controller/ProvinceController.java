package com.tegar.controller;

import java.util.List;

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

import com.tegar.model.ProvinceModel;
import com.tegar.model.ProvinceResultsModel;

@RestController
@RequestMapping("/api/rest/v1/province")
public class ProvinceController {

	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@GetMapping("/")
	public ResponseEntity<String> getProvince() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("key", apiKey);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> response = 
				restTemplate.exchange("https://api.rajaongkir.com/starter/province", HttpMethod.GET, entity, String.class);
		return response;
	}
	
	@GetMapping("/getObject")
	public List<ProvinceResultsModel> tryToGetObject() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("key", apiKey);
		HttpEntity<ProvinceModel> entity = new HttpEntity<>(headers);
		
		ResponseEntity<ProvinceModel> response = 
				restTemplate.exchange("https://api.rajaongkir.com/starter/province", HttpMethod.GET, entity, ProvinceModel.class);
		
		return response.getBody().getRajaongkir().getResults();
	}
}