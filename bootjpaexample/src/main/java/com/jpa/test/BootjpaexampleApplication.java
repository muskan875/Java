package com.jpa.test;


import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entity.User; 

@SpringBootApplication
public class BootjpaexampleApplication {

    public static void main(String[] args) {
    	
        ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
        UserRepository userRepository = context.getBean(UserRepository.class);
        
        User user = new User();
        user.setName("shourya");
        user.setCity("Noida");
        user.setStatus("web developer");
        
        User user1 = new User();
        user1.setName("Neha");
        user1.setCity("Mumbai");
        user1.setStatus("python developer");
        
        
        
      //saving only single user
//        
   //    User user2 = userRepository.save(user1); 
   //     System.out.println(user2);
        
        
        
      // saving multiple entries/object
      
//       List<User> users= List.of(user,user1);
//       Iterable<User> result = userRepository.saveAll(users);
//        
//      result.forEach(Alluser->
//       {
//      	System.out.println(Alluser);
//     });
       
        
        
       
        
        
        //update = the user of id 9
//        Optional<User> optional = userRepository.findById(9);
//        if (optional.isPresent()) {
//            User users = optional.get();
//            users.setName("preeti sharma");
//            User result = userRepository.save(users);
//            System.out.println(result);
//        } else {
//            System.out.println("User not found with id 9");
//        }

        
         
        //how to get data
//        Optional<User> optional = userRepository.findById(2);
//        if (optional.isPresent()) {
//            User users = optional.get();
//            System.out.println(users);
//        } else {
//            System.out.println("User not found with id 2");
//        }

        
        // all data
//        Iterable<User> allUsers = userRepository.findAll();
//        allUsers.forEach(users -> System.out.println(users));


        // delete data
//        userRepository.deleteById(17);
   

    }

}
