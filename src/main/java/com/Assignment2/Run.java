package com.Assignment2;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import com.google.gson.Gson;
import com.google.gson.GsonBuilder;

public class Run {
	private Scanner in_value = null;
	private String data1 = null;
	private String data2 = null;
	private Companies p = null;
	public void running() {
		
		List<String> company_wth_keypeople = new ArrayList<>();
		List<Double> fax_list = new ArrayList<>();
		List<String> url_list = new ArrayList<>();
		// Iterator <String> it = ex.iterator();
		File txt = new File("assignment.json");
		Display d = new Display();
		Reg reg = new Reg();
		
	
		try {
			in_value = new Scanner(txt);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			System.out.println("File not found");
		}
		BufferedWriter br = null;
		Gson gson = new GsonBuilder().create();
		try {
			br = new BufferedWriter(new FileWriter(new File("assignment_file.txt")));

			while (in_value.hasNext()) {
				data1 = in_value.nextLine();
				int a = data1.indexOf(",");
				data2 = data1.substring(a + 1, data1.length());
				p = gson.fromJson(data2, Companies.class);

				if (p.getKeyPeople().size() > 0) {
					company_wth_keypeople.add(p.getCompany());
				}

				if (!p.getWeburl().isEmpty()) {
					url_list.add(reg.regex(p));
				}

				if (!p.getFax().isEmpty()) {
					fax_list.add(Double.valueOf(p.getFax()));
				}

				br.write(p.getCompany() + ":" + p.getDescription() + "\n");
			}

			br.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		d.show(company_wth_keypeople, "Companies with keypeople!!!");
		d.show(fax_list, "Fax!!!");
		d.show(url_list, "Domains!!!");
		System.out.println(url_list.size());
	}
	
	
	
	}
	

