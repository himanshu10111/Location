package com.location.location.service;

import java.util.List;
import com.location.location.entities.Country;


public interface LocationService {

	public List<Country> getCountrys();
	public Country getcoutry(long id);
	public Country addCountry(Country country);
	public Country updateCountry(Country country);
	public void deleteCountry(long  ParseLong);
}
