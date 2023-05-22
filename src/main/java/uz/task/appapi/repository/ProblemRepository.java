package uz.task.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.task.appapi.entity.Problem;
import uz.task.appapi.entity.TestCase;

import java.util.List;

public interface ProblemRepository extends JpaRepository<Problem, Long> {
    List<Problem> findByCategoryId(Long categoryId);
}
