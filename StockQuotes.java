/**
 * 
 * @author Prasad Kudtarkar
 *
 * 
 */

import java.io.*;
import java.util.*;

public class StockQuotes {

	public static void main(String[] args) {
		
		Scanner kbd = new Scanner(System.in);
		String file = kbd.nextLine();
		
		long startTime = System.nanoTime();
		
		
		BufferedReader in = null;
		try {
			//in = new BufferedReader(new FileReader("C:/Users/Prasad_/Desktop/StockData/sampledata.txt"));
			in = new BufferedReader(new FileReader(file));
		} catch (FileNotFoundException e) {
			System.out.println("File Not Found :(");
			System.exit(0);
		}
		String str;

		List<Double> list = new ArrayList<Double>();
		try {
			while((str = in.readLine()) != null){
			    list.add(Double.parseDouble(str));
			}
		} catch (NumberFormatException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		//System.out.println(list);

		Double[] data = list.toArray(new Double[0]);
		
		plot(data);
		pattern(data);
		
		long endTime = System.nanoTime();
		System.out.println("Took "+(endTime - startTime) + " ns");
		
		//Took6405359 ns in total for all all four parts
	}

	private static void plot(Double[] data) {
		for(int i=0; i<data.length; i++) {
			for(int j=1; j<Math.floor(data[i]); j++) {
				System.out.print("*");
			}
			System.out.println();
		}
		
	}
	
	private static void pattern(Double[] data) {
		for(int i=0; i<4; i++) {
			System.out.println(data[i]);
		}
		for(int i=0,j=1,k=2,l=3,m=4; i<data.length-4; i++,j++,k++,l++,m++) {
			System.out.print(data[m]);
			if(data[i]>data[j] && data[j]>data[k] && data[k]>data[l] && data[l]<data[m]) {
				System.out.print("\tbuy\n");
			}
			else if(data[i]<data[j] && data[j]<data[k] && data[k]<data[l] && data[l]>data[m]) {
				System.out.print("\tsell\n");
			}
			else
				System.out.println();
		}
	}

}
