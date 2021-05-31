package spring.rest.jap.app.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import spring.rest.jap.app.model.Users;

public interface UserRepository extends JpaRepository<Users, Integer> {

}
