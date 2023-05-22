package uz.task.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.task.appapi.entity.Category;
import uz.task.appapi.entity.Problem;

import java.util.List;

public interface CategoryRepository extends JpaRepository<Category, Long> {
}
