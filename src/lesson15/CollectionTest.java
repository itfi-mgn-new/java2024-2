package lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;
import java.util.stream.Stream;

public class CollectionTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		final List<String>	l = new ArrayList<>();
	
		l.add("test1");
		l.add(0, "test2");
		for(String item : l) {
			System.err.println("item="+item);
		}
		System.err.println("Size="+l.size());	// l.length
		System.err.println("x[0]="+l.get(0));	// l[0]
		l.set(0, "new string");	// l[0] = "new string";
		
		for(String item : l) {
			System.err.println("item="+item);
		}
//		System.err.println("removed: "+l.remove(0));
		
		final Set<String>	s = new HashSet<>();
	
		s.add("test1");
		s.add("test2");
		s.add("test1");
		
		System.err.println("Set size="+s.size());
		System.err.println("COntains: "+s.contains("test1"));
	
		
		for(String item : s) {
			System.err.println("Item="+item);
		}
		s.remove("test2");
		s.addAll(Arrays.asList("assa","asas","asassa"));
		
		Map<String,String>	map = new HashMap<>();
		
		map.put("test1", "value1");
		map.put("test2", "value2");
		map.put("test1", "value3");
		
		System.err.println("size="+map.size());
		for(Entry<String, String> item : map.entrySet()) {
			System.err.println(item.getKey()+" -> "+item.getValue());
		}
		
		l.stream()
			.filter((f)->f.contains("new"))
			.forEach((f)->{
				System.err.println("REsult="+f);
			});
//		Stream.of("1","10","100")
	}
}
