package uz.task.appapi.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.task.appapi.entity.TestCase;

import java.util.List;

public interface TestCaseRepository extends JpaRepository<TestCase, Long> {
    List<TestCase> findByProblemId(Long problemId);
}
