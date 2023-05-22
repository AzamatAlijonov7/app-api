package uz.task.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.task.appapi.entity.Category;
import uz.task.appapi.entity.User;

public interface UserRepository extends JpaRepository<User, Long> {
}
