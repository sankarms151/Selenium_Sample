package sample;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.HashMap;
import java.util.HashSet;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class TestCricket {
	
	/**
	 * This is 
	 */
	public static void test() throws SQLException {
		
	}
	
	public static void acceptNames(List<String> names) {
		System.out.println(names);
		
		//names.remove(6);
		//names.remove("Test");
		
		System.out.println("Advanced mehod!!!");
		Collections.reverse(names);
		
		for(String val : names) {
			System.out.println(val);
		}		
	}	
	
	
	public static void main(String[] args) {
		
		Map<String, Long> phoneBook = new HashMap<>();
		phoneBook.put("Sankar", 654321l);
		phoneBook.put("Sekar", 654321l);
		phoneBook.put("Sekar", 1234l);
		System.out.println(phoneBook);
		
		Set<Integer> mSet = new HashSet<>();
		mSet.add(1);
		mSet.add(2);
		mSet.add(2);
		System.out.println(mSet);
		
		String name1 = "Sankar";
		String name2 = "Shan";
		String name3 = "Sekar";
		String name4 = "Vignesh";
		String name5 = "Vinoth";
		String name6 = "Shankar";
				
		List<String> nameList = new ArrayList<String>();
		nameList.add(name1);
		nameList.add(name2);
		nameList.add(name3);
		nameList.add(name4);
		nameList.add(name5);
		nameList.add(name6);
		nameList.add("Shankar");
		acceptNames(nameList);
		
		/*try {
			Class.forName("");
			test();
		} catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}*/
		
		/*try {
			System.out.println(1/0);
		} catch (Throwable th) {
			throw new RuntimeException("Error while divide numbers!", th);
		}*/
		
		for(int i=1; i <= 10; i++) {
			System.out.println(i);
			if(i >= 5) {
				
				continue;
			}
			
			System.out.println("I'm something special");
		}
		
		
		
		Cricket c = new Cricket("India", 11);
		
		
		System.out.println("Team Name : " + c.getTeamName());
		System.out.println("Team Size : " + c.getTeamSize());
		
		Cricket c1 = new Cricket("Aus", 12);
		
		
		System.out.println("Team Name : " + c1.getTeamName());
		System.out.println("Team Size : " + c1.getTeamSize());
		
		System.out.println(Cricket.getICCName());

	}
	
}
