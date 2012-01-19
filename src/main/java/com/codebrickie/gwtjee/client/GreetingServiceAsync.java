package com.codebrickie.gwtjee.client;

import com.codebrickie.gwtjee.domain.Greeting;
import com.google.gwt.user.client.rpc.AsyncCallback;

public interface GreetingServiceAsync {
	void greetServer(String name, AsyncCallback<Greeting> callback);
}
