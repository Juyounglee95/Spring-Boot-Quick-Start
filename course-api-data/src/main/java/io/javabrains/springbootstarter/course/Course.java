package io.javabrains.springbootstarter.course;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.ManyToOne;

import org.hibernate.annotations.ManyToAny;

import io.javabrains.springbootstarter.topic.Topic;

@Entity
public class Course { //entity class
	
	//each one of these member variables should go as colums in that DB, instance -> rows
	
	@Id //mark primary key
	private String id; 
	private String name;
	private String description;
	
	@ManyToOne //Course and topic have 'Many to One' relationship
	private Topic topic;  
	
	
	

	public Course() { //initialize object easier
	
	}
	
	public Course(String id, String name, String description, String topicId) {
		super();
		this.id = id;
		this.name = name;
		this.description = description;
		this.topic = new Topic(topicId, "","");
	}
	
	public Topic getTopic() {
		return topic;
	}

	public void setTopic(Topic topic) {
		this.topic = topic;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	
	
}
