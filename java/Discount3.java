import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Discount3{
	public static void main (String args[]){

		List<Double> prices = new ArrayList<Double>();
		prices.add(100.0);
		prices.add(150.0);
		prices.add(500.0);
		prices.add(250.0);

		Double sum ;

		// Find the sum of the discounted prices - 0.9
		sum=  prices.stream().filter(p->p>200).map(p-> p * 0.9).reduce(0.0, (a,b)->a+b);

		System.out.println(sum);
	}
}