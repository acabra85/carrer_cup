package exemplify;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.LocalTime;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.problems.Exemplify;

public class AngleBetweenHourMinuteTest {

	static ArrayList<LocalTime> times;
	static ArrayList<String> angles;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		times = new ArrayList<LocalTime>();
		angles = new ArrayList<String>();
		
		times.add(LocalTime.parse("15:30:00"));
		angles.add("90.0");
		
		times.add(LocalTime.parse("21:15:00"));
		angles.add("180.0");
		
		times.add(LocalTime.parse("21:30:00"));
		angles.add("90.0");
		
		times.add(LocalTime.parse("17:35:00"));
		angles.add("60.0");
		
		times.add(LocalTime.parse("11:25:00"));
		angles.add("180.0");	
		
		times.add(LocalTime.parse("5:55:00"));
		angles.add("180.0");	
		
		times.add(LocalTime.parse("23:50:00"));
		angles.add("30.0");			
		
		times.add(LocalTime.parse("22:55:00"));
		angles.add("30.0");
		
		times.add(LocalTime.parse("22:53:00"));
		angles.add("18.0");	
		
		times.add(LocalTime.parse("22:54:00"));
		angles.add("24.0");
		
		times.add(LocalTime.parse("22:52:00"));
		angles.add("12.0");		
		
		times.add(LocalTime.parse("22:51:00"));
		angles.add("6.0");			
	}

	@Test
	public void test() {
		String res = "";
		String stored = "";
		boolean eq = false;
		for(int i = 0; i<times.size();i++){
			res = Exemplify.getAngleBetweenHourMinute(times.get(i).getHourOfDay(), times.get(i).getMinuteOfHour());
			stored = angles.get(i);
			eq = res.equals(stored);
			System.out.println(res + " --- " + stored + " --> :" + eq);
			assertTrue(eq);			
		}
	}

}
