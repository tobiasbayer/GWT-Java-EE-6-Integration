package com.codebrickie.gwtjee.domain;

import java.io.Serializable;

@SuppressWarnings("serial")
public class Greeting implements Serializable {
	private String greetingText;

	public void setGreetingText(String greetingText) {
		this.greetingText = greetingText;
	}

	public String getGreetingText() {
		return greetingText;
	}
}
