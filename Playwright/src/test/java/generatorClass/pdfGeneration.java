package generatorClass;

import java.util.Arrays;
import java.util.List;

public class pdfGeneration {

	public static void main(String[] args) {

		List<Integer> intList = Arrays.asList(25,54,8,75,1,48);

		intList.sort((i1,i2) -> i1.compareTo(i2));

		intList.forEach(i -> System.out.println(i));

	}

}
