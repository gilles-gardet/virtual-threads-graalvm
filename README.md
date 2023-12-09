# Virtual Threads

> [!TIP]  
> To run the application using docker-compose, use the `local` Spring profile.

To benchmark the application, set the maximum number of threads to 10 `server.tomcat.threads.max: 10`.  
Then run the following benchmarks using Apache Bench (**ab**).    
```shell
ab -n 60 -c 20 -m GET http://localhost:8080/api/post/8080/api/posts/7f557a93-b788-4795-9bc0-8bb5c7ae998a
```
You can then test the application with the virtual threads by commenting the tomcat threads and using the following property `spring.threads.virtual.enabled: true` which allows Tomcat to natively use the virtual threads from Java 21.  
> [!NOTE]  
> You can also use the `hey` tool if you prefer  
> ex: `hey -n 60 -c 20 -m GET http://localhost:8080/api/posts/7f557a93-b788-4795-9bc0-8bb5c7ae998a`

Then run the same command as above and compare the results.


To build the application with GraalVM using Gradle, use the command `.gradlew nativeCompile`.
