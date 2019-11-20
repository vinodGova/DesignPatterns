package com.json.parser;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.StringTokenizer;

public class VinodJsonParserBuilder {

	public HashMap parse(String path) {
		HashMap hm = new HashMap<>();
		File f = new File(path);
		try {
			BufferedReader br = new BufferedReader(new FileReader(f));
			String line = br.readLine();
			// String[] a=new String[(int) f.length()];

			while (line != null) {
				int index = line.indexOf(":");
				if (index > 1) {

					String key = line.substring(1, index - 1);

					String firstValue = line.substring(index + 1, index + 2);

					switch (firstValue) {

					case "[":
						String[] values = (line.substring(index + 3, line.length() - 1).split(","));
						hm.put(key, values);
						break;

					case "{":

					default:
						String value = line.substring(index + 1, line.length() - 1);
						hm.put(key, value);
						break;

					}

					/*
					 * Object values=(line.substring(index+1,line.length()-1));
					 * System.out.println(key); System.out.println(values);
					 */

				}
				line = br.readLine();
			}

		} catch (IOException e) {
		}
		return hm;
	}

	public static VinodJsonParserBuilder newInstance() {
		return new VinodJsonParserBuilder();
	}

}
