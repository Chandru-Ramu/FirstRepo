package lamdaExpression;

import java.util.ArrayList;
import java.util.List;

public class simpleLamda {

	public static void main(String[] args) {
		List<Integer> numb = new ArrayList<>();

		numb.add(25);
		numb.add(48);
		numb.add(23);
		numb.add(78);

		numb.forEach((numList) -> System.out.println(numList*10));
	}

}
