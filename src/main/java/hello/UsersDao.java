package hello;

import org.springframework.data.repository.CrudRepository;

import javax.transaction.Transactional;

@Transactional
public interface UsersDao extends CrudRepository<Users, Long> {
    Users findByEmail(String email);
}