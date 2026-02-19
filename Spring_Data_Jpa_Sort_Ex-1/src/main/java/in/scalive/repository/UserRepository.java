package in.scalive.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.repository.CrudRepository;

import in.scalive.model.User;

public interface UserRepository extends JpaRepository<User, Integer>{
	
	

}
