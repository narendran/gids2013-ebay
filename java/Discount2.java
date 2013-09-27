import java.lang.*;
import java.util.*;

//JSR 201: Extending the JavaTM Programming Language with Enumerations, Autoboxing, Enhanced for loops and Static Import
//J2SE 1.5
public class Discount2{
	public static void main (String args[]){

		List<Double> prices = new ArrayList<Double>();
		prices.add(100.0);
		prices.add(150.0);
		prices.add(500.0);
		prices.add(250.0);

		Double sum = 0.0;

		// Find the sum of the discounted prices - 0.9
		for(Double price : prices){
			if(price>200){
			sum += price * 0.9;
			}
		}

		System.out.println(sum);
	}
}