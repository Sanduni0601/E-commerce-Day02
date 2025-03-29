package lk.ac.vau.fas.ict.Controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
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

    Student s1 = new Student("Ict01","John",23,"ICT",3.7);
    Student s2 = new Student("Ict02","Alice",25,"ICT",3.2);
    Student s3 = new Student("Ict03","Bob",24,"CS",2.9);
    Student s4 = new Student("Ict04","Johnny",23,"ICT",3.5);

    List <Student> students = new ArrayList<Student>();
@GetMapping("/student")
public Student getStudent(){
    return s1;
}

@GetMapping("/students")
public List<Student> getStudents(){
    students.add(s1);
    students.add(s2);
    students.add(s3);
    students.add(s4);

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
}