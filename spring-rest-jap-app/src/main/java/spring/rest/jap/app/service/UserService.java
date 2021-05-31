package spring.rest.jap.app.service;

import java.util.List;
import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import spring.rest.jap.app.model.Users;
import spring.rest.jap.app.repository.UserRepository;

@Service
public class UserService {
	
	
	private UserRepository userRepository;
	@Autowired
	public UserService(UserRepository userRepository) {
		this.userRepository = userRepository;
	}
	
	public Users findUserById(Integer id) {
		Optional<Users> findById = userRepository.findById(id);
//		if(findById.isPresent()) {
//			return findById.get();
//		}else {
//			return new Users();//return empty user
//		}
		
		return findById.isPresent()==true?findById.get():new Users();
		
	}
	
	public List<Users> findAllUsers(){
		return userRepository.findAll();
	}
	

}
