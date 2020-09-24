package br.com.magiclibray.resources;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping(value = "/format")
public class FormatResource {
	@RequestMapping(method = RequestMethod.GET)
	public String list() {
		return "Format Working";
	}

}
