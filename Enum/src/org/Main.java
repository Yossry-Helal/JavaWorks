package org;

import java.util.EnumSet;

public class Main {

	public static void main(String[] args) {
		/*
		 * isWeekend(Day.Thursday); }
		 * 
		 * public static void isWeekend(Day day) { switch (day) { case Thursday:
		 * System.out.println("اليوم في اول الاسبوع"); break; case Friday:
		 * System.out.println("اليوم في نهاية الاسبوع"); break; default:
		 * System.out.println("اليوم في وسط الاسبوع"); break; }
		 */
		
		for(Book book:Book.values()) {
			System.out.println(book+" "+book.getTitle()+ " "+ book.getPublishYear());
		}
		System.out.println("آول ٣ عناصر");
		for(Book book:EnumSet.range(Book.JAVA1, Book.ALGO)) {
			System.out.println(book+" "+book.getTitle()+ " "+ book.getPublishYear());
		}
		
	}

}
