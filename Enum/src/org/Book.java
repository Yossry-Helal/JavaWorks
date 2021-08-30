package org;

public enum Book {

	JAVA1("Java programming 1", "2010"),
	JAVA2("Advanced Java programing","2015"),
	ALGO("Algorithms Book","2008"),
	SQL("SQL and database","2003");
	
	private final String title;
	private final String publishYear;
	private Book(String title, String publishYear) {
		this.title = title;
		this.publishYear = publishYear;
		}
	public String getTitle() {
		return title;
	}
	public String getPublishYear() {
		return publishYear;
	}
	
	
	
}
