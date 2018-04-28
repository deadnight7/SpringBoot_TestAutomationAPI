package io.springbootstarter.classes.coursesAPI;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.stereotype.Service;


/**
 * Any class annotated with @Service are singletons in Spring 
 * 
 * The variables of the Service Class needs to be annotated with @Autowired
 * Spring will create an instance of the bean at runtime and will inject from the source to this dependency
 * 
 * Doing this will make your classes / code loosely coupled, Any changes to controller will not affect the bean and vice versa
 * 
 * @author chiragpandit
 *
 */
@Service
public class TopicService {
	private List <Topics> topicsList;
/*
	Arrays.asList(
			new Topics("1", "Test Automation", "Fedric Beta"),
			new Topics("2", "Android Development", "Fedric"),
			new Topics("3", "jQuery", "Joe"),
			new Topics("4", "Selenium", "Joe San"),
			new Topics("5", "TestNG", "Beaust"),
			new Topics("5", "Appium", "Fhil"),
			new Topics("5", "Spring Boot", "Java Brains - Koushik"));
*/
	
	public TopicService (){
		topicsList = new ArrayList<>();
		topicsList.add(new Topics("1", "Test Automation", "Fedric Beta"));
		topicsList.add(new Topics("2", "Android Development", "Fedric"));
		topicsList.add(new Topics("3", "jQuery", "Joe"));
		topicsList.add(new Topics("4", "Selenium", "Joe San"));
		topicsList.add(new Topics("5", "TestNG", "Beaust"));
		topicsList.add(new Topics("5", "Appium", "Fhil"));
		topicsList.add(new Topics("5", "Spring Boot", "Java Brains - Koushik"));
		
	}
	
	public List <Topics> getAllTopics ()
	{
		return topicsList;	
	}
	
	public Topics getTopicById (String strID)
	{
		for (int i = 0; i < topicsList.size(); i++) {
			Topics t = topicsList.get(i);
			if (t.id.equals(strID))
			{
				return t;
			}
		}
		return null;	//How do we return messages / error status codes back?
	}

	public void addTopic(Topics topic) {
		topicsList.add(topic);
	}
	
	
}
