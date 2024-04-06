package week4.databaseex;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
public class StudentJJpaResource {
    private final StudentJJpaRepository repository;

    public StudentJJpaResource(StudentJJpaRepository repository) {
        this.repository = repository;
    }

    @PostMapping("/students")
    public void createStudent(@RequestBody Student student){
        repository.save(student);
    }

    @GetMapping("/studentts")
    public List<Student> getALLStudents(){
        return this.repository.findAll();
    }

    @GetMapping("/students/{id}")
    public ResponseEntity<Student> getStudents(@PathVariable long id){
        Optional<Student> student = repository.findById(id);

        return student.map(ResponseEntity::ok).orElseGet(() -> ResponseEntity.notFound().build());
    }

    @PatchMapping("/students/{id}")
    public void patchStudent(@RequestBody Student updatedStudent, @PathVariable long id){
        Optional<Student> optionalStudent = repository.findById(id);
        Student student = optionalStudent.get();

        if(updatedStudent.getName() != null){
            student.setName(updatedStudent.getName());
        }

        if(updatedStudent.getGrade() != null){
            student.setGrade(updatedStudent.getGrade());
        }

        repository.save(student);
    }
}
