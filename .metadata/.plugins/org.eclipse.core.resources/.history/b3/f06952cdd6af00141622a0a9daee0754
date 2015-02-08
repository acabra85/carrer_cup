package co.edu.test;

import static org.junit.Assert.*;

import java.util.ArrayList;

import org.joda.time.LocalTime;
import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.problems.Exemplify;

public class AngleHourMinutesTo12Test {

	static ArrayList<LocalTime> times;
	static ArrayList<String> angles;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		times = new ArrayList<LocalTime>();
		angles = new ArrayList<String>();
		
		times.add(LocalTime.parse("10:45:00"));
		angles.add("300.0:270.0");
		
		times.add(LocalTime.parse("11:15:00"));
		angles.add("330.0:90.0");
		
		times.add(LocalTime.parse("13:15:00"));
		angles.add("30.0:90.0");
		
		times.add(LocalTime.parse("12:20:00"));
		angles.add("0.0:120.0");		
		
	}

	@Test
	public void test() {
		String resMins = "";
		String resHours = "";
		String stored = "";
		boolean eq = false;
		for(int i = 0; i<times.size();i++){
			resHours = Exemplify.getHourAngleRespectiveTo12(times.get(i).getHourOfDay())+"";
			resMins  =  Exemplify.getMinuteAngleRespectiveTo12(times.get(i).getMinuteOfHour())+"";
			stored = angles.get(i);
			eq = (resHours+":"+resMins).equals(stored);
			System.out.println((resHours+":"+resMins) + " --- " + stored + " --> :" + eq);
			assertTrue(eq);			
		}
	}

}
