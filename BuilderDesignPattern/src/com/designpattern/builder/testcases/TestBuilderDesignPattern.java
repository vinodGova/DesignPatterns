package com.designpattern.builder.testcases;

import com.designpattern.builder.Computer;

public class TestBuilderDesignPattern {

	public static void main(String[] args) {
		Computer comp=new Computer.ComputerBuilder("500 GB","4 GB").setBluetoothEnabled(true).setGraphicsCardEnabled(true).build();
	   System.out.println(comp);
	}
}
