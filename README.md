This is a sample project that shows how to use GWT as a frontend to a Java EE 6 / EJB 3.1 application.

Run `mvn package` and deploy the resulting WAR file to your Java EE 6 application server.

The project is based on the GWT sample application with the following modifications:

* `web.xml` is reduced to only define the welcome page
* `GreetingServiceImpl` (the RPC servlet) is renamed to `GreetingServiceServlet` and moved to the `servlet` package
* `GreetingServiceServlet` is declared as a servlet by annotation instead of `web.xml`
* Business logic (creating the greeting string) is placed in a separate EJB (`GreetingBean`) that is injected into the servlet
* The servlet does not return a simple string but an object (`Greeting`) for further exploration of how to expose JPA entities to GWT (TODO)