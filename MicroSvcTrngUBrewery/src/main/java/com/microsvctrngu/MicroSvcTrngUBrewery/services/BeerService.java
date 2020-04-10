package com.microsvctrngu.MicroSvcTrngUBrewery.services;

import java.util.UUID;

import com.microsvctrngu.MicroSvcTrngUBrewery.web.model.BeerDTO;

public interface BeerService {

	BeerDTO getBeerById(UUID beerId);

}
