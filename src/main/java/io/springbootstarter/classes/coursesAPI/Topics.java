package io.springbootstarter.classes.coursesAPI;

public class Topics {
	String id;
	String strTopicName;
	String author;
	public Topics() {
		
	}
	public Topics(String id, String strTopicName, String author) {
		super();
		this.id = id;
		this.strTopicName = strTopicName;
		this.author = author;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getStrTopicName() {
		return strTopicName;
	}
	public void setStrTopicName(String strTopicName) {
		this.strTopicName = strTopicName;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
}
