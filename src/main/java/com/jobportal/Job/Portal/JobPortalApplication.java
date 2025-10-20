package com.jobportal.Job.Portal;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.scheduling.annotation.EnableScheduling;

@SpringBootApplication
@EnableScheduling
public class JobPortalApplication {

	public static void main(String[] args) {
		SpringApplication.run(JobPortalApplication.class, args);
	}

}


//
//package com.jobportal.Job.Portal;
//
//import com.jobportal.Job.Portal.entity.User;
//import com.jobportal.Job.Portal.dto.AccountType;
//import com.mongodb.client.MongoClients;
//import com.mongodb.client.MongoClient;
//import com.mongodb.client.MongoDatabase;
//import com.mongodb.client.MongoCollection;
//import org.bson.Document;
//import org.springframework.boot.SpringApplication;
//import org.springframework.boot.autoconfigure.SpringBootApplication;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.context.annotation.Bean;
//
//@SpringBootApplication
//public class JobPortalApplication {
//
//    public static void main(String[] args) {
//        SpringApplication.run(JobPortalApplication.class, args);
//    }
//
//    @Bean
//    CommandLineRunner init() {
//        return args -> {
//            User user = new User();
//            user.setName("Test User");
//            user.setEmail("test@example.com");
//            user.setPassword("password");
//            user.setAccountType(AccountType.APPLICANT);
//
//            try (MongoClient mongoClient = MongoClients.create("mongodb://localhost:27017")) {
//                MongoDatabase database = mongoClient.getDatabase("job_portal");
//                MongoCollection<Document> collection = database.getCollection("user");
//                Document doc = new Document("name", user.getName())
//                        .append("email", user.getEmail())
//                        .append("password", user.getPassword())
//                        .append("accountType", user.getAccountType().toString());
//                collection.insertOne(doc);
//                System.out.println("User inserted in DB: " + doc.toJson());
//            }
//        };
//    }
//}