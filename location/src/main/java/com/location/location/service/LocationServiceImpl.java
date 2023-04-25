package com.location.location.service;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.location.location.entities.Country;

import location.location.dao.CountryDao;

@Service
public class LocationServiceImpl implements LocationService {

	@Autowired
	private CountryDao countrydao;

	@Override
	public List<Country> getCountrys() {
		
		return countrydao.findAll();
		}

	@SuppressWarnings("deprecation")
	@Override
	public Country getcoutry(long id) {
	
		return countrydao.getOne(id);
	}

	@Override
	public Country addCountry(Country country) {
		
		countrydao.save(country);
		return country;
	}

	@Override
	public Country updateCountry(Country country) {
		
		countrydao.save(country);
		return country;
	}

	@Override
	public void deleteCountry(long ParseLong) {
		@SuppressWarnings("deprecation")
		Country entity= countrydao.getOne(ParseLong);
		countrydao.delete(entity);
		
		
		
	}
	
	
	
	
	
}
