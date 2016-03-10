package demoapp.utils;

import java.util.Date;

public class PersonCategoryHelper {

	public static String GetPersonCategory(Date hireDate){
		
		Date today = new Date();
		
		int daysBetween = (int) ((today.getTime() - hireDate.getTime()) / (1000 * 60 * 60 * 24));
		
		String result = "Derp";
		
		if(daysBetween <= 365)
			result = "Rookie";
		if(daysBetween > 365 && daysBetween < 730)
			result = "Midlevel";
		if(daysBetween >= 730)
			result = "Ninja!";
				
		return result;
		
	}
	
}
