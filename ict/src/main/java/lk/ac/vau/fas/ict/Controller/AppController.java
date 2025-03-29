package lk.ac.vau.fas.ict.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import lk.ac.vau.fas.ict.model.Student;


@RestController
@Controller
@RequestMapping("/app")
public class AppController{
    @GetMapping("/age/{ag}")
    public String MyAge(@PathVariable("ag") int age) {
        return "My Age is: "+age;
    }

    List <Student> students = new ArrayList<Student>();
    Student s1 = new Student("Ict01","John",23,"ICT",3.7);
    Student s2 = new Student("Ict02","Alice",22,"ICT",3.2);
    Student s3 = new Student("Ict03","Bob",24,"CS",2.9);
    Student s4 = new Student("Ict04","Johnny",23,"ICT",3.5);

    {
        students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);
    }
    
@GetMapping("/student")
public Student getStudent(){
    return s1;
}

@GetMapping("/students")
public List<Student> getStudents(){
    
    return students;
}

@GetMapping("/student/{id}")
public Student getStudent(@PathVariable("id") String regno){
    for(Student student:students){
        if(student.getRegNo().equals(regno)){
            return student;
        }
    }
    return null;
}

@GetMapping("/age-range")
public List<Student> getStudentByAge() {
    List<Student> result = new ArrayList<>();
    for (Student student : students) {
        if (student.getAge() >= 20 && student.getAge() <= 23) {
            result.add(student);
        }
    }
   return result; 

}

@GetMapping("/sorted-gpa")
public List<Student> getStuByGPA(){
    List<Student> sortedList = new ArrayList<>(students);
    sortedList.sort((s1,s2)->Double.compare(s2.getGpa(), s1.getGpa()));
    return sortedList;
}

@PostMapping("/add")
public Student addStudent(@RequestBody Student student){
    students.add(student);
    return student;
}


@PutMapping("/update/{id}")
    public Student updateStudent(@PathVariable("id") String regNo, @RequestBody Student updatedStudent) {
        for (int i = 0; i < students.size(); i++) {
            if (students.get(i).getRegNo().equals(regNo)) {
                students.set(i, updatedStudent);
                return updatedStudent;
            }
        }
        return null;
    }
    @DeleteMapping("/delete/{id}")
    public String deleteStudent(@PathVariable("id") String regNo) {
        students.removeIf(student -> student.getRegNo().equals(regNo));
        return "Student with ID " + regNo + " deleted successfully.";
    }
}