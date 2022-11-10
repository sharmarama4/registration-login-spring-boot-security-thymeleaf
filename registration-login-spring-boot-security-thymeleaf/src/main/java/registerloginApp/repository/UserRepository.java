package registerloginApp.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import org.springframework.stereotype.Repository;
import registerloginApp.model.User;

@Repository
public interface UserRepository extends JpaRepository<User,Long> {
 /*   @Query("SELECT u FROM User u WHERE u.email =?1")
    User findByEmail(@Param("email") String email);*/
   User findByEmail(String email);
}
