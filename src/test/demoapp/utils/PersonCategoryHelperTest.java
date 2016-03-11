package demoapp.utils;

import java.util.Calendar;
import java.util.Date;

import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;

public class PersonCategoryHelperTest {
  private int x = 0;
	@Test
	public void verifyRookieLevel(){		
		//Today
		Date testDate = new Date();		
		String result = PersonCategoryHelper.GetPersonCategory(testDate);
		String expectedResult = "Rookie";		
		assertEquals(result, expectedResult);
		
	}
	
	@Test
	public void verifyMidLevel(){		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());		
		cal.add(Calendar.DAY_OF_YEAR, -366);		
		Date testDate = cal.getTime();		
		
		String result = PersonCategoryHelper.GetPersonCategory(testDate);
		String expectedResult = "Midlevel";		
		assertEquals(result, expectedResult);
		
	}
	
	@Test
	public void verifyNinjaLevel(){		
		Calendar cal = Calendar.getInstance();
		cal.setTime(new Date());		
		cal.add(Calendar.DAY_OF_YEAR, -731);		
		Date testDate = cal.getTime();		
		
		String result = PersonCategoryHelper.GetPersonCategory(testDate);
		String expectedResult = "Ninja!";		
		assertEquals(result, expectedResult);
		
	}
	
}
