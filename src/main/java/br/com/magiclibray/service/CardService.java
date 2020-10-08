package br.com.magiclibray.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magiclibray.domain.Card;
import br.com.magiclibray.repositories.CardRepository;
import br.com.magiclibray.service.exception.ObjectNotFoundException;

@Service
public class CardService {

	@Autowired
	private CardRepository repo;

	public Card search(Integer id) {
		Optional<Card> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto com ID: " + id + " não encontrado. Tipo: " + Card.class.getName()));
	}
}
