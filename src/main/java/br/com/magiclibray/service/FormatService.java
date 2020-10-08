package br.com.magiclibray.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magiclibray.domain.Format;
import br.com.magiclibray.repositories.FormatRepository;
import br.com.magiclibray.service.exception.ObjectNotFoundException;

@Service
public class FormatService {
	
	@Autowired
	private FormatRepository repo;
	
	public Format search(Integer id) {
		Optional<Format> obj = repo.findById(id);
		return obj.orElseThrow(() -> new ObjectNotFoundException(
				"Objeto com ID: " + id + " não encontrado. Tipo: " + Format.class.getName()));
	}
}
