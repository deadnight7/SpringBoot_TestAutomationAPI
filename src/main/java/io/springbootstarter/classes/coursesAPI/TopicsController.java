package io.springbootstarter.classes.coursesAPI;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@Autowired
	TopicService topicService;

	@RequestMapping ("/topics")
	public List <Topics> getTopics (){
/*
 * 		List <Topics> topicsList = new ArrayList<>();

		topicsList.add(new Topics("1", "Test Automation", "Fedric Beta"));		
		topicsList.add(new Topics("2", "Penetration Testing", "Fedric Beta"));		
		topicsList.add(new Topics("3", "jQuery Testing", "Joe San"));		
		return topicsList;
 */		
		//Use a service bean to get all topics from ANY Data source, 
		//So that the controller need not be changed whenever there is a change in the data layer
		return topicService.getAllTopics();
	}
	
	@RequestMapping("/topics/{id}")
	public Topics getTopic (@PathVariable("id") String strTopicID)
	{
		//How do we return messages / error status codes back?
		return topicService.getTopicById(strTopicID);
	}
	
	@RequestMapping (method=RequestMethod.POST, value="/topics")
	public void addTopic (@RequestBody Topics topic){
		topicService.addTopic (topic);
	}
}
