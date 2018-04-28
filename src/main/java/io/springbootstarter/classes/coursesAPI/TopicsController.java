package io.springbootstarter.classes.coursesAPI;

import java.util.ArrayList;
import java.util.List;

import org.assertj.core.util.Arrays;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@RequestMapping ("/topics")
	public List <Topics> getTopics (){
		List <Topics> topicsList = new ArrayList<>();
		topicsList.add(new Topics("1", "Test Automation", "Fedric Beta"));		
		topicsList.add(new Topics("2", "Penetration Testing", "Fedric Beta"));		
		topicsList.add(new Topics("3", "jQuery Testing", "Joe San"));		
		return topicsList;
	}
}
