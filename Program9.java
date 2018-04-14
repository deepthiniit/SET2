package com.niit;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Program9 {
	public static int mmDD(String s1,String s2) throws ParseException{
		SimpleDateFormat sdf=new SimpleDateFormat("yyyy-MM-dd");
		Calendar c=Calendar.getInstance();
		Date d1=sdf.parse(s1);
		Date d2=sdf.parse(s2);
		c.setTime(d1);
		int m1=c.get(Calendar.MONTH);
		int y1=c.get(Calendar.YEAR);
		c.setTime(d2);
		int m2=c.get(Calendar.MONTH);
		int y2=c.get(Calendar.YEAR);
		int n=(y1-y2)*12+(m1-m2);
		return n;
	}
	public static void main(String[] args){
		String s1=new String("2013-12-01");
		String s2=new String("2012-01-03");
		try {
			System.out.println(mmDD(s1,s2));
		} catch (ParseException e) {
			
			e.printStackTrace();
		}
	}

}
