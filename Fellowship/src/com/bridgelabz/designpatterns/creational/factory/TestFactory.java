package com.bridgelabz.designpatterns.creational.factory;

public class TestFactory {

	public static void main(String[]args) {
		Computer pc= ComputerFactory.getComputer("PC", "2GB", "2.4 GHz", "500 GB");
		Computer server= ComputerFactory.getComputer("Server", "16 GB","2.9 GHz", "1TB");
		System.out.println("Factory server Config: "+pc);
		System.out.println("Factory Server Config: "+server);
	}

}
