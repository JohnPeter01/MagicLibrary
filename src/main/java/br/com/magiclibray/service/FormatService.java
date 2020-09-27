package br.com.magiclibray.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import br.com.magiclibray.domain.Format;
import br.com.magiclibray.repositories.FormatRepository;

@Service
public class FormatService {
	
	@Autowired
	private FormatRepository repo;
	
	public Format search(Integer id) {
		return repo.findById(id).orElse(null);
	}
}
