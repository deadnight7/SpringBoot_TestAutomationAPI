package io.springbootstarter.classes.coursesAPI;

import javax.persistence.Entity;
import javax.persistence.Id;

/**
 * In order to prsist the bean to a database we need to identify the entity to JPA by identifying it as a @Entity Annotation
 * Also we need to tell what is the primary key associated for this primary key? by marking the field level annotation by @Id 
 * 
 * @author chiragpandit
 *
 */

@Entity
public class Topics {
	
	@Id
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
