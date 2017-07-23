package sbauth.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import sbauth.model.User;

/**
 * Created by quchy on 22/07/2017.
 */
public interface UserRepository extends JpaRepository<User, Long> {




}
