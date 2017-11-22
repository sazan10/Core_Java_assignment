package com.Assignment2;

import java.util.ArrayList;

public class Companies {
	private String company;
	private String description;
	private ArrayList<Key> keyPeople;
	private String fax;
	private String weburl;

	Companies() {
		weburl = "";
	}

	public String getCompany() {
		return company;
	}

	public void setCompany(String company) {
		this.company = company;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	@Override
	public String toString() {
		return company + " - " + description;
	}

	public ArrayList<Key> getKeyPeople() {
		return keyPeople;
	}

	public void setKeyPeople(ArrayList<Key> keyPeople) {
		this.keyPeople = keyPeople;
	}

	public String getFax() {
		return fax.replace("-", "");

	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getWeburl() {
		return weburl;
	}

	public void setWeburl(String weburl) {
		this.weburl = weburl;
	}

}