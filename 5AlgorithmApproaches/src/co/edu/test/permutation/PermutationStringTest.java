package co.edu.test.permutation;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.Arrays;

import org.junit.BeforeClass;
import org.junit.Test;

import co.edu.problems.PermutationsString;

public class PermutationStringTest {

	static ArrayList<String> stringTests;
	static ArrayList<String> stringSols;
	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
		stringTests = new ArrayList<String>();
		stringSols = new ArrayList<String>();
		
		stringTests.add("abc");
		stringSols.add("abc, cab, acb, bac, ");
	}

	@Test
	public void test() {
		String temp = "";
		String sol ="";
		boolean eq = false;
	
		for(int i=0; i<stringTests.size();i++) {
			temp = PermutationsString.printArray(PermutationsString.permutations(stringTests.get(i)));
			sol = stringSols.get(i);
			System.out.println(temp + " -- " + sol);
			eq = temp.equals(sol);
			assertTrue(eq);
		}
	}

}
