package com.hp.javapgms;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TestSolution {
	private static final String CSV_1_PATH = "C:\\Users\\Palla\\Downloads\\1.csv";
	private static final String CSV_2_PATH = "C:\\Users\\Palla\\Downloads\\2.csv";
	private static final String OUTPUT_CSV_PATH = "C:\\Users\\Palla\\Downloads\\my_output.csv";

	public void combineFiles( File csv1, File csv2, File outputFile ) throws Exception {
		try {
            // Read the first CSV file
            BufferedReader file1Reader = new BufferedReader(new FileReader(csv1));
            Map<String, String> file1Map = new HashMap<>();
            String line;
            while ((line = file1Reader.readLine()) != null) {
                String[] parts = line.split(",");
                String key = parts[0].trim();
                String value = String.join(",", Arrays.copyOfRange(parts, 1, parts.length)).trim();
                file1Map.put(key, value);
            }
            file1Reader.close();

            // Read the second CSV file and combine with the first CSV file
            BufferedReader file2Reader = new BufferedReader(new FileReader(csv2));
            BufferedWriter writer = new BufferedWriter(new FileWriter(outputFile));
            while ((line = file2Reader.readLine()) != null) {
                String[] parts = line.split(",");
                String key = parts[0].trim();
                String value = String.join(",", Arrays.copyOfRange(parts, 1, parts.length)).trim();
                if (file1Map.containsKey(key)) {
                    String combinedLine = key + "," + file1Map.get(key) + "," + value + "\n";
                    writer.write(combinedLine);
                }
            }
            file2Reader.close();
            writer.close();

        } catch (IOException e) {
            e.printStackTrace();
        }
	}

	public static void main( String[] args ) {

		try {

			File csv1 = new File( CSV_1_PATH );
			File csv2 = new File( CSV_2_PATH );
			File output = new File( OUTPUT_CSV_PATH );

			TestSolution solution = new TestSolution( );
			solution.combineFiles( csv1, csv2, output );

		} catch ( Exception e ) {
			e.printStackTrace( );
		}
	}

}
