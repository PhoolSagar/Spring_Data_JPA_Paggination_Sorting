package in.scalive.runner;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.stereotype.Component;

import in.scalive.model.User;
import in.scalive.service.UserService;



@Component
public class MyCommandlineRunner implements CommandLineRunner {

	@Autowired
	private UserService serv;

	@Override
	public void run(String... args) throws Exception {
		
		int indx = 0;
		
		while(true) {
			List<User> users = serv.getUsersPagginated(indx);
			
			if(users  == null)
				break;
			
			System.out.println("Page Number : " + indx);
			
			indx++;
			
			System.out.println("===================================");
			for(User u : users) {
				System.out.println(u);
			}
			System.out.println();
		}

		
		
 	}

}
