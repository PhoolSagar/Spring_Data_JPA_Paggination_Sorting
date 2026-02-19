package in.scalive.service;

import java.util.List;
import java.util.Optional;
import java.util.SortedMap;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Sort;
import org.springframework.stereotype.Service;

import in.scalive.model.User;
import in.scalive.repository.UserRepository;

@Service
public class UserService {

	private UserRepository repo;

	@Autowired
	public UserService(UserRepository repo) {
		this.repo = repo;
	}

	public List<User> getUsersSortedBySal() {
		Sort sort = Sort.by("sal");
		return repo.findAll(sort);
	}
	
	public List<User> obtainUsersSortedBySal() {
		Sort sort = Sort.by("sal").descending();
		return repo.findAll(sort);
	}

	public List<User> getUsersSortedBySalAndName() {
		Sort sort = Sort.by("sal","name");
		return repo.findAll(sort);
	}
	
	public List<User> fetchUsersSortedByName(){
//		Sort.Order obj = Sort.Order.asc("name");
//		Sort sort = Sort.by(obj);
		
		Sort sort = Sort.by(Sort.Order.asc("name"));
		return repo.findAll(sort);
	}
	
	//when salary will same then descending of name
	public List<User> fetchUsersSortedByNameAndSal(){		
		Sort sort = Sort.by(Sort.Order.desc("sal"), Sort.Order.desc("name") );
		return repo.findAll(sort);
	}
	
	
	

}
