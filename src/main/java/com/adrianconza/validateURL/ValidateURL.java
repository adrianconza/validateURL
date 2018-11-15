package com.adrianconza.validateURL;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class ValidateURL {

	@RequestMapping("/validateURL")
	public URLWrapper validateURL(@RequestParam(value = "url") String url) {
		return new URLWrapper(url);
	}
}
