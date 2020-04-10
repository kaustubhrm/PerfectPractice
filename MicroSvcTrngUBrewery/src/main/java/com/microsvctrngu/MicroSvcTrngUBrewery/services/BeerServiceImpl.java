package com.microsvctrngu.MicroSvcTrngUBrewery.services;

import java.util.UUID;

import org.springframework.stereotype.Service;

import com.microsvctrngu.MicroSvcTrngUBrewery.web.model.BeerDTO;

@Service
public class BeerServiceImpl implements BeerService {

	@Override
	public BeerDTO getBeerById(UUID beerId) {
		return BeerDTO.builder().id(UUID.randomUUID())
				.beerName("Kingfisher Ultra")
				.beerStyle("Smooth")
				.build();
	}

}
