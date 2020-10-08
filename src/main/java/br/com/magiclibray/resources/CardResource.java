package br.com.magiclibray.resources;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.magiclibray.service.CardService;

@RestController
@RequestMapping(value = "/card")
public class CardResource {
	
	@Autowired
	private CardService service;
	
	@RequestMapping(value = "/{id}", method = RequestMethod.GET)
	public ResponseEntity<?> find(@PathVariable Integer id) {
		return ResponseEntity.ok().body(service.search(id));
	}

}
