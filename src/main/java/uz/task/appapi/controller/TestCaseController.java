package uz.task.appapi.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import uz.task.appapi.entity.TestCase;
import uz.task.appapi.service.TestCaseService;

import java.util.List;

@RestController
@RequestMapping("/test-cases")
public class TestCaseController {
    @Autowired
    private TestCaseService testCaseService;

    @GetMapping
    public List<TestCase> getAllTestCases() {
        return testCaseService.getAllTestCases();
    }

    @GetMapping("/problem/{problemId}")
    public List<TestCase> getTestCasesByProblemId(@PathVariable Long problemId) {
        return testCaseService.getTestCasesByProblemId(problemId);
    }

    @GetMapping("/{id}")
    public TestCase getTestCaseById(@PathVariable Long id) {
        return testCaseService.getTestCaseById(id);
    }

    @PostMapping
    public TestCase createTestCase(@RequestBody TestCase testCase) {
        return testCaseService.createTestCase(testCase);
    }

    @PutMapping("/{id}")
    public TestCase updateTestCase(@PathVariable Long id, @RequestBody TestCase testCaseDetails) {
        return testCaseService.updateTestCase(id, testCaseDetails);
    }

    @DeleteMapping("/{id}")
    public void deleteTestCase(@PathVariable Long id) {
        testCaseService.deleteTestCase(id);
    }
}
