# GRADLE-DOCS

          References-
          > https://gradle.org/
          > Gradle plugins - https://plugins.gradle.org/
          > core plugin - https://docs.gradle.org/current/userguide/plugin_reference.html
          > gradle type - https://docs.gradle.org/current/dsl/index.html

          //INSTALLATION
          % brew install gradle
          //verify installation
          % gradle -v or % gradle --version
          
          --> uses Groovy DSL
           
          --> gradle type
                  --> core types 
                  --> publishing type
                  --> container type
                  --> build cache type
                  --> input normalization type
                  --> task type
                  --> reporting type etc...
                 
                  
            Gradle Project File - build.gradle
                    - Project
                             - Task (Initialization - configuration - execution phases)
                                        - Custom Task
                                        - Task Type
                             - plugins
                             - dependencies
                             - properties
              % gradle hello // add a custom task in build.gradle
              % gradle tasks
              % gradle tasks --all
              % gradle task1
              % mkdir src
              % mkdir dest
              % cd src 
              % touch test.java
              % gradle tasks --all
              % tree
              % gradle copyDocs
              % tree
              % gradle deleteDocs
              % tree

#GRADLE APPLICATION DOCUMENTATION

		Student Registration basic application which takes student name, email and dob and stores in db. id auto-generated and email unique key.
		a new student can be resistered using POST request by sending name,email and dob. information can be updated using put request(email and name only)
		implemented functionalities - GET(fetch all), POST(registed a student), PUT(update email and name) and DELETE (by ID)
		Gradle - build tool
		Postgres DB - using docker-compose exposed on 5432
		Spring boot - api backend application (build type jar).
		
#BUILD JAR

                % gradle clean
                % gradle jar
                // jar with SNAPSHOT will be created under
                build/libs
                //to run application on port 8081
                java -jar gradledocumentation-0.0.1-SNAPSHOT.jar --server.port=8081

#Tasks

              > Task :prepareKotlinBuildScriptModel
              > Task :compileJava
              > Task :processResources
              > Task :classes
              > Task :bootJarMainClassName
              > Task :bootJar
              > Task :GradledocumentationApplication.main()

#Dependencies

                implementation 'org.springframework.boot:spring-boot-starter-data-jpa'
	            implementation 'org.springframework.boot:spring-boot-starter-web'
	            compileOnly 'org.projectlombok:lombok'
	            runtimeOnly 'org.postgresql:postgresql'
	            annotationProcessor 'org.projectlombok:lombok'
	            testImplementation 'org.springframework.boot:spring-boot-starter-test'

#Plugins

                id 'org.springframework.boot' version '2.6.2'
                id 'io.spring.dependency-management' version '1.0.11.RELEASE'
                id 'java'

#Properties

                group = 'com.abhilashgd'
                version = '0.0.1-SNAPSHOT'
                sourceCompatibility = '11'

#Configuration

                compileOnly {extendsFrom annotationProcessor}

#DOCKER COMMANDS

		% docker compose up
		//switch to another terminal
		% docker ps
		% docker exec -it 7581260e0770 /bin/bash //where 7581260e0770 is container id
		% psql -h localhost -p 5432 -U abhilashgd
		% \l
		% create database gradledemodb;
		% \l
		% du
		% GRANT ALL PRIVILEGES ON DATABASE gradledemodb TO abhilashgd;
		% \c gradledemodb;
		% \d
		% \dt
        % SELECT * FROM STUDENT;

#APPLICATION.PROPERTIES FOR POSTGRES DB

		spring.datasource.url=jdbc:postgresql://localhost:5432/gradledemodb
		spring.datasource.username=abhilashgd
		spring.datasource.password=password
		spring.jpa.hibernate.ddl-auto=create-drop
		spring.jpa.show-sql=true
		spring.jpa.properties.hibernate.dialect=org.hibernate.dialect.PostgreSQLDialect
		spring.jpa.properties.hibernate.format_sql=true
		
#POSTMAN TESTING

        POST: http://localhost:8080/api/v1/student
        JSON BODY: {"name": "testSubject1", "email": "test1@test.com","dob": "1995-12-17"}

        GET: http://localhost:8080/api/v1/student
        DELETE: http://localhost:8080/api/v1/student/1
        PUT: http://localhost:8080/api/v1/student/1?name=AbhilashGD
        PUT: http://localhost:8080/api/v1/student/1?name=AbhilashGD&email=abhilashgd@test.com
        GET: http://localhost:8080/api/v1/student
