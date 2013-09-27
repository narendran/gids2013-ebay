import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ArraySort{
	public static void main(String[] args) {
		List<String>  list  = new ArrayList<String>();
		list.add("the");
		list.add("an");
		list.add("these");
		list.add("a");
		list.add("them");

		// Wanna sort it!
		// list.sort(new Comparator<String>(){
		// 	public int compare(String a, String b){
		// 		return a.length() - b.length();
		// 	}
		// });

		list.sort((a, b) -> {return a.length() - b.length();});

		System.out.println(list);
	}
}