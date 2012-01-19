package com.codebrickie.gwtjee.server.servlet;

import javax.ejb.EJB;
import javax.servlet.annotation.WebServlet;

import com.codebrickie.gwtjee.client.GreetingService;
import com.codebrickie.gwtjee.domain.Greeting;
import com.codebrickie.gwtjee.server.service.GreetingBean;
import com.google.gwt.user.server.rpc.RemoteServiceServlet;

/**
 * The server side implementation of the RPC service.
 */
@SuppressWarnings("serial")
@WebServlet(urlPatterns = { "/GWTJEE/greet" })
public class GreetingServiceServlet extends RemoteServiceServlet implements GreetingService {

    @EJB
    private GreetingBean greetingBean;

    public Greeting greetServer(String input) throws IllegalArgumentException {
        String serverInfo = escapeHtml(getServletContext().getServerInfo());
        String userAgent = escapeHtml(getThreadLocalRequest().getHeader("User-Agent"));

        return greetingBean.greet(input, userAgent, serverInfo);
    }

    /**
     * Escape an html string. Escaping data received from the client helps to
     * prevent cross-site script vulnerabilities.
     * 
     * @param html
     *            the html string to escape
     * @return the escaped string
     */
    private String escapeHtml(String html) {
        if (html == null) {
            return null;
        }
        return html.replaceAll("&", "&amp;").replaceAll("<", "&lt;").replaceAll(">", "&gt;");
    }
}
