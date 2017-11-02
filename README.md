This is a simple REST program with Hibernate and MySQL as back end. For REST, I have used Apache-CXF for JAX-RS implementation. 
Application.java is the only endpoint it has. Here maven is used as the build tool. Jetty as the server.

For running,
1. Make sure you have made the necessary changes in the jpa-appContext for the database connection.
2. Go the project directory and run mvn clean install in the cmd for cleaning the project
3. For running, type mvn jetty:run
4. Once the server is up successfully, go to any REST client, and send a GET command as follow
  http://localhost:8080/name/1
5. If you have a user with id 1, you can see the respose contains his firstname and secondname.


If you have any doubt, pls comment here

