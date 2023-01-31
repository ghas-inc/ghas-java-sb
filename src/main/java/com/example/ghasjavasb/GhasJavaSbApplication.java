package com.example.ghasjavasb;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class GhasJavaSbApplication {

	public static void main(String[] args) {
		SpringApplication.run(GhasJavaSbApplication.class, args);

		// GHAS DEMO
		try {
			String latlonCoords = args[1];
			Runtime rt = Runtime.getRuntime();
			Process exec = rt.exec("cmd.exe /C latlon2utm.exe " + latlonCoords);		
		}
		catch (Exception e) {

		}
	}

}
