package com.code4beer.config;

import org.springframework.beans.factory.annotation.Value;

public class ApplicationProps {

	@Value("${neo.url}")
	private String neoUrl;

	@Value("${neo.username}")
	private String neoUsername;

	@Value("${neo.password}")
	private String neoPassword;

	@Value("${sql.query.movie}")
	private String sqlQueryMovie;

	public String getNeoUrl() {
		return neoUrl;
	}

	public String getNeoUsername() {
		return neoUsername;
	}

	public String getNeoPassword() {
		return neoPassword;
	}

	public String getSqlQueryMovie() {
		return sqlQueryMovie;
	}

}
