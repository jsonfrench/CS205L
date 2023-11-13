package edu.monmouth.properties;
import java.io.*;
import java.util.*;

public class DriveProperties {

	public static void main(String[] args) {
		Properties properties = new Properties();
		try {
			properties.load(new BufferedReader(new FileReader(args[0])));
		} catch (FileNotFoundException e) {
			e.printStackTrace();
			System.exit(-1);
		} catch (IOException e) {
			e.printStackTrace();
			System.exit(-1);
		}
		
		System.out.printf(properties.getProperty("mascot"));
	}

}
