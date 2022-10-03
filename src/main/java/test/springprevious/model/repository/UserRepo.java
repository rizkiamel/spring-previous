package test.springprevious.model.repository;

import java.util.Optional;

import org.springframework.data.repository.PagingAndSortingRepository;

import test.springprevious.model.entity.User;

public interface UserRepo extends PagingAndSortingRepository<User, Long>{
    static Optional<User> findByEmail (String email){
        return null;
    }
}
