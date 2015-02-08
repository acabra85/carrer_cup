package co.edu.test;

import org.junit.runner.RunWith;
import org.junit.runners.Suite;
import org.junit.runners.Suite.SuiteClasses;

import co.edu.test.exemplify.AngleBetweenHourMinuteTest;
import co.edu.test.exemplify.AngleHourMinutesTo12Test;

@RunWith(Suite.class)
@SuiteClasses({ AngleBetweenHourMinuteTest.class,
		AngleHourMinutesTo12Test.class })
public class AllTests {

}
