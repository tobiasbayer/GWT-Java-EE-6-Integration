package com.codebrickie.gwtjee.server.service;

import javax.ejb.Stateless;

import com.codebrickie.gwtjee.domain.Greeting;
import com.codebrickie.gwtjee.shared.FieldVerifier;

@Stateless
public class GreetingBean {

    public Greeting greet(String input, String userAgent, String serverInfo) {

        if (!FieldVerifier.isValidName(input)) {
            throw new IllegalArgumentException("Name must be at least 4 characters long");
        }

        return new Greeting("Hello, " + input + "!<br><br>I am running " + serverInfo
                + ".<br><br>It looks like you are using:<br>" + userAgent);
    }

}
