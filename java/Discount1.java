import java.lang.*;
import java.util.*;

public class Discount1{
	public static void main (String args[]){

		List<Double> prices = new ArrayList<Double>();
		prices.add(100.0);
		prices.add(150.0);
		prices.add(500.0);
		prices.add(250.0);

		Double sum = 0.0;

		// Find the sum of the discounted prices - 0.9
		for(int i=0;i<prices.size();i++){
			if(prices.get(i)>200){
				sum += prices.get(i) * 0.9;
			}
		}

		System.out.println(sum);
	}
}