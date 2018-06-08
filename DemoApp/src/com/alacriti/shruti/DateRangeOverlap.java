package com.alacriti.shruti;

import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;

public class DateRangeOverlap {

	public static void main(String[] args) {
		ArrayList<DateRangeVO> dateList1 = new ArrayList<>();
		ArrayList<DateRangeVO> dateList2 = new ArrayList<>();
		DateRangeVO drv1 = new DateRangeVO();
		DateRangeVO drv2 = new DateRangeVO();
		
		drv1.setStartDate(new SimpleDateFormat("dd/MM/yyyy"));
		drv1.setEndDate(new SimpleDateFormat("dd/MM/yyyy"));
		dateList1.add(drv1);
		
		drv2.setStartDate(new SimpleDateFormat("dd/MM/yyyy"));
		drv2.setEndDate(new SimpleDateFormat("dd/MM/yyyy"));
		dateList2.add(drv2);
		
		//(StartA <= EndB) and (StartB <= EndA) and (StartA <= EndA) and (StartB <= EndB) 
		
		
	}
}
