package io.springbootstarter.classes.coursesAPI;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TopicsController {

	@RequestMapping ("/topics")
	public String getTopics (){
		return "Hi";
	}
}
