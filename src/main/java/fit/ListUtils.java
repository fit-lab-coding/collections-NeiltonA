package fit;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class ListUtils {

	public static List<String>sort(List<String> itens, Comparator<String> comp){
		List<String> sorted = new ArrayList<>(List.copyOf(itens));
		sorted.sort(comp);
		
		return sorted;
	}
}
