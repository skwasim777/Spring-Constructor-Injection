package com.map;

import javax.xml.crypto.Data;

public class Answer {
	private int id;
	private String answer;
	/* private Data postedDate; */

	public Answer(int id, String answer) {
		super();
		this.id = id;
		this.answer = answer;
		/* this.postedDate = postedDate; */
	}

	@Override
	public String toString() {
		return "Answer [id=" + id + ", answer=" + answer + "]";
	}

	
}
