package com.location.location.controller;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import com.location.location.entities.Country;
import com.location.location.service.LocationService;
 
// Controller class
@RestController
public class MyController {
	
	//creating Object of LocationService interface 
	@Autowired
	private LocationService locationService;
	
	// Get Countries list Controller
	@GetMapping("/country")
	public List<Country> getCountrys()
	{
		return this.locationService.getCountrys();
		
	}
	
	// Get specific Country details using id
	@GetMapping("/country/{id}")
	public Country getCountry(@PathVariable String id)
	{
		return this.locationService.getcoutry(Long.parseLong(id));
	}

	//Add Countries
	@PostMapping("Country")
	public Country addCountry(@RequestBody Country country)
	{
		return this.locationService.addCountry(country);
	}
	
	// Update Countries
	@PutMapping("/country")
	public Country updateCountry(@RequestBody Country country)
	{
		return this.locationService.updateCountry(country);
	}
	
	//Delete Country
	
	public ResponseEntity<HttpStatus> deleteCountry(@PathVariable String id)
	{
		try {
			this.locationService.deleteCountry(Long.parseLong(id));
			return new ResponseEntity<>(HttpStatus.OK);
		}catch (Exception e) {
			return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
		}
	}
}
