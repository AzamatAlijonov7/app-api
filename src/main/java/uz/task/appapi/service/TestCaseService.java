package uz.task.appapi.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.task.appapi.entity.TestCase;
import uz.task.appapi.repository.TestCaseRepository;

import java.util.List;

@Service
public class TestCaseService {
    @Autowired
    private TestCaseRepository testCaseRepository;

    public List<TestCase> getAllTestCases() {
        return testCaseRepository.findAll();
    }

    public List<TestCase> getTestCasesByProblemId(Long problemId) {
        return testCaseRepository.findByProblemId(problemId);
    }

    public TestCase getTestCaseById(Long id) {
        return testCaseRepository.findById(id).orElseThrow();
    }

    public TestCase createTestCase(TestCase testCase) {
        return testCaseRepository.save(testCase);
    }

    public TestCase updateTestCase(Long id, TestCase testCaseDetails) {
        TestCase testCase = testCaseRepository.findById(id).orElseThrow();
        testCase.setInput(testCaseDetails.getInput());
        testCase.setOutput(testCaseDetails.getOutput());
        return testCaseRepository.save(testCase);
    }

    public void deleteTestCase(Long id) {
        TestCase testCase = testCaseRepository.findById(id).orElseThrow();
        testCaseRepository.delete(testCase);
    }
}
