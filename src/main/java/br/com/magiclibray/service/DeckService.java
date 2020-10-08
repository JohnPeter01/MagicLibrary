package br.com.magiclibray.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magiclibray.domain.Deck;
import br.com.magiclibray.repositories.DeckRepository;
import br.com.magiclibray.service.exception.ObjectNotFoundException;

@Service
public class DeckService {
	
	@Autowired
	private DeckRepository repo;
	
	public Deck search(Integer id) {
		Optional<Deck> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto com ID: " + id + " não encontrado. Tipo: " + Deck.class.getName()));
	}
}
