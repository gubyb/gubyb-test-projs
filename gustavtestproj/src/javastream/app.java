package javastream;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class app {

	public static void main(String[] args) {
		List<String> streamList  = new ArrayList<>();
		
		streamList.add("");
		streamList.add("Hej");
		streamList.add("");
		streamList.add("Heys");
		
		List<String> filter = streamList.stream().filter(s -> !"".equals(s)).collect(Collectors.toList());
		
		for(String s : filter){
			System.out.println("Printing entry: " +  s);
		}

	}

}
