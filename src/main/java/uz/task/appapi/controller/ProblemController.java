package uz.task.appapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.task.appapi.entity.Problem;
import uz.task.appapi.service.ProblemService;

import java.util.List;

@RestController
@RequestMapping("/problems")
public class ProblemController {
    @Autowired
    private ProblemService problemService;

    @GetMapping
    public List<Problem> getAllProblems() {
        return problemService.getAllProblems();
    }

    @GetMapping("/{id}")
    public Problem getProblemById(@PathVariable Long id) {
        return problemService.getProblemById(id);
    }

    @PostMapping
    public Problem createProblem(@RequestBody Problem problem) {
        return problemService.createProblem(problem);
    }

    @PutMapping("/{id}")
    public Problem updateProblem(@PathVariable Long id, @RequestBody Problem problemDetails) {
        return problemService.updateProblem(id, problemDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteProblem(@PathVariable Long id) {
        problemService.deleteProblem(id);
    }
}
