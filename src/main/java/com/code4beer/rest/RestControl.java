package com.code4beer.rest;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.code4beer.neo4j.NeoDao;

@RestController
public class RestControl {

	private static final Logger log = LoggerFactory.getLogger(RestControl.class);

	private NeoDao dao;

	public RestControl(NeoDao neoDao) {
		this.dao = neoDao;
	}

	@RequestMapping("/neo")
	public String neo(@RequestParam(value = "name", defaultValue = "4j") String name) {
		log.info("logged");
		return "neo" + name;
	}

	@RequestMapping("/movie")
	public String movie(@RequestParam(value= "name", defaultValue = "Cloud Atlas") String name) {
		log.info("Movie");
		String result = dao.movie(name);
		return result;
	}

}
