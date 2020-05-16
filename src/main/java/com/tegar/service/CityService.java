package com.tegar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tegar.model.CityResultsModel;

@Service
public class CityService {

	public List<CityResultsModel> searchByName(List<CityResultsModel> dataCity, String name) {
		List<CityResultsModel> searchedData =  new ArrayList<>();
		dataCity.forEach(data -> {
			System.out.println(data.getCity_name());
			System.out.println(data.getCity_name().equalsIgnoreCase(name));
			
			boolean isMatch = data.getCity_name().toLowerCase().contains(name.toLowerCase());
			System.out.println(isMatch);
			if (isMatch) {
				searchedData.add(data);
			}
		});
		return searchedData;
	}
	
	
}
