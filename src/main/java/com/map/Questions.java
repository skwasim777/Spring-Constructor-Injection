package com.map;

import java.util.Iterator;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Set;

public class Questions {
	private int id;
	private String name;
	private Map<Answer, User> answers;

	public Questions(int id, String name, Map<Answer, User> answers) {
		super();
		this.id = id;
		this.name = name;
		this.answers = answers;
	}

	public void desplay() {
		System.out.println("Question id " + id);
		System.out.println("Question name " + name);
		System.out.println("Answers..");
		Set<Entry<Answer, User>> set = answers.entrySet();
		Iterator<Entry<Answer, User>> itr = set.iterator();
		while (itr.hasNext()) {
			Entry<Answer, User> entyr = itr.next();
			Answer ans = entyr.getKey();
			User usr = entyr.getValue();
			System.out.println("Answer Information");
			System.out.println(ans);
			System.out.println("User Information");
			System.out.println(usr);
		}
	}
}
