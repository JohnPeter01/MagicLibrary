package br.com.magiclibray.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magiclibray.domain.Set;
import br.com.magiclibray.repositories.SetRepository;
import br.com.magiclibray.service.exception.ObjectNotFoundException;

@Service
public class SetService {

	@Autowired
	private SetRepository repo;

	public Set search(Integer id) {
		Optional<Set> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto com ID: " + id + " não encontrado. Tipo: " + Set.class.getName()));
	}
}
