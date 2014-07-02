package com.hello.test;

import java.util.Map;
import java.util.Set;

public class Student {
	private String name;
	private String id;
	private int semester;
	private Map<String, Integer> scores;
	private Set<String> friends;
	
	public Student() {

	}
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public int getSemester() {
		return semester;
	}
	public void setSemester(int semester) {
		this.semester = semester;
	}
	public Map<String, Integer> getScores() {
		return scores;
	}
	public void setScores(Map<String, Integer> scores) {
		this.scores = scores;
	}
	public Set<String> getFriends() {
		return friends;
	}
	public void setFriends(Set<String> friends) {
		this.friends = friends;
	}
	
	@Override
	public String toString() {
		return "Student [name=" + name + ", id=" + id + ", semester="
				+ semester + ", scores=" + scores + ", friends=" + friends
				+ "]";
	}
}
