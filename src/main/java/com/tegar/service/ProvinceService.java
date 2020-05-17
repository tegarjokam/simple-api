package com.tegar.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import com.tegar.model.ProvinceResultsModel;

@Service
public class ProvinceService {
	
	public List<ProvinceResultsModel> searchByName(List<ProvinceResultsModel> dataProvince, String name) {
		List<ProvinceResultsModel> searchedData =  new ArrayList<>();
		dataProvince.forEach(data -> {
			boolean isMatch = data.getProvince().toLowerCase().contains(name.toLowerCase());
			if (isMatch) {
				searchedData.add(data);
			}
		});
		return searchedData;
	}
}
