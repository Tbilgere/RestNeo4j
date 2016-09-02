package com.code4beer.neo4j;

import java.util.List;
import java.util.Map;

import org.springframework.jdbc.core.JdbcTemplate;

import com.code4beer.config.ApplicationProps;

public class NeoDao {

	private JdbcTemplate template;

	private ApplicationProps appProps;

	public NeoDao(ApplicationProps appProps, JdbcTemplate jdbcTemplate) {
		this.appProps = appProps;
		this.template = jdbcTemplate;
	}

	public String movie(String name) {
		List<Map<String, Object>> results = template.queryForList(appProps.getSqlQueryMovie(), name);
		String returnValue = "";
		for (Map<String, Object> mapped : results) {
			for (Object res : mapped.values()) {
				returnValue += (String) res;
				returnValue += "\n";
			}
		}
		return returnValue;
	}

}
