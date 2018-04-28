package io.springbootstarter.classes.coursesAPI;

import java.util.ArrayList;
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
	
	public List <Topics> getAllTopics ()
	{
		topicsList = new ArrayList<>();;
		topicsList.add(new Topics("22", "Test Automation", "Fedric Beta"));		
		topicsList.add(new Topics("2", "Penetration Testing", "Fedric Beta"));		
		topicsList.add(new Topics("3", "jQuery Testing", "Joe San"));		
		return topicsList;	
	}
	
}
