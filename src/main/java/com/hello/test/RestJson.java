package com.hello.test;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

import javax.ws.rs.Consumes;
import javax.ws.rs.GET;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

@Path("/students")
public class RestJson {
	@GET
	@Path("/get")
	@Produces(MediaType.APPLICATION_JSON)
	public Student getStudenJSON() {
		Student student = new Student();
		student.setName("Suji");
		student.setId("201372293");
		student.setSemester(3);
		
		Map<String, Integer> scores = new HashMap<String, Integer>();
		scores.put("English", 90);
		scores.put("Math", 85);
		scores.put("Music", 100);
		student.setScores(scores);
		
		Set<String> friends = new HashSet<String>();
		friends.add("min");
		friends.add("pei");
		friends.add("jia");
		student.setFriends(friends);
		return student;
	}
	
	@POST
	@Path("/post")
	@Consumes(MediaType.APPLICATION_JSON)
	public Response createStudentJSON(Student student) {
		String result = "POST Student: " + student;
		return Response.status(201).entity(result).build();
	}

}
