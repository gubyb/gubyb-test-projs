package fallbackmaker;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class FallbackAngleMaker {
	
	final static String string1 = "defaultDamMediaAngleA";
	final static String string2 = ":$productCatalog:$version";

	public static void main(String[] args) {
		String fallbackCode1 = "front";
		List<String> fallBackAngles1 = new ArrayList<String>(Arrays.asList("1C","1L","1R","2C","2L","2R","8C","8L","8R","7C","7L","7R","3C","3L","3R","9C","9L","9R"));
		String fallbackCode2 = "fromLeft";
		List<String> fallBackAngles2 = new ArrayList<String>(Arrays.asList("2C","2L","2R","3C","3L","3R","1C","1L","1R","8C","8L","8R","7C","7L","7R","9C","9L","9R"));
		String fallbackCode3 = "fromTop";
		List<String> fallBackAngles3 = new ArrayList<String>(Arrays.asList("3C","3L","3R","2C","2L","2R","1C","1L","1R","8C","8L","8R","7C","7L","7R","9C","9L","9R"));
		String fallbackCode4 = "fromBehind";
		List<String> fallBackAngles4 = new ArrayList<String>(Arrays.asList("7C","7L","7R","1C","1L","1R","2C","2L","2R","8C","8L","8R","3C","3L","3R","9C","9L","9R"));
		
		Map <String, List<String>> fallbacks = new HashMap<String, List<String>>();
		fallbacks.put(fallbackCode1, fallBackAngles1);
		fallbacks.put(fallbackCode2, fallBackAngles2);
		fallbacks.put(fallbackCode3, fallBackAngles3);
		fallbacks.put(fallbackCode4, fallBackAngles4);

		for(Entry<String, List<String>> entry :  fallbacks.entrySet()){
			StringBuilder impexRow = new StringBuilder(";");
			impexRow.append(entry.getKey());
			List<String> fallbackAngles = entry.getValue();
			Iterator<String> fallBackAnglesIterator = fallbackAngles.iterator();
			impexRow.append(";");
			while(fallBackAnglesIterator.hasNext()){
				impexRow.append(string1 + fallBackAnglesIterator.next() + string2);
				if(fallBackAnglesIterator.hasNext()){
					impexRow.append(",");
				}
			}
			System.out.println(impexRow);
		}
		
	}

}
