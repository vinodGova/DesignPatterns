package com.json.parser;

import java.util.HashMap;

public class TestClass {

	public static void main(String[] args) {
		VinodJsonParserBuilder builder=VinodJsonParserBuilder.newInstance();
		HashMap map=builder.parse("//home//ubuntu//Downloads//demo.json");
		System.out.println(map);
	}
}
