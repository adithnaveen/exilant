package com.training.exilant.restfulworks.user;

import java.net.URI;
import java.util.List;

import static org.springframework.hateoas.mvc.ControllerLinkBuilder.methodOn;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.hateoas.Resource;
import org.springframework.hateoas.mvc.ControllerLinkBuilder;
import org.springframework.hateoas.mvc.ControllerLinkBuilderFactory;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.support.ServletUriComponentsBuilder;

import com.training.exilant.restfulworks.exception.UserNotFoundException;

// users - give users - GET 
// user/{userId}  - gives 1 users - GET  
// users -POST - insert a user 

@RestController
public class UserResource {
	@Autowired
	private UserDAOService userService;
	
	
	@GetMapping("/users")
	public List<User> getAllUsers(){
		return userService.getAllUsers(); 
	}
	
	@GetMapping("/usersold/{userId}")
	public User getOneUser(@PathVariable int userId) {
		User getUser = userService.getUser(userId);

		if(getUser == null) {
			throw new UserNotFoundException("id - " + userId); 
		}

		return  getUser; 
	}
	//////////////////////////////////////////////////////////
	
	
	// will give  the user + give the reference links to the caller 
	// with additional links 
	

	// give the link for getting all users 
	// with meta data "all-users" 
	// SERVER-PATH + "/users" 
	
	@GetMapping("/users/{userId}")
	public Resource<User> getOneUserv2(@PathVariable int userId) {
		User getUser = userService.getUser(userId);

		if(getUser == null) {
			throw new UserNotFoundException("id - " + userId); 
		}

		Resource<User> resource = new Resource<User>(getUser);
		ControllerLinkBuilder linkTo = 
				new ControllerLinkBuilderFactory().
					linkTo(methodOn(this.getClass()).getAllUsers()); 
		
		ControllerLinkBuilder linkTo1 = 
				new ControllerLinkBuilderFactory().
					linkTo(methodOn(this.getClass()).getOneUser(userId)); 
		
		resource.add(linkTo.withRel("all-users"));
		resource.add(linkTo1.withRel("get-another-way"));
		
		return  resource; 
	}
	
	
	
	
	

	@PostMapping("/users")
	public Resource<User> createUser(@RequestBody User user) {
		User savedUser = userService.saveUser(user); 
		
		
		ControllerLinkBuilder linkTo = 
				new ControllerLinkBuilderFactory().
				linkTo(methodOn(this.getClass()).
						getOneUser(savedUser.getUserId())); 
		

		Resource<User> resource = new Resource<User>(savedUser); 
		
		resource.add(linkTo.withRel("select-user"));

		return resource; 

	}
	
	
	@PostMapping("/usersv2")
	public ResponseEntity<Object> createUserResponseCode(@RequestBody User user) {
		User savedUser = userService.saveUser(user); 

		URI location = ServletUriComponentsBuilder.fromCurrentRequest()
				.path("/{userId}")
				.buildAndExpand(savedUser.getUserId()).toUri(); 
		
		return ResponseEntity.created(location).build(); 
	}
	
}









