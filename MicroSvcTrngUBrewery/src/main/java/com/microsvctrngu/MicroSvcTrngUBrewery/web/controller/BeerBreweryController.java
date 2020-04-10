package com.microsvctrngu.MicroSvcTrngUBrewery.web.controller;

import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.microsvctrngu.MicroSvcTrngUBrewery.services.BeerService;
import com.microsvctrngu.MicroSvcTrngUBrewery.web.model.BeerDTO;

@RestController
@RequestMapping("/api/beer")
public class BeerBreweryController {

	@Autowired
	private BeerService beerService;
	
	@GetMapping("/{beerId}")
	public ResponseEntity<BeerDTO> getBeer(@PathVariable UUID beerId) {
		
		return new ResponseEntity<BeerDTO> (beerService.getBeerById(beerId), HttpStatus.OK);
	}
}
