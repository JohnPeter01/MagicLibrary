package br.com.magiclibray.resources;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import br.com.magiclibray.domain.Format;

@RestController
@RequestMapping(value = "/format")
public class FormatResource {
	
	@RequestMapping(method = RequestMethod.GET)
	public List<Format> list() {
		
		Format standard = new Format();
		standard.setId(1);
		standard.setName("Standard");
		Format modern = new Format();
		modern.setId(1);
		modern.setName("Modern");
		
		List<Format> formats = new ArrayList<Format>();
		formats.add(standard);
		formats.add(modern);
		
		return formats;
	}

}
