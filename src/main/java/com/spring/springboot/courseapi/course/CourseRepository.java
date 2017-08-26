package com.spring.springboot.courseapi.course;

import java.util.List;
import org.springframework.data.repository.CrudRepository;

public interface CourseRepository extends CrudRepository<Course, String>{
	//getAllTopics()
	//getTopic(String id)
	//updateTopic(Topic t)
	//deleteTopic(String id)
	// these are standard crud operations for every entity
	
	public List<Course> findByName(String name);
	public List<Course> findByDescription(String description);
	public List<Course> findByTopicId(String topicId);
	
	
	

}
