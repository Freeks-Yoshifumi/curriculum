import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Main {

	public static void main(String[] args) {
		
		List<String> array = new ArrayList<String>();
		
		array.add("hoge");
		array.add("pos");
		array.add("foo");
		array.add("bar");
		
		int number = array.indexOf("foo");
		System.out.println("fooのインデックス: "+number);
		 
			
		

		Map<String, Object> map = new HashMap<String, Object>();
		
		map.put("address", "//////");
	    map.put("name", "Kosuke");
        map.put("age", 29);
        for(String key : map.keySet()) {
			System.out.println("key: "+key);
        }	
		for(Object value: map.values()) {
			System.out.println("value: "+value);
			
		}
		Calendar cal = Calendar.getInstance();
		int [] arrayDate = { cal.get(Calendar.YEAR),cal.get(Calendar.MONTH) + 1,cal.get(Calendar.DATE)};
		List<int[]> list = Arrays.asList(arrayDate);
		for(int i : arrayDate) {
			System.out.println(i);
			
		}


	}
	}

