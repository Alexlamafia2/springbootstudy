package alex.oscure.springboot.learnspringboot2;

// http://localhost:8080/courses
//[{
//    "id":1,
//    "name":"Learn AWS",
//    "author":"in10minutes"
//}]

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Arrays;
import java.util.List;

@RestController
public class CourseController {
    // http://localhost:8080/courses
    @RequestMapping("/courses")
    public List<Course> retrieveAllCourses(){
        return Arrays.asList(
                new Course(1,"Alexey", "Rocket League God"),
                new Course(2,"Chris", "Rocket League God"),
                new Course(3,"Yoandy", "Rocket League Beginner"),
                new Course(4,"Adrian", "My boi been ghosting")
        );
    }
}
