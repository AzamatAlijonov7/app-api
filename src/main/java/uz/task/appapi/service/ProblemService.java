package uz.task.appapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.task.appapi.entity.Problem;
import uz.task.appapi.repository.ProblemRepository;

import java.util.List;

@Service
public class ProblemService {
    @Autowired
    private ProblemRepository problemRepository;

    public List<Problem> getAllProblems() {
        return problemRepository.findAll();
    }

    public Problem getProblemById(Long id) {
        return problemRepository.findById(id).orElseThrow();
    }

    public Problem createProblem(Problem problem) {
        return problemRepository.save(problem);
    }

    public Problem updateProblem(Long id, Problem problemDetails) {
        Problem problem = problemRepository.findById(id).orElseThrow();
        problem.setName(problemDetails.getName());
        problem.setDescription(problemDetails.getDescription());
        problem.setCategory(problemDetails.getCategory());
        return problemRepository.save(problem);
    }

    public void deleteProblem(Long id) {
        Problem problem = problemRepository.findById(id).orElseThrow();
        problemRepository.delete(problem);
    }
}
