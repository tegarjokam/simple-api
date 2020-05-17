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
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

import com.tegar.model.CityModel;
import com.tegar.model.CityResultsModel;
import com.tegar.service.CityService;

@RestController
@RequestMapping("/api/rest/v1/city")
public class CityController {
	
	@Value("${api.key}")
	private String apiKey;
	
	@Autowired
	private RestTemplate restTemplate;
	
	@Autowired
	private CityService cityService;
	
	/**
	 * test City data from RajaOngkir API
	 * 
	 * @return
	 */
	@GetMapping("/test")
	public ResponseEntity<String> getCity() {
		HttpHeaders headers = new HttpHeaders();
		headers.set("key", apiKey);
		HttpEntity<String> entity = new HttpEntity<>(headers);
		
		ResponseEntity<String> response = 
				restTemplate.exchange("https://api.rajaongkir.com/starter/city", HttpMethod.GET, entity, String.class);
		return response;
	}
	
	/**
	 * Search City by Name in RajaOngkir API
	 * 
	 * @param name
	 * @return
	 */
	@GetMapping
	@ResponseBody
	public List<CityResultsModel> searchCityByName(@RequestParam(name = "name") String name) {
		HttpHeaders headers = new HttpHeaders();
		headers.set("key", apiKey);
		HttpEntity<CityModel> entity = new HttpEntity<>(headers);
		
		ResponseEntity<CityModel> response = 
				restTemplate.exchange("https://api.rajaongkir.com/starter/city", HttpMethod.GET, entity, CityModel.class);

		return cityService.searchByName(response.getBody().getRajaongkir().getResults(), name);
	}

}
