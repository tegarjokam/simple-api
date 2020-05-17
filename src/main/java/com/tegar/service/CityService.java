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
			boolean isMatch = data.getCity_name().toLowerCase().contains(name.toLowerCase());
			if (isMatch) {
				searchedData.add(data);
			}
		});
		return searchedData;
	}
	
	
}
