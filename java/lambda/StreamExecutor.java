import java.util.List;
import java.util.ArrayList;

public class StreamExecutor {

	public static void main(String args[]){
		List<String> colours = new ArrayList<String> ();
		for(String colour : colours) {
			colour = "Green";
		}
		new StreamExecutor().populateShapes(colours);
	}

	/*public void populateShapes(List<String> colours) {
		for(String c : colours) {
			c = "White";
		}
	}*/

	public void populateShapes(List<String> colours) {
		colours.forEach(s->s="White");
	}
}