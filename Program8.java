package com.niit;

import java.text.SimpleDateFormat;
import java.util.Date;

public class Program8 {
	public static String mmdd(Date d1){
		SimpleDateFormat sdf=new SimpleDateFormat("MMMM");
		String s=(sdf.format(d1));
		return s;
	}
	public static void main(String[] args) {
		Date d1=new Date(23/01/2012);
		System.out.println(mmdd(d1));
	}

}
